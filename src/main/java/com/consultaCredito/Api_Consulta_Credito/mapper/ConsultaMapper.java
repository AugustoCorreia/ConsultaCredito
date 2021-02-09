package com.consultaCredito.Api_Consulta_Credito.mapper;

import com.consultaCredito.Api_Consulta_Credito.model.Cliente;
import com.consultaCredito.Api_Consulta_Credito.model.ClienteResponse;
import com.consultaCredito.Api_Consulta_Credito.util.ConsultaUtil;

public class ConsultaMapper {
	public static ClienteResponse getMapingFromClient(Cliente cliente) {

		ClienteResponse clienteResponse = new ClienteResponse();
		clienteResponse.setId(cliente.getId());
		clienteResponse.setNome(cliente.getNome());
		clienteResponse.setIdade(cliente.getIdade());
		clienteResponse.setDependentes(cliente.getDependentes());
		clienteResponse.setRenda(cliente.getRenda());
		clienteResponse.setScore(ConsultaUtil.consultaScore(cliente));
		clienteResponse.setResultado(ConsultaUtil.calcularResultado(cliente,clienteResponse.getScore()));

		return clienteResponse;
	}
}
