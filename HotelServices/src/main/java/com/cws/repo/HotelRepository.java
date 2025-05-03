package com.cws.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cws.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
