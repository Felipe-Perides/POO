package avaliacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Clube {
	private ArrayList<Socio> membros;
	private Scanner input;
	
	public Clube() {
		membros = new ArrayList<Socio>();
		input = new Scanner(System.in);
	}
	public void inscreveSocio() {
		System.out.println("Qual é o tipo do sócio? atleta/normal");
		String tipo = input.nextLine();
		if(tipo.equals("normal")) {
			System.out.println("Qual é o nome do sócio?");
			String nome = input.nextLine();
			System.out.println("Qual é a idade do sócio?");
			int idade = input.nextInt();
			input.nextLine();
			Socio novoSocio = new Socio(nome,idade);
			membros.add(novoSocio);
		}else if(tipo.equals("atleta")) {
			System.out.println("Qual é o nome do atleta?");
			String nome = input.nextLine();
			System.out.println("Qual é a idade do atleta?");
			int idade = input.nextInt();
			input.nextLine();
			System.out.println("Qual é a altura do atleta?");
			int altura = input.nextInt();
			input.nextLine();
			SocioAtleta novoAtleta = new SocioAtleta(nome,idade,altura);
			membros.add(novoAtleta);
		}
	}
	public void exameDeSaude(SocioAtleta pacienteAtleta) {
		for(Socio membro : membros) {
			if(membro instanceof SocioAtleta) {
				SocioAtleta atleta = (SocioAtleta) membro;
				System.out.println("Digite a altura do atleta "+atleta.getNome()+":");
				double altura = input.nextDouble();
				atleta.setAltura(altura);
			}
		}
		input.close();
	}
	public Socio socioMaisJovem() {
		if(membros.isEmpty()) {
			return null;
		}
		Socio maisNovo = membros.get(0);
		for(Socio membro : membros) {
			if(membro.getIdade()<maisNovo.getIdade()) {
				maisNovo = membro;
			}
		}
		return maisNovo;
	}
	public void fecharScanner() {
		input.close();
	}
}
