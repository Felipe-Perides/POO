package exerciciosGiHub;

public class Teste {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Conta1",123456,10000);
		ContaBancaria conta2 = new ContaBancaria("Conta2",654321,1000);
		ContaPoupanca conta3 = new ContaPoupanca("Conta3",135790,5000,15);
		ContaPoupanca conta4 = new ContaPoupanca("Conta4",246810,8000,5);
		ContaEspecial conta5 = new ContaEspecial("Conta5",124578,3000,500);
		ContaEspecial conta6 = new ContaEspecial("Conta6",235689,2500,250);
		
		// sacar
		conta1.sacar(3000);
		conta1.mostrarDetalhes();
		System.out.println("\n");
		conta2.sacar(400);
		conta2.mostrarDetalhes();
		System.out.println("\n");
		conta5.sacar(800);
		conta5.mostrarDetalhes();
		System.out.println("\n");
		conta6.sacar(100);
		conta6.mostrarDetalhes();
		System.out.println("\n");
		// depositar
		conta1.depositar(500);
		conta1.mostrarDetalhes();
		System.out.println("\n");
		conta2.depositar(100);
		conta2.mostrarDetalhes();
		System.out.println("\n");
		conta5.depositar(300);
		conta5.mostrarDetalhes();
		System.out.println("\n");
		conta6.depositar(50);
		conta6.mostrarDetalhes();
		// rendimento
		conta3.calcularNovoSaldo(conta3.getDiaRendimento());
		conta3.mostrarDetalhes();
		System.out.println("\n");
		conta4.calcularNovoSaldo(conta4.getDiaRendimento());
		conta4.mostrarDetalhes();
	}
}
