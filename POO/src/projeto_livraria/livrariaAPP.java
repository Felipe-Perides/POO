package projeto_livraria;

import java.util.*;

public class livrariaAPP {
	private cadastroLivro CL;
    private cadastroLeitor CLE;
    public livrariaAPP(){
        CL = new cadastroLivro();
        CLE = new cadastroLeitor();
    }
    public static void main(String[] args){
        livrariaAPP App = new livrariaAPP();
        App.Interface();
    }
    public void Interface(){
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        System.out.print("\f");
        int a = 0;
        do{
            System.out.println("\nOlá, o que você gostaria de fazer? (Digite a opção desejada)\n");
            System.out.println("1-Incluir livro\n2-Mostrar os livros\n3-Pesquisar livro pelo nome");
            System.out.println("4-Incluir leitor\n5-Mostrar os leitores\n6-Pesquisar leitor pelo nome");
            System.out.println("7-Retirar livro\n8-Devolver livro\n9-Quantidade total de exemplares disponíveis\n10-Sair do programa");
            int opt = input.nextInt();
            switch(opt){
                case 1:
                    System.out.println("Qual é o nome do livro?");
                    input.nextLine();
                    String nomeLi = input.nextLine();
                    System.out.println("O código do livro será gerado pelo sistema.");
                    int codigo = gerador.nextInt(900000)+1000000;
                    System.out.println("Este é o código do livro: "+codigo);
                    System.out.println("Quantos exemplares desse livro?");
                    int QuantE = input.nextInt();
                    if(QuantE<=0){System.out.println("Indique uma quantidade de exemplares positiva não nula."); break;}
                    livro livro = new livro(codigo,QuantE,nomeLi);
                    CL.AddLivro(livro);
                    break;
                case 2:
                    CL.mostrarLivro();
                    break;
                case 3:
                    System.out.println("\nQual é o nome do livro que você deseja procurar?");
                    input.nextLine();
                    String nomeLI = input.nextLine();
                    CL.buscaNomeLI(nomeLI);
                    break;
                case 4:
                    System.out.println("Qual é o seu nome?");
                    input.nextLine();
                    String nomeLe = input.nextLine();
                    System.out.println("Qual é a sua cidade natal?");
                    String CDO = input.nextLine();
                    System.out.println("Sua matrícula será gerada pelo sistema.");
                    int matricula = gerador.nextInt(90000000)+10000000;
                    System.out.println("Sua matrícula é "+matricula);
                    leitor leitor = new leitor(matricula,nomeLe,CDO);
                    CLE.AddLeitor(leitor);
                    break;
                case 5:
                    CLE.MostraLeitor();
                    break;
                case 6:
                    System.out.println("\nQual é o nome do leitor que você deseja procurar?");
                    input.nextLine();
                    String busca = input.nextLine();
                    CLE.buscarNomeLE(busca);
                    break;
                case 7:
                    System.out.println("\nQual é o seu nome?");
                    input.nextLine();
                    String NomeLe = input.nextLine();
                    leitor leitorRE = CLE.BuscaNomeLE(NomeLe);
                    if (leitorRE == null){System.out.println("\nLeitor não encontrado."); break;}
                    System.out.println("\nQual é o nome do livro que você deseja retirar?");
                    String NomeLI = input.nextLine();
                    livro livroRE = CL.buscaNomeLi(NomeLI);
                    if(livroRE!=null){
                        if(leitorRE.getLivroE()==null){
                            if(livroRE.Retirar()){
                                leitorRE.setLivroE(livroRE);
                                System.out.println("\nLivro retirado com sucesso!");
                            }else{
                                System.out.println("\nEsse livro não possui exemplares disponíveis");
                            }
                        }else{
                            System.out.println("\nLeitor já tem um livro retirado.");
                        }
                    }else{
                        System.out.println("\nLivro não encontrado.");
                    }
                    break;
                case 8:
                    System.out.println("\nQual é o seu nome?");
                    input.nextLine();
                    String NomeLE = input.nextLine();
                    leitor leitorDE = CLE.BuscaNomeLE(NomeLE);
                    if(leitorDE!=null){
                        livro livroDE = leitorDE.getLivroE();
                        if(livroDE != null){
                            livroDE.Devolver();
                            leitorDE.setLivroE(null);
                            System.out.println("Livro devolvido com sucesso!");
                        }else{
                            System.out.println("Leitor não tem livro retirado!");
                        }
                    }else{
                        System.out.println("Leitor não encontrado!");
                    }
                    break;
                case 9:
                    System.out.println("A quantidade total de exemplares disponíveis no momentos são: "+CL.tExemplares());
                    break;
                case 10:
                    System.out.println("Desligando...");
                    a=1;
                    break;
                default:
                    System.out.println("Você não optou por nenhuma das opções disponíveis.");
                    break;
            }
        }while(a==0);
        input.close();
    }
}
