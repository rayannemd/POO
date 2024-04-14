import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {

	static Pizza p1 = new Pizza();
	static Pizza p2 = new Pizza();
	static Pizza p3 = new Pizza();
	
	@Before
	public void Before() {
		Pizza.ZeraAtributos();
	}
	
	@Test
	public void possiveisValoresPizza() {
		Pizza p1 = new Pizza();
		p1.adicionarIngrediente("calabreza");
		p1.adicionarIngrediente("cebola");

		Pizza p2 = new Pizza();
		p2.adicionarIngrediente("frango");
		p2.adicionarIngrediente("catupiry");
		p2.adicionarIngrediente("azeitona");

		Pizza p3 = new Pizza();
		p3.adicionarIngrediente("calabreza");
		p3.adicionarIngrediente("bacon");
		p3.adicionarIngrediente("ovo");
		p3.adicionarIngrediente("azeitona");
		p3.adicionarIngrediente("frango");
        p3.adicionarIngrediente("catupiry");

		assertEquals(15, p1.getPreco());
		assertEquals(20, p2.getPreco());
		assertEquals(23, p3.getPreco());
	}
	 
	@Test
	public void verificaIngredientes() {
		Pizza p1 = new Pizza();
		p1.adicionarIngrediente("calabreza");
		p1.adicionarIngrediente("cebola");

		Pizza p2 = new Pizza();
		p2.adicionarIngrediente("frango");
		p2.adicionarIngrediente("catupiry");
		p2.adicionarIngrediente("azeitona");

		Pizza p3 = new Pizza();
		p3.adicionarIngrediente("calabreza");
		p3.adicionarIngrediente("bacon");
		p3.adicionarIngrediente("ovo");
		p3.adicionarIngrediente("azeitona");
		p3.adicionarIngrediente("frango");
        p3.adicionarIngrediente("catupiry");
		
		assertEquals(Integer.valueOf(2), Pizza.mapa.get("calabreza"));
		assertEquals(Integer.valueOf(1), Pizza.mapa.get("cebola"));
		assertEquals(Integer.valueOf(2), Pizza.mapa.get("frango"));
		assertEquals(Integer.valueOf(2), Pizza.mapa.get("catupiry"));
		assertEquals(Integer.valueOf(2), Pizza.mapa.get("azeitona"));
		assertEquals(Integer.valueOf(1), Pizza.mapa.get("bacon"));
		assertEquals(Integer.valueOf(1), Pizza.mapa.get("ovo"));
	}
}
