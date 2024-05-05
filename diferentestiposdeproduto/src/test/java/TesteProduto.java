import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import av4.Produto;

public class TesteProduto {

	Produto p1;
	Produto p2;
	Produto p3;
	Produto p4;
	
	@Before
	public void Before() {
		p1 = new Produto ("BiscoitoA", 100, 1.50);
		p2 = new Produto ("Queijo", 200, 8.50);
		p3 = new Produto ("BiscoitoB", 100, 1.75);
		p4 = new Produto ("Queijo", 200, 8.50);
	}
	

	@Test
	public void testaProdutoIgual() {
		assertEquals(true, p2.equals(p4));
	}
	
	@Test
	public void testaProdutoDiferenteCodigosIguais() {
		assertEquals(true, p1.equals(p3));
	}
	
	@Test
	public void testaProdutoDiferente() {
		assertEquals(false, p1.equals(p2));
	}
}