package br.com.solution.util;

import java.util.Arrays;
import java.util.Optional;

public enum TipoSegmentoC {
	
	TIPO_C_1("200", "213", "9004"),
	TIPO_C_2("200", "478", "9004"),
	TIPO_C_3("300", "568", "9004"),
	TIPO_C_4("300", "478", "8010"),
	TIPO_C_5("415", "490", "9004");
	
	private final String campoAlfa;
	private final String campoBeta;
	private final String campoXadrez;
	
	private TipoSegmentoC(String valorAlfa, String valorBeta, String valorXadrez) {
		this.campoAlfa = valorAlfa;
		this.campoBeta = valorBeta;
		this.campoXadrez = valorXadrez;
	}
	
	public String getValorAlfa() {
		return campoAlfa;
	}
	
	public String getValorBeta() {
		return campoBeta;
	}
	
	public String getValorXadrez() {
		return campoXadrez;
	}
	
	public static Optional<TipoSegmentoC> getTipoSegmento(String alfa, String beta, String xadrez) {
		
		Optional<TipoSegmentoC> result =  Arrays
		.stream(TipoSegmentoC.values())
		.filter(tipoAlfa -> tipoAlfa.getValorAlfa().equals(alfa.toString()))
		.filter(tipoBeta -> tipoBeta.getValorBeta().equals(beta.toString()))
		.filter(tipoZadrez -> tipoZadrez.getValorXadrez().equals(xadrez.toString()))
		.findFirst();
		
		
		return result;
				
	}

}
