package com.consultaCredito.Api_Consulta_Credito.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.consultaCredito.Api_Consulta_Credito.model.Cliente;
import com.consultaCredito.Api_Consulta_Credito.model.ClienteResponse;

@Service
public interface IConsultaService {
	public ResponseEntity<ClienteResponse> consultar (Cliente cliente);
}
