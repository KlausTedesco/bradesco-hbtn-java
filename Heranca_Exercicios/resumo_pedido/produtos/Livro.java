//package produtos;
//
//public class Livro extends Produto{
//
//	private int paginas;
//	private String autor;
//	private int edicao;
//	
//	public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
//		super(titulo, ano, pais, precoBruto);
//		this.paginas = paginas;
//		this.autor = autor;
//		this.edicao = edicao;
//	}
//	
//	@Override
//	public double obterPrecoLiquido() {
//		//Livros: o cálculo de seu preço líquido é seu preço bruto com acréscimo de 15%
//		double acrescimo = 1.15;
//		return precoBruto*acrescimo;
//		
//	}
//
//	public int getPaginas() {
//		return paginas;
//	}
//
//	public String getAutor() {
//		return autor;
//	}
//
//	public int getEdicao() {
//		return edicao;
//	}
//
//}
