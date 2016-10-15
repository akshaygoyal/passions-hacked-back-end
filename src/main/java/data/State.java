package data;

import java.util.List;

public class State {

  String start_date;
  String end_date;
  double budget;
  DeckType deckType;
  List<String> interests;

  public State(String start_date, String end_date, double budget, DeckType deckType, List<String> interests) {
    this.start_date = start_date;
    this.end_date = end_date;
    this.budget = budget;
    this.deckType = deckType;
    this.interests = interests;
  }

  public String getStart_date() {
    return start_date;
  }

  public void setStart_date(String start_date) {
    this.start_date = start_date;
  }

  public String getEnd_date() {
    return end_date;
  }

  public void setEnd_date(String end_date) {
    this.end_date = end_date;
  }

  public double getBudget() {
    return budget;
  }

  public void setBudget(double budget) {
    this.budget = budget;
  }

  public DeckType getDeckType() {
    return deckType;
  }

  public void setDeckType(DeckType deckType) {
    this.deckType = deckType;
  }

  public List<String> getInterests() {
    return interests;
  }

  public void setInterests(List<String> interests) {
    this.interests = interests;
  }
}
