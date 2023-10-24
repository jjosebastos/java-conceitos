package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	Set<Produtos> produtosSet;
	
	public CadastroProdutos () {
		this.produtosSet = new HashSet<>();
	}
	
	public void adicionarProdutos(String nome, long cod, double preco, int quantidade) {
		produtosSet.add(new Produtos(nome, cod, preco, quantidade));
	}
	
	public Set<Produtos> ordenarPorNome() {
		Set<Produtos> ordenarNome = new TreeSet<>(produtosSet);
		return ordenarNome; 
	}
	
	public Set<Produtos> ordernarPorPreco(){
		Set<Produtos> ordenarPreco = new TreeSet<>(new ComparatorPorPreco());
		ordenarPreco.addAll(produtosSet);
		return ordenarPreco;
	}
	
	public static void main(String[] args) {
		
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProdutos("Tenis", 2L, 10D, 5);
		cadastroProdutos.adicionarProdutos("Patins 2", 2L, 20D, 2);
		cadastroProdutos.adicionarProdutos("Skate", 1L, 30D, 3);
		cadastroProdutos.adicionarProdutos("Calça", 3L, 15D, 1);
		
		System.out.println(cadastroProdutos.produtosSet);
		
		System.out.println("\nProdutos ordernados por nome: \n"+ cadastroProdutos.ordenarPorNome());
		
		System.out.println("\nProdutos ordenados por preço: \n" + cadastroProdutos.ordernarPorPreco());
	}
}
