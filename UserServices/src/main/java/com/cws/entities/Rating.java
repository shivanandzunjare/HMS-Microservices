package com.cws.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
	
	private String ratingid;
	private String userid;
	private String hotelid;
	private int rating;
	private String feedback;
	
	private Hotel hotel;
	

}
