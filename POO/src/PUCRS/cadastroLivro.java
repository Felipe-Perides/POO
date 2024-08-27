package PUCRS;

public class cadastroLivro {
	private livro[] caixa;
    private int tamMax, proxLivre;
    private String[][] livroLeitor;

    public cadastroLivro() {
        tamMax = 10;
        caixa = new livro[tamMax];
        proxLivre = 0;
        livroLeitor = new String[10][10];
    }
    //Adiciona um objeto Livro na caixa[]
    public boolean AddLivro(livro livro1) {
        if (proxLivre >= caixa.length) {
            return false;
        } else {
            caixa[proxLivre] = livro1;
            proxLivre++;
            return true;
        }
    }
    //Localiza o index do objeto pelo nome
    public int localizaLivro(String livro3) {
        for (int i = 0; i < proxLivre; i++) {
            if (caixa[i].getNome().contains(livro3)) {
                return i;
            }
        }
        return -1;
    }
    //Deleta o objeto Livro da caixa[]
    public boolean DelLivro(String livro2) {
        int pos = localizaLivro(livro2);
        if (pos >= 0 && pos < proxLivre) {
            for (int i = pos; i < proxLivre - 1; i++) {
                caixa[i] = caixa[i + 1];
            }
            caixa[proxLivre - 1] = null;
            proxLivre--;
            return true;
        } else {
            return false;
        }
    }
    //Retorna o objeto Livro com o nome equivalente ao String do parâmetro
    public livro buscaNomeLi(String nome) {
        for (int i = 0; i < tamMax; i++) {
            if (caixa[i].getNome().equals(nome)) {
                return caixa[i];
            }
        }
        return null;
    }
    //Printa o objeto Livro com o nome equivalente ao String do parâmetro, se não for encontrado, retorna uma frase
    public void buscaNomeLI(String nome) {
        boolean found = false;
        for (int i = 0; i < caixa.length; i++) {
            if (caixa[i] != null && caixa[i].getNome().contains(nome)) {
                System.out.println(caixa[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Livro não encontrado!");
        }
    }
    //Printa todos os objetos Livros nas caixa[]
    public void mostrarLivro() {
        for (int i = 0; i < proxLivre; i++) {
            System.out.println("\nCadastro de livro na posição " + (i + 1));
            System.out.println(caixa[i].toString());
        }
    }
    //Retorna a quantidade total de exemplares, a soma da quantidade de livros disponíveis
    public int tExemplares() {
        int Soma = 0;
        for (int i = 0; i < caixa.length; i++) {
            if (caixa[i] != null) {
                Soma += caixa[i].getQuantE();
            }
        }
        return Soma;
    }
    //Após o leitor(parâmetro) retirar o livro(parâmetro), adiciona um objeto Livro à matriz 
    //livroleitor e atribui ao boolean found o valor true para que na verificação da próxima retirada impossibilite a ação
    //pois o leitor já retirou um livro(máx. 1 livro para retirada).
    public void addLivro(String leitor, String livro) {
        boolean found = false;
        for (int i = 0; i < livroLeitor.length; i++) {
            if (livroLeitor[i][0] != null && livroLeitor[i][0].equals(leitor)) {
                for (int j = 1; j < livroLeitor[i].length; j++) {
                    if (livroLeitor[i][j] == null) {
                        livroLeitor[i][j] = livro;
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            for (int i = 0; i < livroLeitor.length; i++) {
                if (livroLeitor[i][0] == null) {
                    livroLeitor[i][0] = leitor;
                    livroLeitor[i][1] = livro;
                    break;
                }
            }
        }
    }
    //O leitor(parâmetro) devolve o livro(parâmetro), deleta da matriz livroleitor o objeto Livro com o nome igual ao do parâmetro
    public void delLivro(String leitor, String livro) {
        for (int i = 0; i < livroLeitor.length; i++) {
            if (livroLeitor[i][0] != null && livroLeitor[i][0].equals(leitor)) {
                for (int j = 1; j < livroLeitor[i].length; j++) {
                    if (livroLeitor[i][j] != null && livroLeitor[i][j].equals(livro)) {
                        livroLeitor[i][j] = null;
                        break;
                    }
                }
            }
        }
    }
    //Retirar livro -> diminui a quantidade de livros disponíveis em 1
    public int retirar(String leitor, String nome, int QuantE) {
        int quantE = 0;
        for (int i = 0; i < proxLivre; i++) {
            quantE = caixa[i].getQuantE();
            if (caixa[i].getNome().contains(nome) && QuantE >= 0) {
                quantE = quantE - QuantE;
                caixa[i].setQuantE(quantE);
            } else {
                System.out.println("\nEste livro não está registrado!");
            }
        }
        return quantE;
    }
    //Devolver livro -> aumenta a quantidade de livros disponíveis em 1
    public int devolver(String leitor, String nome, int QuantE) {
        int quantE = 0;
        for (int i = 0; i < proxLivre; i++) {
            quantE = caixa[i].getQuantE();
            if (caixa[i].getNome().contains(nome)) {
                quantE = quantE + QuantE;
                caixa[i].setQuantE(quantE);
            } else {
                System.out.println("\nEste livro não está registrado!");
            }
        }
        return quantE;
    }
    //Printa os objetos Leitor presentes na matriz livroleitor, ou seja, leitors que retiraram um objeto Livro
    public void mostrarLeitor() {
        for (int i = 0; i < livroLeitor.length; i++) {
            if (livroLeitor[i][0]!= null) {
                System.out.print("Leitor: " + livroLeitor[i][0] + " - Livros: ");
                for (int j = 1; j < livroLeitor[i].length; j++) {
                    if (livroLeitor[i][j]!= null) {
                        System.out.print(livroLeitor[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
    //Printa os objetos Livro presentes na matriz livroleitor, ou seja, livros já retirados
    public void mostrarLivroLeitor(String leitor) {
        boolean found = false;
        for (int i = 0; i < livroLeitor.length; i++) {
            if (livroLeitor[i][0]!= null && livroLeitor[i][0].equals(leitor)) {
                System.out.print("Leitor: " + livroLeitor[i][0] + " - Livros: ");
                for (int j = 1; j < livroLeitor[i].length; j++) {
                    if (livroLeitor[i][j]!= null) {
                        System.out.print(livroLeitor[i][j] + " ");
                    }
                }
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Leitor não encontrado!");
        }
    }
}
