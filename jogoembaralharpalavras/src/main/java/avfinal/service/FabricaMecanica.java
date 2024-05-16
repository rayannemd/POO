package avfinal.service;

import avfinal.controller.NDificil;
import avfinal.controller.NFacil;

public class FabricaMecanica {

	private String dificuldade;


	public FabricaMecanica(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public Mecanica getMecanica() {
		if(this.dificuldade.equals("0")) {
			return new NFacil();
		} else {
			return new NDificil();
		}
	}
}