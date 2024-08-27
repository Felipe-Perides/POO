package pOO;

public class ItemVenda {
	private int quant;
	private Produto produto;
	public ItemVenda(int quant, Produto produto) {
		this.quant=quant;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	@Override
	public String toString() {
		return "ItemVenda [quant=" + quant + ", produto=" + produto + "]";
	}
	
}
