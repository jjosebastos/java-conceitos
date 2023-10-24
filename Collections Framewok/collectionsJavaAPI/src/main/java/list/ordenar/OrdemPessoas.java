package main.java.list.ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdemPessoas {
	
	private List<Pessoa> listaOrdem;
	
	public OrdemPessoas(){
		this.listaOrdem = new ArrayList<>();
	}
	
	public void adicionarPessoas (String nome, int idade, double altura) {
		listaOrdem.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaOrdem);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaOrdem);
		Collections.sort(pessoasPorAltura, new ComparaAltura());
		return pessoasPorAltura;
	}


	
	public static void main(String[] args) {
		OrdemPessoas ordem = new OrdemPessoas();
		
		ordem.adicionarPessoas("Nome 1", 20, 1.70);
		ordem.adicionarPessoas("Nome 2", 23, 1.65);
		ordem.adicionarPessoas("Nome 3", 20, 1.80);
		ordem.adicionarPessoas("Nome 4", 16, 1.75);
	
		
		System.out.println(ordem.ordenarPorIdade());
		System.out.println(ordem.ordenarPorAltura());
	
	}
}


