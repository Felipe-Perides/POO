package pOO;

public class Paciente {
	private String nome, sexo;
	private double peso, quantCalorias;
	public Paciente(String Nome, String Sexo, double Peso, double QuantCalorias) {
		this.nome=Nome;
		this.peso=Peso;
		this.sexo=Sexo;
		this.quantCalorias=QuantCalorias;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getQuantCalorias() {
		return quantCalorias;
	}
	public void setQuantCalorias(double quantCalorias) {
		this.quantCalorias = quantCalorias;
	}
	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", sexo=" + sexo + ", peso=" + peso + ", quantCalorias=" + quantCalorias
				+ "]";
	}
	
}
