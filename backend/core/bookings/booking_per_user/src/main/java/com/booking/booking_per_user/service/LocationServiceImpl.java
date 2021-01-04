package com.booking.booking_per_user.service;

import java.util.List;

import com.booking.booking_per_user.dao.BookingDao;
import com.booking.booking_per_user.model.Coordinates;
import com.booking.booking_per_user.model.Document;
import com.booking.booking_per_user.model.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private BookingDao bookingDao;
    @Override
    public List<Document> getAllMarkers() {
        // TODO Auto-generated method stub
        return bookingDao.findAll();
    }

    @Override
    public Document createMarker(Document document) {
        // TODO Auto-generated method stub
        return bookingDao.save(document);
    }

    
    
}
