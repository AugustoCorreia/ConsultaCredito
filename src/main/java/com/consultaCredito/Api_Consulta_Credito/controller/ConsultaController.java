package com.consultaCredito.Api_Consulta_Credito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.consultaCredito.Api_Consulta_Credito.model.Cliente;
import com.consultaCredito.Api_Consulta_Credito.model.ClienteResponse;
import com.consultaCredito.Api_Consulta_Credito.service.IConsultaService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
public class ConsultaController {

	@Autowired
	IConsultaService calculoService;

	@GetMapping(path = "/on")
	public String online () {
		return "online";
	}

	@ApiOperation(value = "Retorna Resultado da Consulta")
	@PostMapping(path = "/consultar")
	public ResponseEntity<ClienteResponse> consultaCredito (@RequestBody Cliente cliente) {
		return calculoService.consultar(cliente);
	}
	

}
