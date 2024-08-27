package avaliacoes;

public class Socio {
	private String nome;
	    private int idade;
	  
	    public Socio(String umNome, int umaIdade)	{
	      nome = umNome;
	      idade = umaIdade;
	    }
	  
	    /** Método que é chamado cada vez que o sócio faz aniversário */	
	    public void aniversaria(){
	      idade++;
	    }
	      
	    public int getIdade(){return idade;}	
	    
	    public String getNome(){return nome;}
}
