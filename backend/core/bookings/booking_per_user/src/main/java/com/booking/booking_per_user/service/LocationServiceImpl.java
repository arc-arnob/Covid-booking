package com.booking.booking_per_user.service;

import java.util.List;

import com.booking.booking_per_user.dao.BookingDao;
import com.booking.booking_per_user.model.Coordinates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private BookingDao bookingDao;
    @Override
    public List<Coordinates> getAllMarkers() {
        // TODO Auto-generated method stub
        return bookingDao.findAll();
    }

    @Override
    public Coordinates createMarker(Coordinates coordinate) {
        // TODO Auto-generated method stub
        return bookingDao.save(coordinate);
    }

    
    
}
