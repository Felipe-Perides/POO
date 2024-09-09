package pOO;

public interface Pagamento {
	public abstract void processarPagamento(double valor);
	public abstract String obterDetalhes();
}
