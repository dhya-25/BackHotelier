package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Hotel;
@Repository
public interface HotelDao extends JpaRepository<Hotel,Long>{
	
	 public List<Hotel> findByEmail(String email);
	 
	 @Query(value ="select * from hotel p where p.id_hotel=:id_hotel",nativeQuery = true)
	 public List<Hotel> findByIdd( Long id_hotel );

	 public boolean existsByNomHotel(String hotel);


}
