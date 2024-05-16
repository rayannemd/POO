import static org.junit.Assert.*;

import org.junit.Test;

import avfinal.service.embaralhadores.InverterString;
import avfinal.service.embaralhadores.TrocarParImpar;

public class Teste {
    
	String palavra = "gatopreto";
	
	@Test
	public void testEmbaralharAoContrario() {
		InverterString e = new InverterString();
		assertEquals("oterpotag",e.Embaralhar(palavra));
	}

	@Test
	public void testEmbaralharParImpar() {
		TrocarParImpar e = new TrocarParImpar();
		assertEquals("gotparote",e.Embaralhar(palavra));
	}
}
