package com.consultaCredito.Api_Consulta_Credito.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.consultaCredito.Api_Consulta_Credito.mapper.ConsultaMapper;
import com.consultaCredito.Api_Consulta_Credito.model.Cliente;
import com.consultaCredito.Api_Consulta_Credito.model.ClienteResponse;

@Component
public class ConsultaServiceImpl implements IConsultaService{

	@Override
	public ResponseEntity<ClienteResponse> consultar(Cliente cliente) {
		return ResponseEntity.ok(ConsultaMapper.getMapingFromClient(cliente));
	}

}
