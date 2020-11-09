package br.com.solution.util;

public enum TipoSegmento {
	
	TIPO_A("1"),
	TIPO_B("2"),
	TIPO_C("3");
	
	private final String valorSegmento;
	
	TipoSegmento(String valor) {
		this.valorSegmento = valor;
	}
	
	public String getSegmento() {
		return valorSegmento;
	}
	
}

