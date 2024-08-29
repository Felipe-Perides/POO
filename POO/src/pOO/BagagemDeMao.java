package pOO;

public class BagagemDeMao extends Bagagem{

	public BagagemDeMao(String Descricao, double Peso, String Prior) {
		super(Descricao, Peso, Prior);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getCusto() {
		double preco=0;
		if(getPeso()>5) {
			preco = (getPeso()-20)*3*getTaxaBagagem();
		}else {
			preco = 0;
		}
		return preco;
	}
	@Override
	public String toString() {
		return "BagagemDeMao []";
	}

}
