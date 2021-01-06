package com.booking.booking_per_user.model;

import java.util.List;

public class Location { // Location is a collection

    private String type;
    private List<Double> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Double> getCoordinate() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinate) {
        this.coordinates = coordinate;
    }

    public Location(String type, List<Double> coordinate) {
        this.type = type;
        this.coordinates = coordinate;
    }
    
}
