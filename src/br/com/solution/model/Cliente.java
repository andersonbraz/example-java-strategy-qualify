package br.com.solution.model;

import br.com.solution.util.TipoSegmento;

public class Cliente {
	
	public String nome;
	public String telefone;
	public String email;
	
	public String campoAlfa;
	public String campoBeta;
	public String campoXadrez;
	
	public TipoSegmento tipoSegmento;
	
	/*
	 * 
	 * TipoA = campoAlfa com valores: 200, 300, 400, 500
	 * TipoB = campoAlfa com valores: 600, 700, 800, 900
	 * TipoC = 
	 * 
	 * campoAlfa, campoBeta, campoXadrez
	 * 
	 * 200, 213, 9004
	 * 200, 478, 9004
	 * 300, 568, 9004
	 * 300, 478, 8010
	 * 415, 490, 9004
	 * 
	 * 
	 */
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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

}