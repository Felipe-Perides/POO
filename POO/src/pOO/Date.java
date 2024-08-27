package pOO;

//Atividade 1 -> ex. 3.14
public class Date {
	private int mes,dia,ano;
	public Date(int Dia, int Mes, int Ano) {
		this.ano = Ano;
		this.dia = Dia;
		this.mes = Mes;
	}
	public int getMes() {return mes;}
	public void setMes(int mes) {this.mes = mes;}
	public int getDia() {return dia;}
	public void setDia(int dia) {this.dia = dia;}
	public int getAno() {return ano;}
	public void setAno(int ano) {this.ano = ano;}
	public void displayDate() {
		System.out.println(dia+"/"+mes+"/"+ano);
	}
}
