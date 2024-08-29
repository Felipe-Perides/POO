package pOO;

abstract class Bagagem {
	private String prior;
	private double peso;
	private String descricao;
	private double taxaBagagem;
	
	public abstract double getCusto();
	
	public Bagagem(String Descricao, double Peso, String Prior) {
		this.descricao=Descricao;
		this.peso=Peso;
		this.prior=Prior;
		this.taxaBagagem=calculoTaxa(prior);
	}
	public String getPrior() {
		return prior;
	}
	public void setPrior(String prior) {
		this.prior = prior;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double calculoTaxa(String prior) {
		if(prior.equals("urgente")) {
			taxaBagagem=8;
			return taxaBagagem;
		}else if(prior.equals("prioritario")) {
			taxaBagagem=5;
			return taxaBagagem;
		}else if(prior.equals("normal")) {
			taxaBagagem=3;
			return taxaBagagem;
		}else {
			return -1;
		}
	}
	
	public double getTaxaBagagem() {
		return taxaBagagem;
	}

	public void setTaxaBagagem(double taxaBagagem) {
		this.taxaBagagem = taxaBagagem;
	}

	@Override
	public String toString() {
		return "Bagagem [prior=" + prior + ", peso=" + peso + ", descricao=" + descricao + "]";
	}
	
}
