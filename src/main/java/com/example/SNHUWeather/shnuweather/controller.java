package com.example.SNHUWeather.shnuweather;

import com.example.SNHUWeather.shnuweather.models.CoordinateForm;
import com.example.SNHUWeather.shnuweather.models.CordinateEndPoint;
import com.example.SNHUWeather.shnuweather.models.Period;
import com.example.SNHUWeather.shnuweather.models.WeatherEndPoint;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.Objects;

@Controller
public class controller {

//    Get mapping for index page
//    creates new form object to pass to the template
    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("coordinateForm", new CoordinateForm());
        return "index";
    }

//    Post mapping for /search
//    Redirect attributes are used for adding query params to the redirect link.
    @PostMapping("/search")
    public RedirectView postCoordinates(@ModelAttribute CoordinateForm form, RedirectAttributes attributes) {
        RestTemplate rest = new RestTemplate();
        String url = "https://api.weather.gov/points/" + form.getLatitude() +"," + form.getLongitude();
        CordinateEndPoint result = rest.getForObject(url, CordinateEndPoint.class);

//      All params for the redirect
        attributes.addAttribute("gridX", Objects.requireNonNull(result).getGridX());
        attributes.addAttribute("gridY", result.getGridY());
        attributes.addAttribute("gridId", result.getGridId());
        attributes.addAttribute("city", result.getCity());
        attributes.addAttribute("state", result.getState());
        return new RedirectView("/weather");
    }

//    Get mapping for the weather results
//    Adds periods, city, and state to the template model
    @GetMapping("/weather")
    public String getWeather(@RequestParam String gridX, @RequestParam String gridY, @RequestParam String gridId, @RequestParam String city, @RequestParam String state, Model model) {
           RestTemplate rest = new RestTemplate();
           String url = "https://api.weather.gov/gridpoints/" + gridId + "/" + gridX + "," + gridY + "/forecast";
        WeatherEndPoint result = rest.getForObject(url, WeatherEndPoint.class);
        ArrayList<Period> periods = Objects.requireNonNull(result).getPeriods();
        model.addAttribute("periods", periods);
        model.addAttribute("state", state);
        model.addAttribute("city", city);
        return "weather";
    }
}
