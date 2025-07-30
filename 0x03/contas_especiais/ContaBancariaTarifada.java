import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{
	
	private int quantidadeTransacoes;
	
	public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
		super(numeracao, taxaJurosAnual);
		this.quantidadeTransacoes = 0;
	}

	@Override
	public void depositar(double valor) throws OperacaoInvalidaException {
		super.depositar(valor);
		double tarifa = 0.1;
		super.sacar(tarifa);
		this.quantidadeTransacoes++;
	}

	@Override
	public void sacar(double valor) throws OperacaoInvalidaException {
		super.sacar(valor);
		double tarifa = 0.1;
		super.sacar(tarifa);
		this.quantidadeTransacoes++;
	}

	public int getQuantidadeTransacoes() {
		return quantidadeTransacoes;
	}
	
	

}
