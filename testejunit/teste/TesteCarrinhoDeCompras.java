import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import av2.Pizza;

public class TesteCarrinhoDeCompras {

	static Pizza p0 = new Pizza();
	static Pizza p1 = new Pizza(); 
	static Pizza p2 = new Pizza(); 
	static Pizza p3 = new Pizza();
	
	@BeforeClass 
	public static void atribuiValores() {
		p1.adicionarIngrediente("calabreza");
		p1.adicionarIngrediente("cebola");

		p2.adicionarIngrediente("frango");
		p2.adicionarIngrediente("catupiry");
		p2.adicionarIngrediente("azeitona");

		p3.adicionarIngrediente("calabreza");
		p3.adicionarIngrediente("bacon");
		p3.adicionarIngrediente("ovo");
		p3.adicionarIngrediente("azeitona");
		p3.adicionarIngrediente("frango");
        p3.adicionarIngrediente("catupiry");
	}
	
	@Test
	public void testeGetPreco() {
		CarrinhoDeCompras carrinho = new carrinhoDeCompras();
		carrinho.adicionarPizza(p0);
		carrinho.adicionarPizza(p1);
		carrinho.adicionarPizza(p2);
		carrinho.adicionarPizza(p3);
		
		assertEquals(58, carrinho.getTotal());
	}
	
	@Test
	public void testeAdicionarCarrinho() {
		carrinhoDeCompras carrinho = new carrinhoDeCompras();
		carrinho.adicionarPizza(p0);
		carrinho.adicionarPizza(p1); 
		carrinho.adicionarPizza(p2); 
		carrinho.adicionarPizza(p3); 
		
		assertEquals(3, Pizza.map.size()/2); 
	}

}