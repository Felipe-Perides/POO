package pOO;

public class AlunosPosGrad extends Alunos{

	public AlunosPosGrad(String Nome, int NumMatricula, String Curso) {
		super(Nome, NumMatricula, Curso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void matricular(Disciplinas Disciplina){
		if(disciplinas.size()>3) {
			System.out.println("Você ultrapassou o limite de disciplinas");
		}else {
			super.matricular(Disciplina);
			System.out.println("matricula realizada com sucesso!");
		}
	}

	@Override
	public String toString() {
		return "AlunosPosGrad [nome=" + nome + ", curso=" + curso + ", Matricula=" + numMatricula +  "]";
	}
	
}
