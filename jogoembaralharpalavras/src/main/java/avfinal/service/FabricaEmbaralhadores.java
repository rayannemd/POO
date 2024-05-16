package avfinal.service;

import avfinal.interfaces.Embaralhador;
import avfinal.model.GeradorAleatorio;
import avfinal.service.embaralhadores.InverterString;
import avfinal.service.embaralhadores.TrocarParImpar;

public class FabricaEmbaralhadores {

	public Embaralhador getEmbaralhador(String num) {

		int numAleatorio = new GeradorAleatorio(32079).getNumAleatorio();
		
		if(num.equals("0")) {
			return new InverterString();
		} else if(num.equals("1")) {
			return new TrocarParImpar();
		} 
		return numAleatorio == 0 ? new InverterString() : numAleatorio < 6 ? new TrocarParImpar():new InverterString();
	}
}