package com.cws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cws.entities.Rating;
import com.cws.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService ratingservice;
	
	//create rating
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingservice.create(rating));
	}
	
	//get all
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings(){
		return ResponseEntity.ok(ratingservice.getRatings());
	}
	
	//get rating by userId
	@GetMapping("/users/{userid}")
	public ResponseEntity<List<Rating>> getRatingByUserid( @PathVariable String userid ){
		return ResponseEntity.ok(ratingservice.getRatingByUserid(userid));
	}
	
	@GetMapping("/hotels/{hotelid}")
	public ResponseEntity<List<Rating>> getRatingByHotelid( @PathVariable String hotelid){
		return ResponseEntity.ok(ratingservice.getRatingByHotelid(hotelid));
	}
}