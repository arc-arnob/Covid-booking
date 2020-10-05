package com.covid_booking.covid.controller;

import java.net.http.HttpResponse.ResponseInfo;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MapsController {
    
    @Value("${api.key}")
    private String apiKey;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/geocode/{address}")
    public ResponseEntity<String> getGeoCode(@PathVariable String address){
        
        ResponseEntity<String> res = restTemplate.getForEntity("https://api.tomtom.com/search/2/geocode/" + address +".json?key="+ apiKey, String.class);
        return res;
    }

    // @GetMapping("/revgeocode/{latitude:.+},{longitude:.+}")
    // public ResponseEntity<String> getReverseGeoCode(@PathVariable String latitude, @PathVariable String longitude)
    // {
    //     System.out.println(latitude);
    //     System.out.println(longitude);
    //     ResponseEntity<String> res = restTemplate.getForEntity("https://api.tomtom.com/search/2/reverseGeocode/37.8328%2C122.27669.json?key="+ apiKey, String.class);
    //     return res;
    // }
    @GetMapping("/revgeocode/data")
    public ResponseEntity<String> getReverseGeoCode()
    {
        ResponseEntity<String> res = restTemplate.getForEntity("https://api.tomtom.com/search/2/reverseGeocode/crossStreet/37.8328%2C122.27669.json?key="+ apiKey, String.class);
        return res;
    }

}
