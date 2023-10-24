package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	Set<Tarefa> tarefasSet;

	public ListaTarefas() {
		this.tarefasSet = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefasSet.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao, boolean ConcluidaOuNao) {
		Tarefa listaRemocao = null;
		
		for ( Tarefa t: tarefasSet) {
			if(t.getDescricao() == descricao && t.isConcluida() == ConcluidaOuNao ) {
				listaRemocao = t;
			}
		}
		tarefasSet.remove(listaRemocao);
	}
	
	public void exibirTarefas() {
		System.out.println(tarefasSet);
	}
	
	public int contarTarefas() {
		return tarefasSet.size();
	}
	
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> listaConcluidas = new HashSet<>();

		if(!tarefasSet.isEmpty()) {
			for (Tarefa t: tarefasSet) {
				if (t.isConcluida()) {
					listaConcluidas.add(t);
				}
			}
			return listaConcluidas;
		} else {
			throw new RuntimeException("Sem tarefas disponíveis!");
		}
	}
	
	
	
	
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> listaPendentes = new HashSet<>();
			for ( Tarefa t: tarefasSet) {
				if ( t.isConcluida() == false) {
					listaPendentes.add(t);
				}
			}
			return listaPendentes;
	}
	
	
	
	public void marcarComoConcluida( String descricao ) {
		for (Tarefa t: tarefasSet ) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
			}
		}
	}
	
	public void marcarComoPendente ( String descricao) {
		for (Tarefa t: tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(false);
			}
		}
	}
	
	
	public void limparTarefas () {
		if (tarefasSet.isEmpty()) {
			System.out.println("A lista já esta vazia");
		} else {
			tarefasSet.clear();
		}
		
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		listaTarefas.adicionarTarefa("Estudar Java");
		listaTarefas.adicionarTarefa("Estudar Angular");
		listaTarefas.adicionarTarefa("Estudar desenvolvimento Web");
		listaTarefas.adicionarTarefa("Estudar CSS");
		
		System.out.println("Contagem de tarefas: " + listaTarefas.contarTarefas());		
		
		listaTarefas.marcarComoConcluida("Estudar Java");
		listaTarefas.exibirTarefas();
		listaTarefas.marcarComoPendente("Estudar Angular");
		listaTarefas.exibirTarefas();
		
		System.out.println(listaTarefas.obterTarefasConcluidas());
		System.out.println(listaTarefas.obterTarefasPendentes());
		
		listaTarefas.limparTarefas();
		listaTarefas.exibirTarefas();
		listaTarefas.limparTarefas();
	
		
	}
	
}
