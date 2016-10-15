package util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import data.Card;
import data.Hotel;
import data.Hotels;

public class MockUtil {


  public static List<Card> getThemes() {
    return getCards("themes.txt");
  }

  public static List<Card> getTravelOptions() {
    return getCards("travel.txt");
  }

  public static List<Card> getActivities() {
    return getCards("activities.txt");
  }

  public static List<Card> getLocations() {
    return getCards("locations.txt");
  }

  public static List<Card> getCards(String file) {
    ClassLoader classLoader = MockUtil.class.getClassLoader();
    InputStream stream = classLoader.getResourceAsStream(file);

    int i = 0;
    List<Card> cards = new ArrayList<Card>();
    Scanner scanner = new Scanner(stream);

    while (scanner.hasNextLine()) {
      String[] line = scanner.nextLine().split(",");
      Card card = new Card();
      card.setId(i);
      card.setTerm(line[0]);
      card.setDesc(line[1]);
      card.setImageUrl(line[2]);
      cards.add(card);
      i++;
    }
    scanner.close();
    return cards;
  }

  public static Hotels getHotels() {
    List<Hotel> hotelList = new ArrayList<Hotel>();

    ClassLoader classLoader = MockUtil.class.getClassLoader();
    InputStream stream = classLoader.getResourceAsStream("hotels.txt");

    Scanner scanner = new Scanner(stream);
    while (scanner.hasNextLine()) {
      String[] line = scanner.nextLine().split(",");
      int price = Integer.parseInt(line[0]);
      Double rating = Double.parseDouble(line[1]);
      int stars = Integer.parseInt(line[2]);
      List<String> attractions = Arrays.asList(line[3].split("\\|"));
      List<String> reviews = Arrays.asList(line[4].split("\\|"));
      List<String> imageUrls = Arrays.asList(line[5].split("\\|"));
      String thumbnail = line[6];
      String name = line[7];
      String location = line[8];
      String desc = line[9];
      String address = line[10];
      String number = line[11];
      Hotel hotel = new Hotel(price, rating, stars, attractions, reviews, imageUrls, thumbnail, name, location, desc, address, number);
      hotelList.add(hotel);
    }
    scanner.close();

    Hotels hotels = new Hotels(hotelList);
    return hotels;
  }

}
