package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	Set<String> conjuntoPalavras;
	
	public ConjuntoPalavrasUnicas() {
		this.conjuntoPalavras = new HashSet<>();
	}
	
	public void adicionarPalavraExistente(String palavra) {
		conjuntoPalavras.add(palavra);
	}
	
	public void removerPalavraExistente(String palavra) {
		if (!conjuntoPalavras.isEmpty()) {
				if (conjuntoPalavras.contains(palavra)) {
					conjuntoPalavras.remove(palavra);		
				}  else {
					throw new RuntimeException("Lista de palavras vazia!");
				}	
		}	
	}		
		

	
	public boolean verificarPalavraUnica(String palavra) {
		return conjuntoPalavras.contains(palavra);
			
	}
	
	public void verificarTodasPalavras() {
		System.out.println(conjuntoPalavras);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoMain = new ConjuntoPalavrasUnicas();
		
		
		conjuntoMain.adicionarPalavraExistente("Java");
		conjuntoMain.adicionarPalavraExistente("C#");
		conjuntoMain.adicionarPalavraExistente("C++");
		conjuntoMain.adicionarPalavraExistente("Python");
		conjuntoMain.adicionarPalavraExistente("SQL");
		conjuntoMain.adicionarPalavraExistente("TypeScript");
		conjuntoMain.adicionarPalavraExistente("JavaScript");
		conjuntoMain.verificarTodasPalavras();
		
		conjuntoMain.removerPalavraExistente("Java");
		conjuntoMain.verificarTodasPalavras();
		
		
		System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoMain.verificarPalavraUnica("Java"));
		
		
	}
}
