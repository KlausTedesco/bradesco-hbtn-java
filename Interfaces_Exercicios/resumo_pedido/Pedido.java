import provedores.Frete;

public class Pedido {

	int codigo;
	double peso; //campo peso deve conter peso em gramas.
	double total;
	Frete frete;
	
	public Pedido(int codigo, double peso, double total) {
		super();
		this.codigo = codigo;
		this.peso = peso;
		this.total = total;
	}

	public Frete getFrete() {
		return frete;
	}
	
}
