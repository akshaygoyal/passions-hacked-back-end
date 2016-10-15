package rest;

import java.util.List;

import com.google.gson.Gson;
import data.Card;
import data.Deck;
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



    Deck deck = new Deck();
    List<Card> cards = MockUtil.getCards();
    deck.setCards(cards);
    String json = (new Gson()).toJson(deck);
    return json;
  }

}
