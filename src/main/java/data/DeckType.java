package data;

public enum DeckType {

  TRAVEL_OPTIONS(1, "travel_options"),
  THEMES(2, "themes"),
  ACTIVITIES(3, "activities"),
  LOCATIONS(4, "locations");

  private final String deckType;
  private final int index;

  DeckType(int index, String deckType) {
    this.index = index;
    this.deckType = deckType;
  }

  @Override
  public String toString() {
    return deckType;
  }

  public static DeckType getDeckType(int ind) {
    for (DeckType type : values()) {
      if (type.index == ind) {
        return type;
      }
    }
    return null;
  }
}
