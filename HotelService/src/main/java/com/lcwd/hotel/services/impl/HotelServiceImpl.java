package com.lcwd.hotel.services.impl;

import com.lcwd.hotel.entites.Hotel;

import com.lcwd.hotel.exception.ResourceNotFoundException;
import com.lcwd.hotel.repo.HotelRepo;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;
    @Override
    public Hotel createHotel(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepo.save(hotel) ;
    }

    @Override
    public Hotel getHotelById(String id) {
        return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("No Hotel can be found by this id:"+id));
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }
}
