package pOO;

public class BagagemNormal extends Bagagem{

	public BagagemNormal(String Descricao, double Peso, String Prior) {
		super(Descricao, Peso, Prior);
	}
	@Override
	public double getCusto() {
		double preco=0;
		if(getPeso()>=20) {
			preco = (getPeso()-20)*getTaxaBagagem();
		}else {
			preco = 0;
		}
		double custoAdd = 0;
		if(getPrior().equals("normal")) {
			custoAdd=0;
		}else if(getPrior().equals("prioritario")) {
			custoAdd=5*getTaxaBagagem();
		}else if(getPrior().equals("urgente")) {
			custoAdd=10*getTaxaBagagem();
		}
		
		return preco+custoAdd;
	}
	@Override
	public String toString() {
		return "BagagemNormal []";
	}
	
}
