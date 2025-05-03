package com.cws.external.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.cws.entities.Rating;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
	
	@PostMapping("/ratings")
	public ResponseEntity<Rating> createRating(Rating values);
	
	@PutMapping("/ratings/{ratingid}")
	public ResponseEntity<Rating> updateRating(@PathVariable("ratingid") String ratingid, Rating rating);

	@DeleteMapping("/ratings/{ratingid}")
	public void deleteRating(@PathVariable String ratingid);
	
}
