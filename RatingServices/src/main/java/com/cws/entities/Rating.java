package com.cws.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="rating")
public class Rating {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private String ratingid;
	
	@Column(name="USERID")
	private String userid;
	
	@Column(name="HOTELID")
	private String hotelid;
	
	@Column(name="RATING")
	private int rating;
	
	@Column(name="FEEDBACK")
	private String feedback;
	
}
