package com.example.SNHUWeather.shnuweather;

import com.example.SNHUWeather.shnuweather.models.CoordinateForm;
import com.example.SNHUWeather.shnuweather.models.CordinateEndPoint;
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

import java.util.Objects;

@Controller
public class controller {

    private String longitude;
    private String latitude;

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("coordinateForm", new CoordinateForm());
        return "index";
    }

    @PostMapping("/search")
    public RedirectView postCoordinates(@ModelAttribute CoordinateForm form, RedirectAttributes attributes) {
        RestTemplate rest = new RestTemplate();
        String url = "https://api.weather.gov/points/" + form.getLatitude() +"," + form.getLongitude();
        CordinateEndPoint result = rest.getForObject(url, CordinateEndPoint.class);

        attributes.addAttribute("gridX", Objects.requireNonNull(result).getGridX());
        attributes.addAttribute("gridY", result.getGridY());
        attributes.addAttribute("gridId", result.getGridId());
        return new RedirectView("/weather");
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam String gridX, @RequestParam String gridY, @RequestParam String gridId, Model model) {
           RestTemplate rest = new RestTemplate();
           String url = "https://api.weather.gov/gridpoints/" + gridId + "/" + gridX + "," + gridY + "/forecast";
        WeatherEndPoint result = rest.getForObject(url, WeatherEndPoint.class);
        model.addAttribute("result", result);
        return "weather";
    }
}
