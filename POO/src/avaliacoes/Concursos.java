package avaliacoes;

public interface Concursos {
	public void inscricao(Candidatos candidato);
	public void cancelInscricao(Candidatos candidato);
	public void relatorio();
	public int indexOf(Candidatos candidato);
}
