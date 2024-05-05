package av5;

public class Respeitoso implements FormatadorNome {
	
	private String genero;

	public Respeitoso(String genero) {
		super();
		this.genero = genero;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(genero=="masculino"){
			return "Sr. "+ nome + " " + sobrenome;
		} else if (genero=="feminino"){
			return "Sra. "+ nome + " " + sobrenome;
		} else {
            return "Não definido";
        }
	}
}