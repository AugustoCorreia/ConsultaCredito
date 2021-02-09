package com.consultaCredito.Api_Consulta_Credito.util;

import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.consultaCredito.Api_Consulta_Credito.model.Cliente;

@Component
public class ConsultaUtil {

	public static Integer consultaScore(Cliente cliente) {
		Integer testes = 0;
		Integer result = 0;

		do {
			result = simulaGetScore(cliente.getCpf());

			if(result != null ) {
				testes =2;
			}

			testes ++;
		}while (testes <=2);

			return result;

	}

	private static Integer simulaGetScore(String CPF) {

		Integer status = new Random().nextInt(5);

		if (status<=2) {
			return null;
		}

		return new Random().nextInt(100)*10;
	}




	public static Double calcularResultado(Cliente cliente, Integer score) {
		final Double ZERO = 0.0;
		final Double VALOR_MINIMO = 500.00;
		final Double PERCENTUAL = 25.0/100.0;

		if ( score == null || score <=400 ) {
			return ZERO;
		}

		if (ObjectUtils.isEmpty(cliente.getIdade()) || cliente.getIdade() < 18 || cliente.getIdade() > 65) {
			return ZERO;
		}

		if (cliente.getIdade() < 31 ) {
			return VALOR_MINIMO;
		}

		if (cliente.getDependentes().equals(0)) {
			return cliente.getRenda() + (cliente.getRenda()*PERCENTUAL);
		}else {
			return cliente.getRenda() - (cliente.getRenda()*(cliente.getDependentes()*PERCENTUAL));
		}

	}
}
