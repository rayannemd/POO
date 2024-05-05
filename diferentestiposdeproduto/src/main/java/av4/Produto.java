package av4;

public class Produto {

	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(String nome, int codigo, double preco){
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	public double getPreco(){
		return this.preco;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getCodigo(){
		return this.codigo;
	}

	@Override
	public int hashCode() {
		return this.codigo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Produto other = (Produto) obj;
		
		if (codigo != other.codigo)
			return false;
            
		return true;
	}
}