package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	Set<Convidado> convidadosSet;

	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<>();
	}
	
	public void adicionarConvidados(String nome, int codigoConvidado) {
		convidadosSet.add(new Convidado(nome, codigoConvidado));
	}
	
	public void removerConvidadosPorCodigo(int codigoConvidado) {
		Convidado listaDeRemocao = null;
		
		for (Convidado c: convidadosSet) {
			if (c.getCodigoConvite() == codigoConvidado) {
				listaDeRemocao = c;
			}
		}
		convidadosSet.remove(listaDeRemocao);
		
	}
	public void exibirCandidatos() {
		System.out.println(convidadosSet);
	}
	public int contarConvidados () {
		return convidadosSet.size();
	}
	
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidados("José", 12340);
		conjuntoConvidados.adicionarConvidados("Maria", 12340);
		conjuntoConvidados.adicionarConvidados("Vanessa", 12345);
		conjuntoConvidados.adicionarConvidados("Caio", 12346);
		
	
		System.out.println("O número atual de convidados é: " + conjuntoConvidados.contarConvidados());
		conjuntoConvidados.exibirCandidatos();
		
		conjuntoConvidados.removerConvidadosPorCodigo(12346);
		
		
		System.out.println("O número atual de convidados é: " + conjuntoConvidados.contarConvidados());
		conjuntoConvidados.exibirCandidatos();
	}
	
		
}
