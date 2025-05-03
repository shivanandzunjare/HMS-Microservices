package com.cws.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cws.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{

	//custom finder methods
	
	List<Rating> findByUserid(String userid);
	
	List<Rating> findByHotelid(String hotelid);
	
	
}
