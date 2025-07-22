package provedores;

public class JadLog implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		// o valor do frete é 7% do valor total do pedido, se peso passar de 2kg, senão o valor é 4,5% do valor do pedido.
		double percetualMaior = 0.07;
		double percetualMenor = 0.045;
		double regraPeso = 2000;
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
		return TipoProvedorFrete.JADLOG;
	}
	
}
