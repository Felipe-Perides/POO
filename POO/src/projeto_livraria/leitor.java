package projeto_livraria;

public class leitor {
	livro livroE;
	private int Matricula; //Matricula deverá ser um número gerado pelo sistema
    private String Nome, CDO; //CDO = Cidade de Origem
    public leitor(int Matricula1, String Nome1, String CDO1){
        setMatricula(Matricula1);
        setNome(Nome1);
        setCDO(CDO1);
    }
    public int getMatricula(){return Matricula;}
    public String getNome(){return Nome;}
    public String getCDO(){return CDO;}
    public void setMatricula(int Matricula2){Matricula=Matricula2;}
    public void setNome(String Nome2){Nome=Nome2;}
    public void setCDO(String CDO2){CDO=CDO2;}
    public livro getLivroE(){return livroE;}
    public void setLivroE(livro livroE2){livroE=livroE2;}
    public String toString(){
        if(livroE==null){
        return "\nDados do leitor: "+"\nNome: "+Nome
        +"\nMatrícula: "+Matricula+"\nCidade de Origem: "+CDO
        +"\nDados do livro retirado: \n"+"Nenhum livro retirado";
        }
        return "\nDados do leitor: "+"\nNome: "+Nome
        +"\nMatrícula: "+Matricula+"\nCidade de Origem: "+CDO
        +"\nDados do livro retirado: \n"+livroE+"\n";
    }
}
