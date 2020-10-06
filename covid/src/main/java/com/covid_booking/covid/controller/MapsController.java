package com.covid_booking.covid.controller;

import java.net.http.HttpResponse.ResponseInfo;
import java.util.List;

import javax.websocket.server.PathParam;

import com.covid_booking.covid.model.Address;
import com.covid_booking.covid.model.Addresscontainer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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

    @GetMapping("/revgeocode/{latitude:.+},{longitude:.+}")
    public Addresscontainer getReverseGeoCode(@PathVariable String latitude, @PathVariable String longitude)
    {
        // System.out.println(latitude);
        // System.out.println(longitude);
        Addresscontainer res = restTemplate.getForObject("https://api.tomtom.com/search/2/reverseGeocode/"+latitude+","+longitude+".json?key="+ apiKey, Addresscontainer.class);
        return res;
    }
    // @GetMapping("/revgeocode/data/{id}")
    // public Addresscontainer reverseGeoCode(@RequestParam String position)
    // {
    //     Addresscontainer res = restTemplate.getForObject("https://api.tomtom.com/search/2/reverseGeocode/crossStreet/"+position+".json?key="+ apiKey, Addresscontainer.class);
    //     return res;
    // }

}
