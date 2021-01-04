package com.booking.booking_per_user.dao;

import com.booking.booking_per_user.model.Document;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingDao extends MongoRepository<Document, Integer>{
    
}
