package avaliacoes;

import java.util.ArrayList;

public class ConcursoMunicipal implements Concursos{
	private ArrayList<Candidatos> inscritos;
	private String limite;
	// 10 candidatos máx.
	
	public ConcursoMunicipal() {
		this.limite = "fundamental incompleto";
		this.inscritos = new ArrayList<Candidatos>();
	}

	@Override
	public void inscricao(Candidatos candidato) {
		if(inscritos.size()>10) {
			System.out.println("Capacidade máxima atingida");
		}else if(candidato.getGrau() == limite || candidato.getGrau() == "ensino basico incompleto" || candidato.getGrau() == "ensino basico completo") {
			System.out.println("O grau de escolaridade do candidato "+candidato.getNome()+ " não se encaixa nos requisitos mínimos de inscrição para o concurso municipal");
		}else{
			inscritos.add(candidato);
			System.out.println("Inscrição para o concurso municipal concluída com sucesso!");
		}
		
	}

	@Override
	public void cancelInscricao(Candidatos candidato) {
		for(int i = 0; i<inscritos.size(); i++) {
			if(inscritos.get(i)==candidato) {
				inscritos.remove(i);
				System.out.println("Cancelamento de inscrição para o concurso municipal concluída com sucesso!");
			}
		}
	}

	@Override
	public void relatorio() {
		System.out.println("Relatório do Concurso: Concurso Municipal\nCandidatos inscritos:");
		for(int i = 0; i<inscritos.size();i++) {
			System.out.println("- "+inscritos.get(i).getNome());
		}
	}
	@Override
	public int indexOf(Candidatos candidato) {
	    for (int i = 0; i < inscritos.size(); i++) {       
	    	if (inscritos.get(i) == candidato) {
	    		return i;
	        }
	    }
	    return -1;
	}
}
