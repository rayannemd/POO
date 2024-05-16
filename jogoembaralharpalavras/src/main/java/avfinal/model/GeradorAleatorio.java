package avfinal.model;

import java.util.Random;

public class GeradorAleatorio {
    
	private int num;

	public GeradorAleatorio(int num) {
		this.num = num;
	}
	
	public int getNumAleatorio() {
		Integer numAleatorio = new Random().nextInt(num);
		return numAleatorio;
	}
}
