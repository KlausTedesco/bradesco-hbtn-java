/*import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

	private List<Tarefa> tarefas;

	public ListaTodo() {
		this.tarefas = new ArrayList<Tarefa>();
	}
	
	public void adicionarTarefa(Tarefa novaTarefa) {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == novaTarefa.getIdentificador()) {
				throw new IllegalArgumentException("Tarefa com identificador "+ tarefa.getIdentificador() +" ja existente na lista");
			}
		}
		
		tarefas.add(novaTarefa);
	}
	
	public boolean marcarTarefaFeita(int identificador) {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == identificador) {
				tarefa.setEstahFeita(true);
				return true;
			}
		}
		return false;
	}
	
	public boolean desfazerTarefa(int identificador) {
		for(Tarefa tarefa : tarefas) {
			if(tarefa.getIdentificador() == identificador) {
				tarefa.setEstahFeita(false);
				return true;
			}
		}
		return false;
	}
	
	public void desfazerTodas() {
		tarefas.stream().forEach(t -> t.setEstahFeita(false));
	}
	
	public void fazerTodas() {
		tarefas.stream().forEach(t -> t.setEstahFeita(true));
	}
	
	public void listarTarefas() {
		for(Tarefa tarefa : tarefas) {
			System.out.println("["+ (tarefa.isEstahFeita()? "X" : " ")  +"]  Id: "+ tarefa.getIdentificador() +" - Descricao: "+ tarefa.getDescricao());
		}
	}
	
}
*/