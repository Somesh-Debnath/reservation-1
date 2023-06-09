package com.nk.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nk.reservation.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}