package com.example.reservation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reservation.entities.Reservation;

public interface ReservationDao extends JpaRepository<Reservation, Long>
{

}
