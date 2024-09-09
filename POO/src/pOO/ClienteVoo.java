package pOO;

public class ClienteVoo {
	private String nome;
	private int endereco,cpf,telefone;
	public ClienteVoo(String Nome, int CPF, int Endereco, int Telefone) {
		this.nome=Nome;
		this.cpf=CPF;
		this.endereco=Endereco;
		this.telefone=Telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEndereco() {
		return endereco;
	}
	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "ClienteVoo [nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", telefone=" + telefone + "]";
	}
	
}
