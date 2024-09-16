package pOO;

public class AlunosGrad extends Alunos{

	public AlunosGrad(String Nome, int NumMatricula, String Curso) {
		super(Nome, NumMatricula, Curso);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void matricular(Disciplinas Disciplina){
		if(disciplinas.size()>5) {
			System.out.println("Você ultrapassou o limite de disciplinas");
		}else {
			super.matricular(Disciplina);
			System.out.println("matricula realizada com sucesso!");
		}
	}
	@Override
	public String toString() {
		return "AlunosGrad [nome=" + nome + ", curso=" + curso + ", numMatricula=" + numMatricula + ", disciplinas="
				+ disciplinas + "]";
	}
	
}
