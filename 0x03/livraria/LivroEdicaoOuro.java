public class LivroEdicaoOuro extends Livro{

	//Livros Edição Ouro: é uma edição mais cara, neste tipo de livro aplica-se 30% do preço original do livro.
	public LivroEdicaoOuro(String titulo, String autor, double preco) throws Exception {
		super(titulo, autor, preco);
	}

	@Override
	public double getPreco() {
		double percentualEdicaoOuro = 1.30;
		double precoPadrao = super.getPreco();
		return precoPadrao * percentualEdicaoOuro;
	}
	
}
