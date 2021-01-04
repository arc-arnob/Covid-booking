package com.booking.booking_per_user.service;

import java.util.List;

import com.booking.booking_per_user.model.Document;


public interface LocationService {
    public List<Document> getAllMarkers(); //returns all markers

    public Document createMarker(Document document); // Create Coordinate
}
