package com.booking.booking_per_user.model;

import org.bson.types.ObjectId;

public class Coordinates {
    // Mongodb geoJson needs type and lon,lat.
    // private ObjectId objectId;
    private String type;
    private Double lon;
    private Double lat;

    public Coordinates(String type, Double lon, Double lat) {
        //this.objectId = new ObjectId();
        this.type = type;
        this.lon = lon;
        this.lat = lat;
    }

    // public ObjectId getObjectId() {
    //     return objectId;
    // }

    // public void setObjectId() {
    //     this.objectId = new ObjectId();
    // }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
    
    
}
