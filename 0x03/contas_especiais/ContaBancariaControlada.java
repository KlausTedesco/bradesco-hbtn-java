/*import exceptions.OperacaoInvalidaException;

public class ContaBancariaControlada extends ContaBancariaBasica{

	private double saldoMinimo; 
	private double valorPenalidade; 
	
	public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo,
			double valorPenalidade) {
		super(numeracao, taxaJurosAnual);
		this.saldoMinimo = saldoMinimo;
		this.valorPenalidade = valorPenalidade;
	}

	@Override
	public void aplicarAtualizacaoMensal() {
		super.aplicarAtualizacaoMensal();
		//aplicar a penalidade caso o saldo esteja abaixo do saldo mínimo. 
		if (getSaldo() < getSaldoMinimo()) {
			try {
				super.sacar(getValorPenalidade());
			} catch (OperacaoInvalidaException e) {
				e.printStackTrace();
			}
		}
	}

	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public double getValorPenalidade() {
		return valorPenalidade;
	}
	
}
*/