package PUCRS;

public class cadastroLeitor {
	leitor leitor;
    private leitor[] fila;
    private int tamMax, proxLivre;
    private cadastroLivro CL;
    public cadastroLeitor(){
        tamMax = 10;
        fila = new leitor[tamMax];
        proxLivre = 0;
        CL = new cadastroLivro();
    }
    //Adiciona um objeto Leitor na fila[]
    public boolean AddLeitor(leitor leitor1){
        if(proxLivre>=fila.length){
            return false;
        }else{
            fila[proxLivre] = leitor1;
            proxLivre++;
            return true;
        }
    }
    //Retorna o objeto Leitor com o nome equivalente ao String do parâmetro
    public leitor BuscaNomeLE(String nome){
        for(int i = 0; i<tamMax;i++){
            if(fila[i]!=null){
                if(fila[i].getNome().equals(nome)){
                    return fila[i];
            }
        }
        else{break;}
        }
        return null;
    }
    //Printa o objeto Leitor com o nome equivalente ao String do parâmetro, se não for encontrado, retorna uma frase
    public void buscarNomeLE(String nome){
        boolean found = false;
        for(int i = 0; i<fila.length;i++){
            if(fila[i]!=null && fila[i].getNome().contains(nome)){
                System.out.println(fila[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Leitor não encontrado!");
        }
    }
    //Printa todos os objetos Leitor nas fila[]
    public void MostraLeitor(){
        for(int i = 0; i<proxLivre; i++){
            leitor leitor = fila[i];
            if(leitor != null){
            System.out.println("\nCadastro do leitor na posição "+(i+1));
            System.out.println(fila[i].toString()+" ");   
            }
        }
    }
    //Localiza o index do objeto pelo nome
    public int LocalizaLeitor(String leitor3){
        int Local = -1;
        for(int i = 0; i<proxLivre;i++){
            if(fila[i].getNome().contains(leitor3)){
                Local=i;
            }
        }
        return Local;
    }
    //Deleta o objeto Leitor da fila[]
    public boolean DelLeitor(String leitor2){
        int pos = LocalizaLeitor(leitor2);
        if(pos>=0 && pos <proxLivre){
            for(int i = pos; i<proxLivre-1;i++){
                fila[i] = fila[i+1];
            }
            fila[proxLivre-1] = null;
            proxLivre--;
            return true;
        }else{
            return false;
        }
    }
    //Adiciona o objeto Leitor, a partir do parâmetro, à matriz livroleitor, caso a ação retirar seja realizada
    public void addLivroLeitor(String leitor, String livro) {
        int pos = LocalizaLeitor(leitor);
        if (pos >= 0 && pos < proxLivre && fila[pos]!= null) {
            CL.addLivro(fila[pos].getNome(), livro);
        } else {
            System.out.println("Leitor não encontrado!");
        }
    }
    //Deleta o objeto Leitor, a partir do parâmetro, da matriz livroleitor, caso a ação devolver seja realizada
    public void delLivroLeitor(String leitor, String livro) {
        int pos = LocalizaLeitor(leitor);
        if (pos >= 0 && pos < proxLivre && fila[pos]!= null) {
            CL.delLivro(fila[pos].getNome(), livro);
        } else {
            System.out.println("Leitor não encontrado!");
        }
    }
}
