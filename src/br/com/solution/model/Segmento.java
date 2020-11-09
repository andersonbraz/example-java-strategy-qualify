package br.com.solution.model;

import java.util.Optional;

import br.com.solution.util.TipoSegmento;
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
	
	public Optional<TipoSegmentoC> getTipoSegmento() {
		
		
		System.out.println("check: " + this.campoAlfa);
		System.out.println("check: " + this.campoBeta);
		System.out.println("check: " + this.campoXadrez);
		// ordem de verificação pelos tipo: C, B, A
		return TipoSegmentoC.getTipoSegmento(this.campoAlfa, this.campoBeta, this.campoXadrez);
		
	}
	
	/*
	 * 
	 * 
	 *  Incremento correto deve ser baseado no código abaixo: 
	 *  
	 *  
	 * 
	public TipoSegmento getTipoSegmento() {
		
		
		if(!TipoSegmentoC.getTipoSegmento(this.campoAlfa, this.campoBeta, this.campoXadrez).equals(Empty)){
			return TipoSegmento.TIPO_C;
		}else if(!TipoSegmentoB.getTipoSegmento(this.campoAlfa).equals(Empty)) {
			return TipoSegmento.TIPO_B;
		}else if(!TipoSegmentoB.getTipoSegmento(this.campoAlfa).equals(Empty)) {
			return TipoSegmento.TIPO_A;
		}else{
			return TipoSegmento.TIPO_UNDEFINED;
		}
		
	}
	*/
	
}
