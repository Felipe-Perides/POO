package pOO;

public class Voo {
	private int num,numVaga,dataPartida,horaPartida,horaChegada;
	public Voo(int Num,int NumVaga, int DataPartida, int HoraPartida, int HoraChegada) {
		this.dataPartida=DataPartida;
		this.horaChegada=HoraChegada;
		this.horaPartida=HoraPartida;
		this.num=Num;
		this.numVaga=NumVaga;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getNumVaga() {
		return numVaga;
	}

	public void setNumVaga(int numVaga) {
		this.numVaga = numVaga;
	}

	public int getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(int dataPartida) {
		this.dataPartida = dataPartida;
	}

	public int getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(int horaPartida) {
		this.horaPartida = horaPartida;
	}

	public int getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(int horaChegada) {
		this.horaChegada = horaChegada;
	}

	@Override
	public String toString() {
		return "Voo [num=" + num + ", numVaga=" + numVaga + ", dataPartida=" + dataPartida + ", horaPartida="
				+ horaPartida + ", horaChegada=" + horaChegada + "]";
	}
}
