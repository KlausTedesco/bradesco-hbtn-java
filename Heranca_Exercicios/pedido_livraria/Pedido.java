public class Pedido {

	private double percentualDesconto;
	private ItemPedido[] itens;
	
	public Pedido(double percentualDesconto, ItemPedido[] itens) {
		super();
		this.percentualDesconto = percentualDesconto;
		this.itens = itens;
	}
	
	public double calcularTotal() {
		//Deve percorrer cada um dos itens contidos no pedido 
		//e somar a quantidade solicitada pelo preco líquido do produto, 
		//deve-se também aplicar o percentual de desconto ao total dos itens.
		double valorTotal = 0; 	
		for (ItemPedido item : itens) {
            double valor = item.getProduto().obterPrecoLiquido()*item.getQuantidade();
            valorTotal+=valor;
        }
		
		return valorTotal*(1-(percentualDesconto/100));
		
	}

	public double getPercentualDesconto() {
		return percentualDesconto;
	}

	public ItemPedido[] getItens() {
		return itens;
	}

}
