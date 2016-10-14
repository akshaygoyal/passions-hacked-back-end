package rest;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import data.Card;
import data.Deck;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Questions {

  private List<Card> cards;

  @RequestMapping("/questions/{state}")
  public String getNextSetOfQuestions(@PathVariable("state") String state) {

    Deck deck = new Deck();

    List<Card> cards = getCards();
    deck.setCards(cards);
    String json = (new Gson()).toJson(deck);
    return json;
  }


  public List<Card> getCards() {
    ClassLoader classLoader = getClass().getClassLoader();
    InputStream stream = classLoader.getResourceAsStream("themes.txt");

    int i = 0;
    List<Card> cards = new ArrayList<Card>();
    Scanner scanner = new Scanner(stream);

    while (scanner.hasNextLine()) {
      String[] line = scanner.nextLine().split(",");
      Card card = new Card();
      card.setId(i);
      card.setDesc(line[0]);
      card.setImage_url(line[1]);
      cards.add(card);
      i++;
    }
    scanner.close();
    return cards;
  }
}
