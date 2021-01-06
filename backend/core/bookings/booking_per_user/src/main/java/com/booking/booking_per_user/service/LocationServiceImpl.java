package com.booking.booking_per_user.service;

import java.util.List;

import com.booking.booking_per_user.dao.BookingDao;
import com.booking.booking_per_user.model.Coordinates;
import com.booking.booking_per_user.model.Document;
import com.booking.booking_per_user.model.Location;
import com.mongodb.client.model.geojson.Point;
import com.mongodb.client.model.geojson.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metric;
import org.springframework.data.geo.Metrics;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private BookingDao bookingDao;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Document> getAllMarkers() {
        
        return bookingDao.findAll();
    }

    @Override
    public Document createMarker(Document document) {
        
        return bookingDao.save(document);
    }

    // @Override
    // public List<Document> findByLocationNear(Point point, Distance distance) {
    //     // TODO Auto-generated method stub
    //     return null;
    // }
    // //Custom Query
    // public List<Document> get2dsphere(Double lon, Double lat) {
    //     Position coordinates = new Position(lon, lat);
    //     Point point = new Point(coordinates);
    //     Distance distance = new Distance(200, Metrics.KILOMETERS);

    //     return bookingDao.findByLocationNear(point, distance);


       

    //     return null;
    // }

  

    
    
}
