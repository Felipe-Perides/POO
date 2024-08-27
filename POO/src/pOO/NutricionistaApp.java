package pOO;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class NutricionistaApp {
	
	private String nome, sexo, resposta;
	private double peso, quantCaloriasSemana, quantCaloriaDia;
	private ArrayList<Paciente> fila;
	private Paciente cliente;
	private int turn;
	
	public static void main(String[] args) {
		NutricionistaApp app = new NutricionistaApp();
		app.run();
	}
	public void run(){
		turn = 0;
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Olá, qual é o seu nome?");
			nome = scan.nextLine();
			System.out.println("Me diga... Qual é o seu peso e sexo:");
			peso = scan.nextDouble();
			scan.nextLine();
			sexo = scan.nextLine();
			
			System.out.println("Qual é a quantidade média de calorias que você consome por dia durante a semana?");
			quantCaloriasSemana = scan.nextDouble();
			cliente = new Paciente(nome,sexo,peso,quantCaloriasSemana);
			fila = new ArrayList<Paciente>();
			fila.add(cliente);
			fila.sort(Comparator.comparing(Paciente::getQuantCalorias));
			System.out.println("Qual é a quantidade de calorias que você consome num certo dia da semana?");
			quantCaloriaDia = scan.nextDouble();
			System.out.println("A ingestão de calorias foi superior ao máximo permitido (que é de 3.000 Kcal)?");
			scan.nextLine();
			resposta = scan.nextLine();
			System.out.println("Nova consulta?");
			String ans = scan.nextLine();
			if(ans=="sim") {turn++;}else {turn=0;}
			scan.close();
		}while(turn!=0);
	}
}
