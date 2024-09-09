package pOO;

public class ProcessadorPagamento implements Pagamento, Notificacao {

	private String statusNotificacao;
	@Override
	public void enviarNotificaco(String msg) {
		this.statusNotificacao = "Notificação: " + msg;
		System.out.println(statusNotificacao);
		
	}

	@Override
	public String obterStatusNotificacao() {
		return "Notificação enviada com sucesso!";
	}

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Processando pagamento de R$"+valor);
		System.out.println("Pagamento realizado com sucesso!");
		
	}

	@Override
	public String obterDetalhes() {
		return "Detalhes do pagamento processado";
	}

}
