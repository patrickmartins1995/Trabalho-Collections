package control;

import model.*;

public class Programa {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto(1, "produto01", null);
		Pedido pedido = new Pedido(1, "pedido legal", null);
		
		pedido.addProduto(produto1);
		ItemPedido ip = new ItemPedido(0, produto1, pedido);
		
		
		
	
	}

}
