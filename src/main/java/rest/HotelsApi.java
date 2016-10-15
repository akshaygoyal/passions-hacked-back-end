package rest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import util.MockUtil;

@RestController
public class HotelsApi {

  String baseUrl = "https://hacker240:6PJfyQFLn4@distribution-xml.booking.com/json/bookings.";

  @RequestMapping(path = "/hotels", method = RequestMethod.POST)
  public String getListOfHotels(@RequestBody final String state) {

//    URL getHotelsUrl = null;
//    JsonObject jo = null;
//    String data = "";
//    try {
//
//      getHotelsUrl = new URL(baseUrl + "getHotels?city_ids=-3875419");
//      HttpURLConnection conn = (HttpURLConnection) getHotelsUrl.openConnection();
//      conn.setRequestMethod("GET");
//      conn.setRequestProperty("Accept", "application/json");
//      conn.setRequestProperty("Authorization", "Basic aGFja2VyMjQwOjZQSmZ5UUZMbjQ=");
////      data = (String) conn.res;
//
//      JsonParser parser = new JsonParser();
//      jo = (JsonObject) parser.parse(data);
//      System.out.println(jo.getAsJsonArray().toString());
//
//      System.out.println(jo.get("hotel_id"));
//
//    } catch (MalformedURLException e) {
//      e.printStackTrace();
//    } catch (ProtocolException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//
//
////    Hotel hotel = new Hotel();

    String json = (new Gson()).toJson(MockUtil.getHotels());
    return json;
  }
}
