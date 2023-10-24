package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	
	private String nome;
	private long matricula;
	private double media;
	
	
	public Aluno(String nome, long matricula, double media) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}


	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public long getMatricula() {
		return matricula;
	}
	
	public double getMedia() {
		return media;
	}


	@Override
	public String toString() {
		return "Aluno [ nome = " + nome + ", matricula = " + matricula + ", media = " + media + "]";
	}


	@Override
	public int compareTo(Aluno o) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(o.getNome());
	}

	
}


class ComparatorPorNota implements Comparator<Aluno> {

	@Override
	public int compare(Aluno m1, Aluno m2) {
		// TODO Auto-generated method stub
		return Double.compare(m1.getMedia(), m2.getMedia());
	}
	
}
