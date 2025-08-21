/*import java.util.HashMap;
import java.util.Map;

abstract class Armazem<T> implements Armazenavel<T>{
	
	private Map<String, T> itensArmazenados;
	
	public Armazem() {
		this.itensArmazenados = new HashMap<>(); 
	}

	@Override
	public void adicionarAoInventario(String nome, T item) {
		this.itensArmazenados.put(nome, item);	
	}

	@Override
	public T obterDoInventario(String nome) {
		return this.itensArmazenados.get(nome);
	}

}
*/