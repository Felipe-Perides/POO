package pOO;

public class Produto {
	private int codigo;
	private double preco;
	private String nome;
	public Produto(int Codigo, double Preco, String Nome) {
		this.codigo=Codigo;
		this.nome=Nome;
		this.preco=Preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", preco=" + preco + ", nome=" + nome + "]";
	}
	
}
