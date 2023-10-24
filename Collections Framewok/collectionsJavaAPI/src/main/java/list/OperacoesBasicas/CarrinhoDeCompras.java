package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> listaCarrinho;
	
	public CarrinhoDeCompras () {
		this.listaCarrinho = new ArrayList<>();
	}
	
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaCarrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		
		List <Item> itensList = new ArrayList<>();
		
		if (!listaCarrinho.isEmpty()) {
			
			for (Item i: listaCarrinho) {
				if (i.getNome().equalsIgnoreCase(nome)){
					itensList.add(i);
				} 
			} 
				listaCarrinho.removeAll(itensList);
		} else {
			System.out.println("A lista está vazia!");
			
	} 
}
	
	
	public double obterValorTotal () {
	
		double valorTotal = 0;
		
		if (!listaCarrinho.isEmpty()) {
			for (Item item : listaCarrinho) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem;
			} 
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
		
	}
	
	
	public void exibirItens () {
		System.out.println(listaCarrinho);
	}

	public static void main(String[] args) {
		CarrinhoDeCompras listaCarrinho = new CarrinhoDeCompras();

		
		listaCarrinho.adicionarItem("Chocolate",1.40,1);
		listaCarrinho.adicionarItem("Bolo",150,1);
		listaCarrinho.adicionarItem("Chocolate",1.40,1);
		listaCarrinho.adicionarItem("Chinelo", 12.50, 1);
		System.out.println("Valor Total do carrinho: " +  listaCarrinho.obterValorTotal());
		
		listaCarrinho.removerItem("Chocolate");
		System.out.println("Valor Total do carrinho: " +  listaCarrinho.obterValorTotal());
		listaCarrinho.exibirItens();
		
		
		
	}
	
	
}
