package edu.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	Set<Convidado> conjuntoConvidado;
	
	public ConjuntoConvidados () {
		this.conjuntoConvidado = new HashSet<Convidado>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		conjuntoConvidado.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite (int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c: conjuntoConvidado) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		} 
		
		conjuntoConvidado.remove(convidadoParaRemover);
	}
	public int contarConvidados () {
		return conjuntoConvidado.size();
	}
	
	public void exibirConvidados () {
		
		System.out.println(conjuntoConvidado);
	}
	
	
	
	public static void main(String[] args) {
		
		ConjuntoConvidados conjuntoMain = new ConjuntoConvidados();
		
		
		conjuntoMain.adicionarConvidado("José", 1);
		conjuntoMain.adicionarConvidado("Paulo", 1);
		conjuntoMain.adicionarConvidado("Pedro", 1);
		conjuntoMain.adicionarConvidado("Pedro", 2);
		conjuntoMain.adicionarConvidado("Maria", 3);

		

		
		conjuntoMain.exibirConvidados();
		
		System.out.println("Existem " + conjuntoMain.contarConvidados() + " convidados dentro da lista Convidados");
		
		conjuntoMain.removerConvidadoPorCodigoConvite(1);
		
		conjuntoMain.exibirConvidados();
		
		System.out.println("Existem " + conjuntoMain.contarConvidados() + " convidados dentro da lista Convidados");
		
	}
}
