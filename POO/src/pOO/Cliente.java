package pOO;

public class Cliente {
	private String nome, codigo;
	public Cliente(String Nome, String Codigo) {
		this.nome=Nome;
		this.codigo=Codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", codigo=" + codigo + "]";
	}
	
}
