package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List<Integer> listaNumeros;
	
	public SomaNumeros (){

		this.listaNumeros = new ArrayList<>();
	}
	
	public void adicionarNumeros (int numero) {
		this.listaNumeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		
		for (Integer numero: listaNumeros) {
			soma += numero;
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		
		int maiorNumero = Integer.MIN_VALUE;
		
		if(!listaNumeros.isEmpty()) {
			for (Integer i: listaNumeros) {
				if (i >= maiorNumero) {
					maiorNumero = i;
				}
			}
			return maiorNumero;
		} else {
		      throw new RuntimeException("A lista está vazia!");
	    }
	}
		
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		
		if(!listaNumeros.isEmpty()) {
			for (Integer i: listaNumeros) {
				if (i <= menorNumero) {
					menorNumero = i;
				}
			}
			return menorNumero;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	
	public void exibirNumeros() {
		
		if (!listaNumeros.isEmpty()) {
			System.out.println(this.listaNumeros);
		} else {
			System.out.println("Sua lista está vazia!");
		}
	}
	
	
	public static void main(String[] args) {
		SomaNumeros soma = new SomaNumeros();
		
		soma.adicionarNumeros(10);
		soma.adicionarNumeros(0);
		soma.adicionarNumeros(40);
		soma.adicionarNumeros(7);
		soma.adicionarNumeros(-5);
		
		System.out.println("Números Adicionados: ");
		soma.exibirNumeros();
		
		System.out.println("Soma dos números: " + soma.calcularSoma());
		
		System.out.println("Encontrar maior número: " + soma.encontrarMaiorNumero());
		
		System.out.println("Encontrar maior número: " + soma.encontrarMenorNumero());
	}
	
}
	
	

