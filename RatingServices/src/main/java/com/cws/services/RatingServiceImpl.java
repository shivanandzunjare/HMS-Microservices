package com.cws.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cws.entities.Rating;
import com.cws.repo.RatingRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository ratingRepo;
	

	@Override
	public Rating create(Rating rating) {
		String ratingid = UUID.randomUUID().toString();
		rating.setRatingid(ratingid);
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		// TODO Auto-generated method stub
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserid(String userid) {
		// TODO Auto-generated method stub
		return ratingRepo.findByUserid(userid);
	}

	@Override
	public List<Rating> getRatingByHotelid(String hotelid) {
		// TODO Auto-generated method stub
		return ratingRepo.findByHotelid(hotelid);
	}

}
