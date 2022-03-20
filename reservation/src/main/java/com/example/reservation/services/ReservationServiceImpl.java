package com.example.reservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.reservation.dao.ReservationDao;
import com.example.reservation.entities.Reservation;
@Service
public class ReservationServiceImpl implements ReservationService
{
	@Autowired
	private ReservationDao reservationDao;
	public ReservationServiceImpl()
	{
		// TODO Auto-generated method stub
	}
	@Override
	public List<Reservation> getReservation()
	{
		return reservationDao.findAll();
	}

	@Override
	public Reservation getReservation(long reservationId)
	{
		
		return reservationDao.getOne(reservationId);
	}
	public Reservation addReservation(Reservation reservation) 
	{
		
		reservationDao.save(reservation);
		return reservation;
	}

	@Override
	public Reservation updateReservation(Reservation reservation)
	{
		reservationDao.save(reservation);
		return reservation;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteReservation(long parseLong)
	{
		Reservation entity=reservationDao.getOne(parseLong);
		reservationDao.delete(entity);
		
	}

}
