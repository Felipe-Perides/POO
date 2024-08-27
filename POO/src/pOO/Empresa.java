package pOO;

//Atividade 1 --> 3.13
public class Empresa {
	//dois obj -> exibir o salario ANUAL deles -> dar um aumento de 10% -> exibir denovo
	public static void main(String[] args) {
		Employee funcionario1 = new Employee("Theo","Silva",1500);
		Employee funcionario2 = new Employee("Aurora","Pereira",4000);
		System.out.println(funcionario1);
		System.out.println(funcionario2);
		double salarioA1 = funcionario1.getSalario()*12;
		double salarioA2 = funcionario2.getSalario()*12;
		System.out.println("O salário anual do funcionário 1 é igual a "+salarioA1);
		System.out.println("O salário anual do funcionário 2 é igual a "+salarioA2);
		salarioA1 = (((funcionario1.getSalario()*10)/100)+funcionario1.getSalario())*12;
		salarioA2 = (((funcionario2.getSalario()*10)/100)+funcionario2.getSalario())*12;
		System.out.println("O salário anual do funcionário 1, após um aumento de 10%, é igual a "+salarioA1);
		System.out.println("O salário anual do funcionário 2, após um aumento de 10%, é igual a "+salarioA2);
	}
}
