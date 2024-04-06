package av2;

public class Principal {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
		p1.adicionarIngrediente("calabreza");
		p1.adicionarIngrediente("cebola");

		Pizza p2 = new Pizza();
		p2.adicionarIngrediente("frango");
		p2.adicionarIngrediente("catupiry");
		p2.adicionarIngrediente("azeitona");

		Pizza p3 = new Pizza();
		p3.adicionarIngrediente("calabreza");
		p3.adicionarIngrediente("bacon");
		p3.adicionarIngrediente("ovo");
		p3.adicionarIngrediente("azeitona");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adicionarPizza(p1);
		carrinho.adicionarPizza(p2);
		carrinho.adicionarPizza(p3);

		System.out.println("Valor total da compra = R$" + carrinho.getTotal() + "\n");

		System.out.println("Quantidade de calabreza: " + Pizza.map.get("calabreza"));
		System.out.println("Quantidade de cebola: " + Pizza.map.get("cebola"));
        System.out.println("Quantidade de frango: " + Pizza.map.get("frango"));
        System.out.println("Quantidade de catupiry: " + Pizza.map.get("catupiry"));
		System.out.println("Quantidade de azeitona: " + Pizza.map.get("azeitona"));
        System.out.println("Quantidade de bacon: " + Pizza.map.get("bacon"));
		System.out.println("Quantidade de ovo: " + Pizza.map.get("ovo"));
	}
}
