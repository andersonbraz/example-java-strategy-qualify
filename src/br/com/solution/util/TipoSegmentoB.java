package br.com.solution.util;

import java.util.Arrays;
import java.util.Optional;

public enum TipoSegmentoB {
	
	TIPO_B_600("600"),
	TIPO_B_700("700"),
	TIPO_B_800("800"),
	TIPO_B_900("900");
	
	private final String campoAlfa;
	
	TipoSegmentoB(String valorAlfa) {
		this.campoAlfa = valorAlfa;
	}
	
	public String getValorAlfa() {
		return campoAlfa;
	}
	
	public static Optional<TipoSegmentoB> getTipoSegmento(String alfa) {
		
		Optional<TipoSegmentoB> result =  Arrays
		.stream(TipoSegmentoB.values())
		.filter(tipoAlfa -> tipoAlfa.getValorAlfa().equals(alfa.toString()))
		.findFirst();
		
		return result;
				
	}

}
