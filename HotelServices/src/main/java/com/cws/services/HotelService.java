package com.cws.services;

import java.util.List;

import com.cws.entities.Hotel;

public interface HotelService {
	
	
	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel get(String hotelid);
	
}
