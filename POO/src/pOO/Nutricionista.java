package pOO;

import java.util.ArrayList;

public class Nutricionista {
	private ArrayList<Paciente> fila;
	private Paciente cliente;
	public Nutricionista() {
		this.fila = new ArrayList<Paciente>();
	}
	public void adicionarPaciente(Paciente cliente,ArrayList<Paciente> fila) {
		fila.add(cliente);
	}
	public void removerPaciente(Paciente cliente,ArrayList<Paciente> fila) {
		fila.remove(cliente);
	}
}
