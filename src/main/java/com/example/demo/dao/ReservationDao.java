package com.example.demo.dao;

import java.util.List;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Reservation;

@Repository
public interface ReservationDao extends JpaRepository<Reservation, Long> {

	// select count(*) from reservation t
	// where t.date_arr = to_date ('22/06/2022','dd/mm/yyyy');

	@Query(value = "select count(*) from reservation t	where t.date_arr = :date_arr", nativeQuery = true)
	public int selectByDateArr(@Param("date_arr") Date date_arr);
}
