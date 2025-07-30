import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
	
	private String numeracao; //identificação da conta
	private double saldo;
	private double taxaJurosAnual;
	
	public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
		this.saldo = 0;
		this.numeracao = numeracao;
		this.taxaJurosAnual = taxaJurosAnual / 100; //percentual de juros anual.
	}

	public void depositar(double valor) throws OperacaoInvalidaException {
		if (valor > 0) {
			this.saldo = getSaldo() + valor; 
		} else {
			throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
		}
		
	}

	public void sacar(double valor) throws OperacaoInvalidaException {
		if (valor >= 0) {
			if (getSaldo() >= valor) {
				this.saldo = getSaldo() - valor;
			} else {
				throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
			}
		} else {
			throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
		}	
	}

	//método que calcula a tarifa cobrada mensalmente pelo banco.
	private double calcularTarifaMensal() {
		double tarifaFixa = 10.00;
		double tarifaPercentual = getSaldo() * 0.1;
		
		if (tarifaFixa > tarifaPercentual) {
			return tarifaPercentual;
		}
		
		return tarifaFixa;
	}
	
	//método que calcula o valor em R$ do juros mensal a ser aplicado ao saldo da conta.
	private double calcularJurosMensal() {
		double taxaJurosMensal = getTaxaJurosAnual() / 12;
		
		if (getSaldo() <= 0) {
			taxaJurosMensal = 0;
		}
		
		return getSaldo() * taxaJurosMensal;
	}
	
	public void aplicarAtualizacaoMensal() {
		double saldoParcial = getSaldo() - calcularTarifaMensal();
		this.saldo = saldoParcial + calcularJurosMensal();
	}

	public String getNumeracao() {
		return numeracao;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTaxaJurosAnual() {
		return taxaJurosAnual;
	}

}
