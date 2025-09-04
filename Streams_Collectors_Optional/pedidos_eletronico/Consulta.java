/*import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
		List<Produto> listaDeProdutos = pedido.getProdutos();

		List<Produto> listaDeLivros = listaDeProdutos.stream()
				.filter(p -> p.getCategoriaProduto().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());

		return listaDeLivros;
	}

	public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
		Produto produtoMaiorPreco = null;
		Optional<Produto> produtoOptional = produtos.stream().max(Comparator.comparingDouble(Produto::getPreco));

		if (produtoOptional.isPresent()) {
			produtoMaiorPreco = produtoOptional.get();
		}

		return produtoMaiorPreco;
	}

	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
		List<Produto> listaProdutosFiltrado = produtos.stream().filter(p -> p.getPreco() >= precoMinimo)
				.collect(Collectors.toList());

		return listaProdutosFiltrado;
	}

	public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {			
		List<Pedido> listaPedidosFiltrado = pedidos.stream()
				.filter(pedido -> pedido.getProdutos().stream()
						.anyMatch(produto -> produto.getCategoriaProduto().equals(CategoriaProduto.ELETRONICO))) 
//				.flatMap(pedido -> pedido.getProdutos().stream()) 
	//			.filter(produto -> produto.getCategoriaProduto().equals(CategoriaProduto.ELETRONICO)) 
				.collect(Collectors.toList()); 
		
		return listaPedidosFiltrado;
	}
}
*/