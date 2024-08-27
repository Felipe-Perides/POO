package pOO;

//Atividade 1 --> 3.13 
public class Employee {
	private String nome, sobrenome;
	private double salario;
	public Employee(String Nome, String Sobrenome, double Salario) {
		this.nome = Nome;
		this.salario = Salario;
		this.sobrenome = Sobrenome;
	}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getSobrenome() {return sobrenome;}
	public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}
	public double getSalario() {return salario;}
	public void setSalario(double salario) {this.salario = salario;}
	@Override
	public String toString() {
		return "Employee [nome=" + nome + ", sobrenome=" + sobrenome + ", salario=" + salario + "]";
	}
	
}
