package rest;

import data.Hotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotels {

  @RequestMapping("/hotels/{state}")
  public String getListOfHotels(@PathVariable("state") String state) {

    Hotel hotel = new Hotel();

    return "";
  }
}
