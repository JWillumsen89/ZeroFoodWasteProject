package dk.jwillum.websitedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


  @GetMapping("/index")
  public String index() {
    return "index";
  }

  @GetMapping("/indexcontent")
  public String content() {
    return "indexcontent";
  }

  @GetMapping("/news")
  public String newsSite() {
    return "news";
  }

  @GetMapping("/about")
  public String aboutSite() {
    return "about";
  }

  @GetMapping("/contact")
  public String contactSite() {
    return "contact";
  }

  @GetMapping("/shop")
  public String shopSite() {
    return "shop";
  }

  @GetMapping("/fakta")
  public String gallerySite() {
    return "fakta";
  }

  @GetMapping("/events")
  public String eventsSite() {
    return "events";
  }

  @GetMapping("/dropdownmenu")
  public String dropDownMenuSite() {
    return "dropdownmenu";
  }

  @GetMapping("/homebutton")
  public String homeButtonSite() {
    return "homebutton";
  }
}
