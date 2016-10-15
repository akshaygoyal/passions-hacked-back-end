package rest;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import data.Card;
import data.Deck;
import data.State;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import util.MockUtil;

@RestController
public class QuestionsApi {

  private List<Card> cards;

  @RequestMapping(path = "/questions", method = RequestMethod.POST)
  public String getNextSetOfQuestions(@RequestBody final String state) {


    Gson gson = new GsonBuilder().create();
    State currState = gson.fromJson(state, State.class);

    List<Card> cards = new ArrayList<Card>();
    switch (currState.getDeckType()) {
      case TRAVEL_OPTIONS:
        cards = MockUtil.getTravelOptions();
        break;
      case THEMES:
        cards = MockUtil.getThemes();
        break;
      case ACTIVITIES:
        cards = MockUtil.getActivities();
        break;
      case LOCATIONS:
        cards = MockUtil.getLocations();
        break;
    }

    Deck deck = new Deck();
    deck.setCards(cards);
    String json = (new Gson()).toJson(deck);
    return json;
  }

}
