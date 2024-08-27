package pOO;

import java.util.ArrayList;

public class Venda {
	public Venda(Cliente cliente) {
		
	}
	public void inserir(ItemVenda produto, ArrayList<ItemVenda>quantCarrinho) {
		quantCarrinho.add(produto);
	}
	public void inserirLista(Produto produto, ArrayList<Produto> carrinho) {
		carrinho.add(produto);
	}
	public double valorTotal(ArrayList<ItemVenda>quantCarrinho, ArrayList<Produto> carrinho) {
		double valorT = 0;
		for(int i = 0; i<quantCarrinho.size();i++) {
			valorT += quantCarrinho.get(i).getQuant()*carrinho.get(i).getPreco();
		}
		return valorT; 
	}
}
