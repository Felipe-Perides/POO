package pOO;


// Atividade 1 --> 3.12 
public class Invoice {
	//deve representar a fatura de um item vendido
	private String num, descricao;
	private int quant;
	private double preco;
	public Invoice(String Num,String Descricao, int Quant, double Preco ) {
		this.num = Num;
		this.descricao = Descricao;
		this.preco = Preco;
		this.quant = Quant;
	}
	public String getNum() {return num;}
	public void setNum(String num) {this.num = num;}
	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao) {this.descricao = descricao;}
	public int getQuant() {return quant;}
	public void setQuant(int quant) {this.quant = quant;}
	public double getPreco() {return preco;}
	public void setPreco(double preco) {this.preco = preco;}
	
	public double getInvoiceAmount(int Quant, double Preco) { //multiplica o preco pela quant
		double fatura = Preco*Quant;
		if(Preco<0) {Preco=0; fatura = Preco*Quant;}
		if(Quant<0) {Quant=0; fatura = Preco*Quant;}
		return fatura;
	}
	@Override
	public String toString() {
		return "Invoice [num=" + num + ", descricao=" + descricao + ", quant=" + quant + ", preco=" + preco + "]";
	}
	
}
