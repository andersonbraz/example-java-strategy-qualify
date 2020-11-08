package br.com.solution.main;

import br.com.solution.model.Cliente;

public class Executor {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		c1.setNome("João");
		c1.setEmail("joao@braz.com");
		c1.setTelefone("(61)9999-8888");
		c1.setCampoAlfa(200);
		c1.setCampoBeta(10);
		c1.setCampoXadrez(10);
		
		
		c2.setNome("Gustavo");
		c2.setEmail("gustavo@braz.com");
		c2.setTelefone("(61)8888-7777");
		c2.setCampoAlfa(700);
		c2.setCampoBeta(10);
		c2.setCampoXadrez(10);
		
		c3.setNome("Anderson");
		c3.setEmail("anderson@braz.com");
		c3.setTelefone("(61)7777-6666");
		c3.setCampoAlfa(300);
		c3.setCampoBeta(478);
		c3.setCampoXadrez(8010);
		

	}

}
