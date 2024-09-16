package pOO;

import java.util.ArrayList;

public class Alunos implements Matriculavel{
	protected String nome, curso;
	protected int numMatricula;
	public ArrayList<Disciplinas> disciplinas;
	
	public Alunos(String Nome, int NumMatricula, String Curso) {
		this.nome=Nome;
		this.numMatricula=NumMatricula;
		this.curso=Curso;
		this.disciplinas=new ArrayList<Disciplinas>();
	}
	
	public void add(Disciplinas Disciplina) {
		disciplinas.add(Disciplina);
	}

	@Override
	public void matricular(Disciplinas Disciplina) {
		add(Disciplina);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	@Override
	public String toString() {
		return "Alunos [nome=" + nome + ", curso=" + curso + ", numMatricula=" + numMatricula + "]";
	}
	
}
