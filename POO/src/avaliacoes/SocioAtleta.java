package avaliacoes;

public class SocioAtleta extends Socio {
	private double altura;
	private int categoria;
	public SocioAtleta(String umNome, int umaIdade, double Altura) {
		super(umNome, umaIdade);
		this.altura=Altura;
		this.categoria=calculoCategoria(umaIdade, Altura);
		
	}
	
	public int calculoCategoria(int idade, double altura) {
		if(idade<=12&&altura<=1.55) {
			categoria = 10;
		}else if(idade<=12&&altura>1.55) {
			categoria = 20;
		}else if(idade>12&&altura<=1.68) {
			categoria = 30;
		}else if(idade>12&&altura>1.68) {
			categoria = 40;
		}
		return categoria;
	}
	// metodo para aniversario
	@Override
	public void aniversaria() {
		super.aniversaria();
		calculoCategoria(getIdade(),altura);
		
	}
	// metodo para altura
	public void setAltura(double novaAltura) {
		this.altura=novaAltura;
		calculoCategoria(getIdade(), novaAltura);
	}
}
