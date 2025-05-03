package com.cws.services;

import java.util.List;

import com.cws.entities.Rating;

public interface RatingService {
	
	//create 
	Rating create(Rating rating);
	
	//get all rating 
	List<Rating> getRatings();
	
	//get all by userId 
	List<Rating> getRatingByUserid(String userid);
	
	//get all by hotel
	List<Rating> getRatingByHotelid(String hotelid);
	
	
	

}
