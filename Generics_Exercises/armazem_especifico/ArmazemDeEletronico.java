
public class ArmazemDeEletronico<T> extends Armazem<Eletronico>{

	public ArmazemDeEletronico() {
		super();
	}

	@Override
	public void adicionarAoInventario(String nome, Eletronico item) {
		super.adicionarAoInventario(nome, item);
	}

	@Override
	public Eletronico obterDoInventario(String nome) {
		return super.obterDoInventario(nome);
	}
	
}
