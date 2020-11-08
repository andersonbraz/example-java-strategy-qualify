package br.com.solution.model;

import br.com.solution.util.TipoSegmento;

public class Segmento {
	
	public int campoAlfa;
	public int campoBeta;
	public int campoXadrez;
	public TipoSegmento tipoSegmento;
	
	public Segmento(Cliente client) {
		super();
		this.campoAlfa = client.campoAlfa;
		this.campoBeta = client.campoBeta;
		this.campoXadrez = client.campoXadrez;
	}
	
	public int getCampoAlfa() {
		return campoAlfa;
	}
	
	public void setCampoAlfa(int campoAlfa) {
		this.campoAlfa = campoAlfa;
	}
	
	public int getCampoBeta() {
		return campoBeta;
	}
	
	public void setCampoBeta(int campoBeta) {
		this.campoBeta = campoBeta;
	}
	
	public int getCampoXadrez() {
		return campoXadrez;
	}
	
	public void setCampoXadrez(int campoXadrez) {
		this.campoXadrez = campoXadrez;
	}
	
	public TipoSegmento getTipoSegmento() {
		
		System.out.println("check: " + this.campoAlfa);
		System.out.println("check: " + this.campoBeta);
		System.out.println("check: " + this.campoXadrez);
		
		
		return TipoSegmento.TIPO_A;
		
	}
	
}
