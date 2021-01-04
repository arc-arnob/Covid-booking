package com.booking.booking_per_user.service;

import java.util.List;

import com.booking.booking_per_user.model.Coordinates;

public interface LocationService {
    public List<Coordinates> getAllMarkers(); //returns all markers

    public Coordinates createMarker(Coordinates coordinate); // Create Coordinate
}
