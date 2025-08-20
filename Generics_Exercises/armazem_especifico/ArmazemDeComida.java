
public class ArmazemDeComida<T> extends Armazem<Comida>{

	public ArmazemDeComida() {
		super();
	}

	@Override
	public void adicionarAoInventario(String nome, Comida item) {
		super.adicionarAoInventario(nome, item);
	}

	@Override
	public Comida obterDoInventario(String nome) {
		return super.obterDoInventario(nome);
	}
	
}
