/*import java.util.ArrayList;

public class Pedido {

	private ArrayList<PedidoCookie> cookies;

	public Pedido() {
		this.cookies = new ArrayList<PedidoCookie>();
	}

	public void adicionarPedidoCookie(PedidoCookie novoPedido) {
		for(PedidoCookie pedido : cookies) {
			if(pedido.getSabor().equals(novoPedido.getSabor())) {
				int caixasExistentes = pedido.getQuantidadeCaixas();
				pedido.setQuantidadeCaixas(caixasExistentes+novoPedido.getQuantidadeCaixas());
				return;
			} 
		}
		cookies.add(novoPedido);
		
	}

	public int obterTotalCaixas() {
		int total = 0;
		for (PedidoCookie pedido : cookies) {
			total += pedido.getQuantidadeCaixas();
		}

		return total;
	}

	public int removerSabor(String sabor) {
		int total = 0;
		for (PedidoCookie pedido : cookies) {
			if (sabor.equals(pedido.getSabor())) {
				total = pedido.getQuantidadeCaixas();
				cookies.remove(pedido);
				break;
			}
		}

		return total;
	}
}
*/