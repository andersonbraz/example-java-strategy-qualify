package br.com.solution.util;

import java.util.Arrays;
import java.util.Optional;

public enum TipoSegmentoA {
	
	TIPO_A_200("200"),
	TIPO_A_300("300"),
	TIPO_A_400("400"),
	TIPO_A_500("500");
	
	private final String campoAlfa;
	
	private TipoSegmentoA(String valorAlfa) {
		this.campoAlfa = valorAlfa;
	}
	
	public String getValorAlfa() {
		return campoAlfa;
	}
	
	public static Optional<TipoSegmentoA> getTipoSegmento(String alfa) {
		
		Optional<TipoSegmentoA> result =  Arrays
		.stream(TipoSegmentoA.values())
		.filter(tipoAlfa -> tipoAlfa.getValorAlfa().equals(alfa.toString()))
		.findFirst();
		
		return result;
				
	}
	

}
