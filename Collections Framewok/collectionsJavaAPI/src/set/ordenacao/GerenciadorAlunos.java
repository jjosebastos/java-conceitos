package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	
	Set<Aluno> alunosSet;
	
	public GerenciadorAlunos () {
		this.alunosSet = new HashSet<>();
	}
	
	public void adicionarAlunos(String nome, long matricula, double media) {
		alunosSet.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		if (!alunosSet.isEmpty()) {
			if (alunosSet.contains(matricula)) {
				alunosSet.remove(matricula);
			} else {
				throw new RuntimeException("Aluno inexistente");
			}
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> exibirPorNome = new TreeSet<>(alunosSet);
		return exibirPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorMedia(){
		Set<Aluno> exibirPorMedia = new TreeSet<>(new ComparatorPorNota());
		exibirPorMedia.addAll(alunosSet);
		return exibirPorMedia;
	}
	
	public void exibirAlunos () {
		System.out.println(alunosSet);
	}
	
	public static void main(String[] args) {
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
		
		gerenciadorAlunos.adicionarAlunos("José Bezerra", 1L, 8.5D);
		gerenciadorAlunos.adicionarAlunos("Ana Silveira", 2L, 9.5D);
		gerenciadorAlunos.adicionarAlunos("Lucas Rosa", 3L, 5.5D);
		gerenciadorAlunos.adicionarAlunos("Paula Andrade", 3L, 8.5D);
		
		
		gerenciadorAlunos.exibirAlunos();
		
		System.out.println("\nExibindo alunos ordenados por nome: " + gerenciadorAlunos.exibirAlunosPorNome());
		
		System.out.println("\nExibindo alunos ordenados por media: " + gerenciadorAlunos.exibirAlunosPorMedia());
		
		
	}
}
