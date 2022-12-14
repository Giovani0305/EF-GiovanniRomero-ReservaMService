package com.idat.ReservaMService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ReservaMService.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
