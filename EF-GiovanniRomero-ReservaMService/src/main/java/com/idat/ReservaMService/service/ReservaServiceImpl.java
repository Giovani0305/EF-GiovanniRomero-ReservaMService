package com.idat.ReservaMService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.idat.ReservaMService.model.Reserva;
import com.idat.ReservaMService.repository.ReservaRepository;
import com.idat.ReservaMService.dto.ReservaDTO;
 
@Service
public class ReservaServiceImpl implements ReservaService{
	@Autowired
	private ReservaRepository repository;
	
	@Override
	public List<ReservaDTO> listar() {
		List<ReservaDTO> listado = new ArrayList<>();
		ReservaDTO dto = null;
				
		for (Reserva reserva : repository.findAll()) {
			dto = new ReservaDTO();
			dto.setCodigo(reserva.getIdReserva());
			dto.setCosto(reserva.getCosto());
			
			listado.add(dto);
		}
		
		return listado;
	}
	
	@Override
	public void guardar(ReservaDTO reserva) {
		
		Reserva r = new Reserva();
		r.setIdReserva(reserva.getCodigo());
		r.setCosto(reserva.getCosto());
		
		repository.save(r);
	}
}
