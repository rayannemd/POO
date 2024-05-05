

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import av5.Autoridade;

public class Teste {

	private static Autoridade[] vetorAutoridade = new Autoridade[6];
	
	@Before
	public void inicializaInstancias(){

		vetorAutoridade[0] = new Autoridade("Stephen", "Hawking", "masculino", "Informal");
		vetorAutoridade[1] = new Autoridade("Marie", "Curie", "feminino", "Informal");
		vetorAutoridade[2] = new Autoridade("Ada", "Lovelace", "feminino", "Respeitoso");
		vetorAutoridade[3] = new Autoridade("Isaac", "Newton", "masculino", "Sir.");
        vetorAutoridade[4] = new Autoridade("Carl", "Sagan", "masculino", "Respeitoso");
        vetorAutoridade[5] = new Autoridade("Margaret", "Hamilton", "feminino", "Dra.");
	}
	
	@Test
	public void RespeitosoMasculino() {
		assertTrue("Erro: Informal Masculino", vetorAutoridade[0].getTratamento().equals("Stephen"));
	}
	@Test
	public void RespeitosoFeminino() {
		assertTrue("Erro: Informal Femino", vetorAutoridade[1].getTratamento().equals("Marie"));
	}
	@Test
	public void TituloMasculino() {
		assertTrue("Erro: Respeitoso Masculino", vetorAutoridade[4].getTratamento().equals("Dr. Carl Sagan"));
	}
	@Test
	public void TituloFemino() {
		assertTrue("Erro: Respeitoso Femino", vetorAutoridade[3].getTratamento().equals("Sra. Ada Lovelace"));
	}
	@Test
	public void InformalMasculino() {
		assertTrue("Erro: ComTitulo Masculino", vetorAutoridade[3].getTratamento().equals("Sir Isaac Newton"));
	}
	@Test
	public void InformalFeminino() {
		assertTrue("Erro: ComTitulo Femino", vetorAutoridade[3].getTratamento().equals("Dra. Margaret Hamilton"));
	}

} 
