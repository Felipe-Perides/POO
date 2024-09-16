package pOO;

public abstract class Disciplinas implements DisciplinasComportamentos{
	protected String nome;
	protected int codigo, creditos;
	
	public Disciplinas(String Nome, int Codigo, int Creditos) {
		this.nome=Nome;
		this.codigo=Codigo;
		this.creditos=Creditos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	@Override
	public String toString() {
		return "Disciplinas [nome=" + nome + ", codigo=" + codigo + ", creditos=" + creditos + "]";
	}
	
}
