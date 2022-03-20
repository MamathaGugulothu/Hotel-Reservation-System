package com.example.reservation.services;

import java.util.List;

import com.example.reservation.entities.Reservation;

public interface ReservationService 
{
 public List<Reservation> getReservation();
 public Reservation getReservation(long reservationId);
	public Reservation addReservation(Reservation reservation);
	public Reservation updateReservation(Reservation reservation);
	public void deleteReservation(long parseLong);
}
