package pOO;

import java.util.ArrayList;

public class VendasAPP {
	public static void main(String[] args) {
		Cliente um = new Cliente("André","120");
		Cliente dois = new Cliente("Luis","121");
		Cliente tres = new Cliente("Lucas","122");
		Produto one = new Produto(167239,19.90,"Bolo");
		Produto two = new Produto(162139,50,"Teclado");
		Produto three = new Produto(141239,49.90,"Mouse");
		Produto four = new Produto(139039,34.90,"Bola");
		ItemVenda uno = new ItemVenda(3,one);
		ItemVenda dos = new ItemVenda(1,two);
		ItemVenda treS = new ItemVenda(5,three);
		ItemVenda cuatro = new ItemVenda(4,four);
		ArrayList<Produto> carrinho = new ArrayList<Produto>();
		ArrayList<ItemVenda> quantCarrinho = new ArrayList<ItemVenda>();
		Venda cliente = new Venda(um);
		cliente.inserirLista(four, carrinho);
		cliente.inserir(cuatro, quantCarrinho);
		cliente.inserirLista(three, carrinho);
		cliente.inserir(treS, quantCarrinho);
		cliente.inserirLista(two, carrinho);
		cliente.inserir(dos, quantCarrinho);
		System.out.println(cliente.valorTotal(quantCarrinho, carrinho));
	}
}
