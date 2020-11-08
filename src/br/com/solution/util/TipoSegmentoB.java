package br.com.solution.util;

public enum TipoSegmentoB {
	
	TIPO_B_600(600),
	TIPO_B_700(700),
	TIPO_B_800(800),
	TIPO_B_900(900);
	
	private final int campoAlfa;
	
	TipoSegmentoB(int valorAlfa) {
		this.campoAlfa = valorAlfa;
	}
	
	public int getValorAlfa() {
		return campoAlfa;
	}
	
	public TipoSegmento getTipoSegmento() {
		return TipoSegmento.TIPO_B;
	}

}
