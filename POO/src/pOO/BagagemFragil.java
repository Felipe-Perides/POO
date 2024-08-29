package pOO;

public class BagagemFragil extends Bagagem{

	private double valorSeguro;
	public BagagemFragil(String Descricao, double Peso, String Prior) {
		super(Descricao, Peso, Prior);
		this.valorSeguro=20;
	}

	public double getValorSeguro() {return valorSeguro;}
	public void setValorSeguro(double ValorSeguro) {this.valorSeguro=ValorSeguro;}
	
	@Override
	public double getCusto() {
		double preco=valorSeguro;
		double custoAdd = 0;
		if(getPrior().equals("prioritario")) {
			custoAdd=5*getTaxaBagagem();
		}else if(getPrior().equals("urgente")) {
			custoAdd=10*getTaxaBagagem();
		}
		return preco+custoAdd;
	}

	@Override
	public String toString() {
		return "BagagemFragil [valorSeguro=" + valorSeguro + "]";
	}
	
}
