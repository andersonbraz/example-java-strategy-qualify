package br.com.solution.util;

public enum TipoSegmentoC {
	
	TIPO_C_1(200, 213, 9004),
	TIPO_C_2(200, 478, 9004),
	TIPO_C_3(300, 568, 9004),
	TIPO_C_4(300, 478, 8010),
	TIPO_C_5(415, 490, 9004);
	
	private final int campoAlfa;
	private final int campoBeta;
	private final int campoXadrez;
	
	TipoSegmentoC(int valorAlfa, int valorBeta, int valorXadrez) {
		this.campoAlfa = valorAlfa;
		this.campoBeta = valorBeta;
		this.campoXadrez = valorXadrez;
	}
	
	public int getValorAlfa() {
		return campoAlfa;
	}
	
	public int getValorBeta() {
		return campoBeta;
	}
	
	public int getValorXadrez() {
		return campoXadrez;
	}
	
	public TipoSegmento getSegmento() {
		return TipoSegmento.TIPO_C;
	}

}
