package avaliacoes;

public class AppConcurso {
	public static void main(String args[]) {
		Candidatos cand1 = new Candidatos("felipe","ensino medio completo",1234567890);
		Candidatos cand2 = new Candidatos("joão","superior completo",1234567890);
		Candidatos cand3 = new Candidatos("pedro","ensino basico completo",1234567890);
		Candidatos cand4 = new Candidatos("maria","ensino medio incompleto",1234567890);
		
		ConcursoFederal federal = new ConcursoFederal();
		ConcursoMunicipal municipal = new ConcursoMunicipal();
		
		federal.inscricao(cand1);
		System.out.println();
		federal.inscricao(cand2);
		System.out.println();
		municipal.inscricao(cand3);
		System.out.println();
		municipal.inscricao(cand4);
		System.out.println();
		
		municipal.relatorio();
		System.out.println();
		federal.relatorio();
		
		System.out.println();
		federal.inscricao(cand4);
		System.out.println();
		municipal.inscricao(cand1);
		System.out.println();
		federal.relatorio();
		System.out.println();
		federal.cancelInscricao(cand4);
		System.out.println();
		municipal.relatorio();
		
		
		
	}
}
