package br.com.solution.main;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.solution.model.Cliente;
import br.com.solution.model.Segmento;

public class Executor {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		c1.setNome("João");
		c1.setEmail("joao@braz.com");
		c1.setTelefone("(61)9999-8888");
		c1.setCampoAlfa("200");
		c1.setCampoBeta("10");
		c1.setCampoXadrez("10");
		
		Segmento s1 = new Segmento(c1);
		String result1 = s1.getTipoSegmento().toString();
		System.out.println(result1); // PRINTAR TIPO
		
		c2.setNome("Gustavo");
		c2.setEmail("gustavo@braz.com");
		c2.setTelefone("(61)8888-7777");
		c2.setCampoAlfa("700");
		c2.setCampoBeta("10");
		c2.setCampoXadrez("10");
		
		Segmento s2 = new Segmento(c2);
		String result2 = s2.getTipoSegmento().toString();
		System.out.println(result2); // PRINTAR TIPO
		
		c3.setNome("Anderson");
		c3.setEmail("anderson@braz.com");
		c3.setTelefone("(61)7777-6666");
		c3.setCampoAlfa("300");
		c3.setCampoBeta("478");
		c3.setCampoXadrez("8010");
		
		Segmento s3 = new Segmento(c3);
		String result3 = s3.getTipoSegmento().toString();
		System.out.println(result3); // PRINTAR TIPO
		
		List<Cliente> listaCliente = Arrays.asList(c1, c2, c3);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonResult = gson.toJson(listaCliente);
		
		System.out.println(jsonResult); // PRINTAR DADOS DE ORIGEM (CLIENTE)
		 

	}

}
