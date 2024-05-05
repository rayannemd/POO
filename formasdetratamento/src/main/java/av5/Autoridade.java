package av5;

public class Autoridade{

	protected String nome;
	protected String sobrenome;
	protected String genero;
	protected String tratamento;
	
	FormatadorNome obj;
	
	public Autoridade(String nome, String sobrenome, String genero, String tratamento){
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.genero = genero;
		this.tratamento = tratamento;
	}
	
	public String getTratamento(){
		
		switch(tratamento.toLowerCase()) {
			case "informal":
				obj = new Informal();
				break;
			case "respeitoso":
				obj = new Respeitoso(this.genero);
				break;
			default:
				obj = new ComTitulo(tratamento);
				break;
		}
		return obj.formatarNome(this.nome, this.sobrenome);	
	}
	
	
	
	

}