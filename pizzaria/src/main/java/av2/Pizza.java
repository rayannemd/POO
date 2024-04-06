package av2;

import java.util.HashMap;

public class Pizza {
    int preco = 0;
    String sabor;
	int qtd_ingredientes = 0;

	static HashMap<String, Integer> map = new HashMap<>();

    public void adicionarIngrediente(String ingrediente) {
		this.qtd_ingredientes++;
		contabilizarIngredientes(ingrediente);
	}

	private static void contabilizarIngredientes(String ingrediente) {
		if (map.containsKey(ingrediente)) {
			map.put(ingrediente, (map.get(ingrediente)) + 1);
		} else
			map.put(ingrediente, 1);
	}

	public int getPreco() {
		if (this.qtd_ingredientes <= 2){
            preco = 15;
        } else if (this.qtd_ingredientes > 2 && this.qtd_ingredientes <= 5){
			preco = 20;
        } else{
			preco = 23;
        }
        
        return preco;
	}
	
	public static void zerarIngredientes(){
		Pizza.map.clear();
	}
}
