package av2;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    int total = 0;

	ArrayList<Pizza> lista = new ArrayList<>();

	public void adicionarPizza(Pizza pizza) {
		if (pizza.qtd_ingredientes != 0) {
			lista.add(pizza);
		}
	}

	public int getTotal() {
		for (int i = 0; i < lista.size(); i++) {
			total += lista.get(i).getPreco();
		}
		return total;
	}
}
