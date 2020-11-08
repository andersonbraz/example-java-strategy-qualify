package br.com.solution.util;

public enum TipoSegmento {
	
	TIPO_A(1),
	TIPO_B(2),
	TIPO_C(3);
	
	private final int valorSegmento;
	
	TipoSegmento(int valor) {
		this.valorSegmento = valor;
	}
	
	public int getValorSegmento() {
		return valorSegmento;
	}
	
}

