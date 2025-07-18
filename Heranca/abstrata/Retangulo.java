import java.text.DecimalFormat;

public class Retangulo extends FormaGeometrica{

	protected double largura;
	protected double altura;
	
	@Override
	public double area() {
		return largura*altura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(double largura) throws IllegalArgumentException {
		if(largura<0){
			throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
		}else {
			this.largura = largura;			
		}
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		if(altura<0){
			throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
		}else {
			this.altura = altura;			
		}
	}

	@Override
	public String toString() {
        DecimalFormat dfl = new DecimalFormat("#.00");
        String larguraFormatada = dfl.format(largura);
        DecimalFormat dfa = new DecimalFormat("#.00");
        String alturaFormatada = dfa.format(altura);
		return "[Retangulo] "+ larguraFormatada + " / " + alturaFormatada;
	}

	
}
