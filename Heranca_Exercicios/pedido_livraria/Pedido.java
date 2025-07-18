//import java.text.DecimalFormat;
//
//public class Pedido {
//
//	private double percentualDesconto;
//	private ItemPedido[] itens;
//	
//	public Pedido(double percentualDesconto, ItemPedido[] itens) {
//		super();
//		this.percentualDesconto = percentualDesconto;
//		this.itens = itens;
//	}
//	
//	public double calcularTotal() {
//		//Deve percorrer cada um dos itens contidos no pedido 
//		//e somar a quantidade solicitada pelo preco líquido do produto, 
//		//deve-se também aplicar o percentual de desconto ao total dos itens.
//		double valorTotal = 0; 	
//		for (ItemPedido item : itens) {
//            double valor = calcularValorPelaQuantidadeItem(item);
//            valorTotal+=valor;
//        }
//		
//		return aplicarDescontoTotal(valorTotal);
//		
//	}
//
//	private double aplicarDescontoTotal(double valorTotal) {
//		return valorTotal*(1-(percentualDesconto/100));
//	}
//
//	private double totalDesconto(double valorTotal) {
//		return valorTotal*(percentualDesconto/100);
//	}
//	
//	private double calcularValorPelaQuantidadeItem(ItemPedido item) {
//		return item.getProduto().obterPrecoLiquido()*item.getQuantidade();
//	}
//	
//	public void apresentarResumoPedido(){
////		------- RESUMO PEDIDO -------
////		Tipo: Livro  Titulo: Um de nos esta mentindo  Preco: 40,17  Quant: 1  Total: 40,17
////		Tipo: Livro  Titulo: Mindset Milionario  Preco: 36,46  Quant: 2  Total: 72,91
////		Tipo: Dvd  Titulo: Anjos da Noite 5 - Guerras de Sangue  Preco: 20,28  Quant: 1  Total: 20,28
////		----------------------------
////		DESCONTO: 6,67
////		TOTAL PRODUTOS: 133,36
////		----------------------------
////		TOTAL PEDIDO: 126,69
////		----------------------------
//		double valorTotal = 0; 	
//		System.out.println("------- RESUMO PEDIDO -------");
//		for (ItemPedido item : itens) {
//            System.out.println("Tipo: "+item.getProduto().getClass().getSimpleName()+"  Titulo: "+item.getProduto().getTitulo()
//            		+"  Preco: "+formatarDuasCasasDecimais(item.getProduto().obterPrecoLiquido())+"  Quant: "+item.getQuantidade()
//            		+"  Total: "+formatarDuasCasasDecimais(calcularValorPelaQuantidadeItem(item)));
//            valorTotal+=calcularValorPelaQuantidadeItem(item);
//        }
//		System.out.println("----------------------------");
//		System.out.println("DESCONTO: "+formatarDuasCasasDecimais(totalDesconto(valorTotal)));
//		System.out.println("TOTAL PRODUTOS: "+formatarDuasCasasDecimais(valorTotal));
//		System.out.println("----------------------------");
//		System.out.println("TOTAL PEDIDO: "+formatarDuasCasasDecimais(aplicarDescontoTotal(valorTotal)));
//		System.out.println("----------------------------");
//
//	}
//
//	private String formatarDuasCasasDecimais(double variavel) {
//		DecimalFormat dfa = new DecimalFormat("0.00");
//		return dfa.format(variavel);
//	}
//
//	public double getPercentualDesconto() {
//		return percentualDesconto;
//	}
//
//	public ItemPedido[] getItens() {
//		return itens;
//	}
//
//}
