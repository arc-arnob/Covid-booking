package com.booking.booking_per_user.service;

import java.util.List;

import com.booking.booking_per_user.model.Document;
import com.mongodb.client.model.geojson.Point;

import org.springframework.data.geo.Distance;




public interface LocationService {
    public List<Document> getAllMarkers(); //returns all markers

    public Document createMarker(Document document); // Create Coordinate

    //public List<Document> findByLocationNear(Point point, Distance distance); // find geonear points
}
