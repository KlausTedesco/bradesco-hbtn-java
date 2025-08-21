/*import java.text.DecimalFormat;

public class Eletronico {
	
	private String descricao;
	private double valor;
	
	public Eletronico(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	@Override
	public String toString() {
        DecimalFormat formato = new DecimalFormat("#.000000");
        formato.setDecimalSeparatorAlwaysShown(true); 
        formato.setGroupingUsed(false);
		return "["+ descricao +"] R$ "+ formato.format(this.valor);
	}

}
*/