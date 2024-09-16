package pOO;

public class MainMatriculas {
	public static void main(String args[]) {
		AlunosGrad aluno1 = new AlunosGrad("teste1",12345,"CC");
		AlunosPosGrad aluno2 = new AlunosPosGrad("teste2",78945,"ES");
		
		DisciplinaObri disciplina1 = new DisciplinaObri("disciplina1",1247,8);
		DisciplinaOpt disciplina2 = new DisciplinaOpt("disciplina2",6831,4);
		DisciplinaOpt disciplina3 = new DisciplinaOpt("disciplina3",3594,4);
		
		aluno1.matricular(disciplina3);
		aluno2.matricular(disciplina1);
		aluno1.matricular(disciplina1);
		aluno1.matricular(disciplina2);
		aluno1.matricular(disciplina2);
		aluno1.matricular(disciplina2);
		aluno1.matricular(disciplina2);
		aluno1.matricular(disciplina2);
	}
}
