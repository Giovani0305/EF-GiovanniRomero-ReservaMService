package com.idat.ReservaMService.service;

import java.util.List;
 
import com.idat.ReservaMService.dto.ReservaDTO;

public interface ReservaService {
	List<ReservaDTO> listar();
	void guardar(ReservaDTO alumno);
}
