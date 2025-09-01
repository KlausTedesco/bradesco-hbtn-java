/*import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto{
	
	private String nome;
	private double preco;
	private double percentualMarkup;
	public Supplier<Double> precoComMarkup = new Supplier<Double>() {
		
		@Override
		public Double get() {
			return getPreco() * (1 + (getPercentualMarkup()/100));
		}
	}
	;
	public Consumer<Double> atualizarMarkup = new Consumer<Double>() {
		
		@Override
		public void accept(Double novoPercentualMarkup) {
			setPercentualMarkup(novoPercentualMarkup);				
		}
	};
	
	public Produto(double preco, String nome) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.percentualMarkup = 10.00;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPercentualMarkup() {
		return percentualMarkup;
	}

	public void setPercentualMarkup(double percentualMarkup) {
		this.percentualMarkup = percentualMarkup;
	}

}
*/