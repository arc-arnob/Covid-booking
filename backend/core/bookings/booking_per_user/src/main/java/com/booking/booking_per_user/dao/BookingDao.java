package com.booking.booking_per_user.dao;

import com.booking.booking_per_user.model.Coordinates;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingDao extends MongoRepository<Coordinates, Double>{
    
}
