package br.com.solution.util;

public enum TipoSegmentoA {
	
	TIPO_A_200("200"),
	TIPO_A_300("300"),
	TIPO_A_400("400"),
	TIPO_A_500("500");
	
	private final String campoAlfa;
	
	TipoSegmentoA(String valorAlfa) {
		this.campoAlfa = valorAlfa;
	}
	
	public String getValorAlfa() {
		return campoAlfa;
	}
	
	public TipoSegmento getTipoSegmento() {
		return TipoSegmento.TIPO_A;
	}
	
	

}
