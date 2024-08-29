package pOO;

import java.util.ArrayList;

public class ListaDeBagagem {
	private ArrayList<Bagagem> listaDeBagagem;
	public ListaDeBagagem() {
		listaDeBagagem = new ArrayList<Bagagem>();
	}
	public void incluir(Bagagem mala){
		listaDeBagagem.add(mala);
	}
	public double custoTotal(ArrayList<Bagagem> lista) {
		double custoTotal = 0;
		for(Bagagem mala : lista) {
			custoTotal += mala.getCusto();
		}
		return custoTotal;
	}
	public int getTotal() {return listaDeBagagem.size();}
}
