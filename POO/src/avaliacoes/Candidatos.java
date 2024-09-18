package avaliacoes;

public class Candidatos {
	private String nome, grau;
	private double cpf;
	public Candidatos(String Nome, String Grau, double CPF) {
		this.nome=Nome;
		this.grau=Grau;
		this.cpf=CPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGrau() {
		return grau;
	}
	public void setGrau(String grau) {
		this.grau = grau;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Candidatos [nome=" + nome + ", grau=" + grau + ", cpf=" + cpf + "]";
	}
	
}
