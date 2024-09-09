package exerciciosGiHub;

public class Teste {
	public static void main(String[] args) {
		ContaPoupanca conta1 = new ContaPoupanca("Conta1",123456,10000,04);
		ContaEspecial conta2 = new ContaEspecial("Conta2",654321,1000,500);
		
		
		// sacar
		conta1.sacar(500);
		// depositar
		conta2.depositar(300);
		// mostrar os detalhes
		conta1.calcularNovoSaldo();
		System.out.println(conta1.getSaldo());
		System.out.println();
		conta2.mostrarDetalhes();
	}
}
