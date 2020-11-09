package br.com.solution.model;

import java.util.Optional;

import br.com.solution.util.TipoSegmento;
import br.com.solution.util.TipoSegmentoA;
import br.com.solution.util.TipoSegmentoB;
import br.com.solution.util.TipoSegmentoC;

public class Segmento {
	
	public String campoAlfa;
	public String campoBeta;
	public String campoXadrez;
	public TipoSegmento tipoSegmento;
	
	public Segmento(Cliente client) {
		super();
		this.campoAlfa = client.campoAlfa;
		this.campoBeta = client.campoBeta;
		this.campoXadrez = client.campoXadrez;
	}
	
	public String getCampoAlfa() {
		return campoAlfa;
	}
	
	public void setCampoAlfa(String campoAlfa) {
		this.campoAlfa = campoAlfa;
	}
	
	public String getCampoBeta() {
		return campoBeta;
	}
	
	public void setCampoBeta(String campoBeta) {
		this.campoBeta = campoBeta;
	}
	
	public String getCampoXadrez() {
		return campoXadrez;
	}
	
	public void setCampoXadrez(String campoXadrez) {
		this.campoXadrez = campoXadrez;
	}
	
	/*
	public Optional<TipoSegmentoC> getTipoSegmentox() {
		
		
		System.out.println("check: " + this.campoAlfa);
		System.out.println("check: " + this.campoBeta);
		System.out.println("check: " + this.campoXadrez);
		// ordem de verificação pelos tipo: C, B, A
		return TipoSegmentoC.getTipoSegmento(this.campoAlfa, this.campoBeta, this.campoXadrez);
		
	}
	*/

	public TipoSegmento getTipoSegmento() {
		
		Optional<String> nothing = Optional.empty();
		
		if(!TipoSegmentoC.getTipoSegmento(this.campoAlfa, this.campoBeta, this.campoXadrez).equals(nothing)){
			return TipoSegmento.TIPO_C;
		}else if(!TipoSegmentoB.getTipoSegmento(this.campoAlfa).equals(nothing)) {
			return TipoSegmento.TIPO_B;
		}else if(!TipoSegmentoA.getTipoSegmento(this.campoAlfa).equals(nothing)) {
			return TipoSegmento.TIPO_A;
		}else{
			return TipoSegmento.TIPO_UNDEFINED;
		}
		
	}
	
}
