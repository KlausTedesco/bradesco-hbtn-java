/*import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
	
	private String titulo;
	private String autor;
	private double preco;
	
	public Livro(String titulo, String autor, double preco) throws Exception {
		super();
		setTitulo(titulo);
		setAutor(autor);
		setPreco(preco);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setTitulo(String titulo) throws LivroInvalidoException {
		//Título do livro deve possuir pelo menos 3 caracteres, senão Titulo de livro invalido - Exceção: LivroInvalidoException.
		if ( titulo.length() >= 3 ) {
			this.titulo = titulo;			
		} else {
			throw new LivroInvalidoException("Titulo de livro invalido");
		}
	}

	public void setAutor(String autor) throws AutorInvalidoException {
		//Nome do autor deve possuir pelo menos dois nomes, senão Nome de autor invalido - Exceção: AutorInvalidoException.
		if ( autor.trim().split("\\s+").length >= 2 ) {
			this.autor = autor;			
		} else {
			throw new AutorInvalidoException("Nome de autor invalido");
			
		}
	}

	public void setPreco(double preco) throws LivroInvalidoException {
		//Preço do livro deve ser maior que 0, senão Preco de livro invalido - Exceção: LivroInvalidoException.
		if ( preco > 0 ) {
			this.preco = preco;
		} else {
			throw new LivroInvalidoException("Preco de livro invalido");
		}
	}

}
*/