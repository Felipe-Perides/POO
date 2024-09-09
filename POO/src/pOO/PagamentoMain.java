package pOO;

public class PagamentoMain {
	public static void main(String args[]) {
		ProcessadorPagamento processador = new ProcessadorPagamento();
		
		processador.processarPagamento(150.00);
		System.out.println(processador.obterDetalhes());
		System.out.println(processador.obterStatusNotificacao());
	}
}
