/*package provedores;

public class Loggi implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		// o valor do frete é 12% do valor total do pedido, se peso passar de 5kg, senão o valor é 4% do valor do pedido.
		double percetualMaior = 0.12;
		double percetualMenor = 0.04;
		double regraPeso = 5000;
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
		return TipoProvedorFrete.LOGGI;
	}
	
}
*/