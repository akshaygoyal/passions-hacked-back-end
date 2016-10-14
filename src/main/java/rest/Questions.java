package rest;

import com.google.gson.Gson;
import data.Card;
import data.Deck;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Questions {

  @RequestMapping("/questions/{state}")
  public String getNextSetOfQuestions(@PathVariable("state") String state) {

    Deck deck = new Deck();

    for(int i = 0 ; i < 3; i++) {
      Card card = new Card();
      card.setId(i);
      card.setDesc("");
      card.setId(i);
    }


    String json = (new Gson()).toJson(deck);
    return json;
  }


}
