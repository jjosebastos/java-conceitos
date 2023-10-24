package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> listaLivro;
	
	public CatalogoLivros() {
		
		this.listaLivro = new ArrayList<>();
	}
	
	
	public void adicionarLivro (String titulo, String autor, int ano) {
		listaLivro.add(new Livro(titulo, autor, ano));
	}
	
	public List<Livro>pesquisaAutor (String autor) {
		
		List<Livro> livrosPorAutor = new ArrayList<>();
	
		if(!listaLivro.isEmpty()) {
			for (Livro l : listaLivro) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			} 
			return livrosPorAutor; 
			} else {
			throw new RuntimeException("A lista está vazia");
		}
		
	}
	
	public List<Livro> pesquisaIntervaloAnos(int anoInicial, int anoFinal) {
		
		List<Livro> livrosPorAno = new ArrayList<>();
		
		if(!listaLivro.isEmpty()) {
			for (Livro a: listaLivro) {
				if (a.getAno() >= anoInicial && a.getAno() <= anoFinal) {
					livrosPorAno.add(a);
				} 
			}
			return livrosPorAno;
		} else {
			throw new RuntimeException("Sem livros na lista");
		}
	}
	

	public Livro pesquisaPorTitulo (String titulo) {
		Livro livroPorTitulo = null;
		
		if (!listaLivro.isEmpty()) {
			
			for (Livro l: listaLivro) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
			return livroPorTitulo;
		} else {
			throw new RuntimeException("Lista Vazia");
		}
		
		
	}
	
	public void exibirLivros () {
		System.out.println(listaLivro);
	}
	

	

	public static void main(String[] args) {
		
		CatalogoLivros listaLivro = new CatalogoLivros();
		
		listaLivro.adicionarLivro("A revolução dos bichos", "George Orwell", 1983);
		listaLivro.adicionarLivro("1984", "George Orwell", 1973);
		listaLivro.adicionarLivro("Pálido ponto Azul", "Carl Sagan", 1984);
		listaLivro.adicionarLivro("O mundo assombrado por demônios", "Carl Sagan", 1984);

		System.out.println("Pesquisa por Autor: "+ listaLivro.pesquisaAutor("Carl Sagan")); 
		System.out.println("Pesquisa por anos: " + listaLivro.pesquisaIntervaloAnos(1973, 1983));
		
		System.out.println("Pesquisa por título: " + listaLivro.pesquisaPorTitulo("1984"));
	}
	
}

