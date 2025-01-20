package com.lcwd.rating.service;

import com.lcwd.rating.entity.Rating;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getAllRatingByUserId(String userId);

    List<Rating> getAllRatingByHotelId(String hotelId);


}
