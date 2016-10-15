package data;

import java.util.List;

public class Hotels {

  private List<Hotel> hotels;

  public Hotels(List<Hotel> hotels) {
    this.hotels = hotels;
  }

  public List<Hotel> getHotels() {
    return hotels;
  }

  public void setHotels(List<Hotel> hotel) {
    this.hotels = hotels;
  }
}
