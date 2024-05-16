package avfinal.service.embaralhadores;

import avfinal.interfaces.Embaralhador;

public class InverterString implements Embaralhador {

	@Override
	public String Embaralhar(String palavra) {
		StringBuffer sb = new StringBuffer(palavra);
		sb.reverse();  
						
		palavra = sb.toString();
		return palavra;
	}
}
