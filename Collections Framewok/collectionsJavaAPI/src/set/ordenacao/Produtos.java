package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos>{
	
	private String nome;
	private long cod;
	private double preco;
	private int quantidade;
	
	public Produtos(String nome, long cod, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
		
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		return cod == other.cod;
	}



	public long getCod() {
		return cod;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	@Override
	public int compareTo(Produtos p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}
	

}

class ComparatorPorPreco implements Comparator<Produtos> {

	@Override
	public int compare(Produtos p1, Produtos p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(),p2.getPreco());
	}
	
}