package com.example.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.reservation.entities.Reservation;
import com.example.reservation.services.ReservationService;
@RestController
@CrossOrigin
public class MyController 
{
@Autowired
private ReservationService reservationservice;
@GetMapping
public String home()
{
	return "welcome";
}
//get all information
@GetMapping("/reservation")
public List<Reservation>getReservation()
{
	return this.reservationservice.getReservation();
}
//get information by id
@GetMapping("/reservation/{reservationId}")
public Reservation getReservation(@PathVariable String reservationId)
{
	return this.reservationservice.getReservation(Long.parseLong(reservationId));
	
}
//add details
@PostMapping("/reservation")
public Reservation addReservation(@RequestBody Reservation reservation)
{
	return this.reservationservice.addReservation(reservation);
}
//update details
@PutMapping("/reservation")
public Reservation updateCourse(@RequestBody Reservation reservation)
{
	return this.reservationservice.updateReservation(reservation);
}
//Delete Reservation
@DeleteMapping("/reservation/{reservationId}")
public ResponseEntity<HttpStatus> deleteReservation(@PathVariable String reservationId)
{
	try
	{
		this.reservationservice.deleteReservation(Long.parseLong(reservationId));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	catch(Exception e)
	
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}

}
