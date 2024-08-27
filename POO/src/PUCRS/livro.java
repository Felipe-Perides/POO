package PUCRS;

public class livro {
	private int Codigo, QuantE;
    private String Nome;
    leitor leitor;
    public livro(int Codigo1, int QuantE1, String Nome1){
        setCodigo(Codigo1);
        setQuantE(QuantE1);
        setNome(Nome1);
    }
    public int getCodigo(){return Codigo;}
    public int getQuantE(){return QuantE;}
    public String getNome(){return Nome;}
    public void setCodigo(int Codigo2){Codigo=Codigo2;}
    public void setQuantE(int QuantE2){QuantE=QuantE2;}
    public void setNome(String Nome2){Nome=Nome2;}
    //Retirar livro -> diminui a quantidade de livros disponíveis em 1
    public boolean Retirar(){
        if(QuantE>0){
            QuantE--;
            return true;
        }else{
            return false;
        }
    }
    //Devolver livro -> aumenta a quantidade de livros disponíveis em 1
    public boolean Devolver(){
        QuantE++;
        return true;
    }
    public String toString(){
        return "\nNome: "+Nome+"\nCódigo: "+Codigo+"\nQuantidade de exemplares: "+QuantE;
    }
}
