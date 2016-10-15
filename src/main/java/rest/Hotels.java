package rest;

import data.Hotel;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hotels {

  @RequestMapping(path = "/hotels", method = RequestMethod.POST)
  public String getListOfHotels(@RequestBody final String state) {

//    Hotel hotel = new Hotel();

    return "";
  }
}
