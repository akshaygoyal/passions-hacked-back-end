package data;

import java.util.List;

public class Hotels {

  private List<Hotels> hotels;

  public Hotels(List<Hotels> hotels) {
    this.hotels = hotels;
  }

  public List<Hotels> getHotels() {
    return hotels;
  }

  public void setHotels(List<Hotels> hotels) {
    this.hotels = hotels;
  }
}
