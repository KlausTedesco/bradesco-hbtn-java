import java.text.DecimalFormat;

public class Comida {
		
	private String nome;
	private double calorias;
	private double preco;
	
	public Comida(String nome, double calorias, double preco) {
		super();
		this.nome = nome;
		this.calorias = calorias;
		this.preco = preco;
	}

	@Override
	public String toString() {
        DecimalFormat formato = new DecimalFormat("#.000000");
        formato.setDecimalSeparatorAlwaysShown(true); 
        formato.setGroupingUsed(false);
		return "["+ nome +"] "+ formato.format(this.calorias) +" R$ "+ formato.format(this.preco);
	}
	
}
