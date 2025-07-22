package provedores;

public class Sedex implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		// o valor do frete é 10% do valor total do pedido, se peso passar de 1kg, senão o valor é 5% do valor do pedido.
		double percetualMaior = 0.10;
		double percetualMenor = 0.05;
		double regraPeso = 1000;
		double valorFrete; 
		
		if (peso > regraPeso) {
			valorFrete = valor*percetualMaior;
		} else {
			valorFrete = valor*percetualMenor;
		}
		
		return new Frete(valorFrete, obterTipoProvedorFrete());
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.SEDEX;
	}

}
