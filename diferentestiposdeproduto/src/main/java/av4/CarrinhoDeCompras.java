package av4;

import java.util.HashMap;
import java.util.Map; 

public class CarrinhoDeCompras {

	public static Map<Produto, Integer> carrinho = new HashMap<>(); 
	private static double total = 0;

	public void adicionaProduto(Produto produto, int quantidade) {
		int quantidadeNoCarrrinho;

		if (carrinho.containsKey(produto)) {
			quantidadeNoCarrrinho = carrinho.get(produto);
			somaParcial(produto, quantidade);
			carrinho.put(produto, quantidade += quantidadeNoCarrrinho);
		} else {
			carrinho.put(produto, quantidade);
			somaParcial(produto, quantidade);
		}
	}

	public void removeProduto(Produto produto, int quantidade) {
		if (carrinho.containsKey(produto)) {
			carrinho.merge(produto, quantidade, (x, y) -> {
				return x - y < 1 ? null : x - y;
			});
			total -= produto.getPreco() * quantidade;
		}
	}

	public double valorCompra() {
		return total;
	}

	private void somaParcial(Produto produto, int quantidade) {
		total += produto.getPreco() * quantidade;
	}
		
	public void limparCarrinho(){
		carrinho.clear();
		total = 0;
	}
}