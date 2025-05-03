package com.cws.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cws.entities.Hotel;
import com.cws.exceptions.ResourceNotFoundException;
import com.cws.repo.HotelRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepo;
	

	@Override
	public Hotel create(Hotel hotel) {
		String randomid = UUID.randomUUID().toString();
		hotel.setHotelid(randomid);
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelRepo.findAll();
	}

	@Override
	public Hotel get(String hotelid) {
		
		return hotelRepo.findById(hotelid).orElseThrow(() -> new ResourceNotFoundException("hotel with given hotelid not found !!"));
	}

}
