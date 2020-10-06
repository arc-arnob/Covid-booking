package com.covid_booking.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Address {
    
    @JsonProperty("address")
    private JsonNode address;

    ObjectMapper mapper = new ObjectMapper();
    Place newJsonNode = mapper.convertValue(address, Place.class);

    public Place getNewJsonNode() {
        return newJsonNode;
    }

    public void setNewJsonNode(Place newJsonNode) {
        this.newJsonNode = newJsonNode;
    }
    
    
}
