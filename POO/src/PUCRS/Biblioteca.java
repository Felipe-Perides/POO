package PUCRS;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 * Biblioteca de Métodos
 *
 * Professora: Lucia Giraffa
 * Alunos: Felipe Nicolau Perides 24102232, Bernardo Tarnowski Dallarosa 24102139
 * Turma: 10
 * @version (3.0)
 */
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class Biblioteca{
    //Fórmulas Matemáticas
    public static double areaCirculo(double raio){
        double aux = Math.PI*Math.pow(raio,2);
        return aux;
    }
    public static double areaTrianguloEqui(double lado){
        double aux = Math.pow(lado, 2) * Math.sqrt(3)/4;
        return aux;
    }
    public static double areaHexagono(double lado){
        double aux = 6 * Math.pow(lado, 2) * Math.sqrt(3)/4;
        return aux;
    }
    public static double areaLosango(double diam1, double diam2){
        double aux = diam1 * diam2/2;
        return aux;
    }
    public static double areaTrapezio(double baseMaior, double baseMenor,double altura){
        double aux = (baseMaior + baseMenor) * altura/2;
        return aux;
    }
    public static double supEsfera(double raio){
        double aux = 4*Math.PI*Math.pow(raio,2);
        return aux;
    }
    public static double supCubo(double lado, double altura){
        double aux = 6*Math.pow(lado,2);
        return aux;
    }
    public static double supPrisma(double comp, double larg, double alt){
        double aux = (2*(larg*comp))+(2*(comp*alt))+(2*(alt*larg));
        return aux;
    }
    public double superficiePiramide(double ladobase1,double ladobase2,double altura){
        double m = ladobase1/2, g = Math.sqrt(Math.pow(m,2)+Math.pow(altura,2));
        double Ab = (ladobase1*ladobase2), Al = 4*((g*ladobase1)/2);
        return Ab+Al;
    }
    public static double supCilindro(double raio, double altura){
        double aux = (2*Math.PI*raio*altura)+(2*Math.PI*Math.pow(raio,2));
        return aux;
    }
    public static double circunferencia(double raio){
        double aux = 2*Math.PI*raio;
        return aux;
    }
    public double volumePiramide(double ladobase1,double ladobase2,double altura){
        double Vol = (ladobase1*ladobase2*altura)/3;
        return Vol;
    }
    public static double volumeCilindro(double raio, double altura){
        double aux = areaCirculo(raio)*altura;
        return aux;
    }
    public static double volumeCone (double raio, double altura){
        double aux = Math.PI * Math.pow(raio, 2) * altura/3;
        return aux;
    }
    public static double volumeCubo (double lado){
        double aux = Math.pow(lado, 3);
        return aux;
    }
    public static double volumeEsfera(double raio){
        double aux = (4*Math.PI*Math.pow(raio,3))/3;
        return aux;
    }
    public static double volumeParal(double comprimento, double largura, double altura){
        double aux = comprimento*altura*largura;
        return aux;
    }
    //Par ou Ímpar
    public static boolean testePar2(int valor){
        if (valor % 2 == 0){return true;}
        else {return false;}
    }
    //Divisor ou Múltiplo
    public static boolean testeDivMulti(int valor1, int valor2){
        if (valor1 % valor2 == 0){return true;}
        else {return false;}
    }
    //Verificação de um triângulo
    public static boolean triangulo(double x, double y, double z){
        boolean aux = false;
        if ((x<(y+z))&&(x>Math.abs(y-z))) {aux=true;}
        if ((y<(x+z))&&(y>Math.abs(x-z))) {aux=true;}
        if ((z<(x+y))&&(z>Math.abs(x-y))) {aux=true;}
        return aux;
    }
    //Unidades e Dezenas
    public static String unidades(int valor){
        String aux = " ";
        switch(valor){
            case 1: aux = "um"; break;
            case 2: aux = "dois"; break;
            case 3: aux = "três"; break;
            case 4: aux="quatro";break;
            case 5: aux="cinco";break;
            case 6: aux="seis";break;
            case 7: aux="sete";break;
            case 8: aux="oito";break;
            case 9: aux="nove";break;
              default:;
        }
        return aux;
    }
    public static String dezenas(int valor){
        String aux = " ";
        switch (valor){
            case 1: aux = "onze";break;
            case 2: aux = "doze";break;
            case 3: aux = "treze";break;
            case 4: aux = "quatorze";break;
            case 5: aux = "quinze";break;
            case 6: aux = "dezesseis";break;
            case 7: aux = "dezessete";break;
            case 8: aux = "dezoito";break;
            case 9: aux = "dezenove";break;
            case 0: aux = "dez";break;
            default:;
        }
        return aux;
    }
    public static String Dezenas(int valor){
        String aux = " ";
        switch(valor){
            case 2: aux = "vinte";break;
            case 3: aux = "trinta";break;
            case 4: aux = "quarenta";break;
            case 5: aux = "cinquenta";break;
            case 6: aux = "sessenta";break;
            case 7: aux = "setenta";break;
            case 8: aux = "oitenta";break;
            case 9: aux = "noventa";break;
            default:;
        }
        return aux;
    }
    //Capícuo
    public static boolean capicuo(int x){
        int dezena1 = x/1000, unidade1 = (x%1000)/100;
        int dezena2 = (x%1000)/100, unidade2 = x%10;
        if(dezena1 == unidade2 && unidade1 == dezena2){return true;} else {return false;}
    }
    //Número ao contrário
    public static void contrario(int x){
        int a = 0;
        while(x>0){a *= 10; a += (x%10); x /= 10;}
        System.out.println("O número escolhido é igual a "+a+" quando invertido.");
    }
    //3025 --> 30+25=55 --> 55² = 3025
    public static void especial(int x){
        if((x>=1000) && (x<= 9999)){
            int aux = x/100, resto1 = x%100;
            int aux2 = resto1;
            int a = aux+aux2;
            if(Math.pow(a,2)==x){System.out.println("O número "+x+" possui uma característica especial na qual ao separá-lo em dois algarismos e somá-los, seu quadrado será igual ao número inicial!");
            } else {System.out.println("O número "+x+" não possui a característica especial na qual ao separá-lo em dois algarismos e somá-los, seu quadrado será igual ao número inicial!");}
        }
    }
    //Diferença de tempo
    public static void horas(int hora, int minuto){
            Scanner teclado = new Scanner(System.in);
            System.out.println ("\n Digite  a hora de inicio  da partida"); int hora1=teclado.nextInt();
            System.out.println ("\n Digite  os minutos associados a hora  de inicio  da partida"); int min1=teclado.nextInt();
            System.out.println ("\n Digite  a hora de final  da partida"); int hora2=teclado.nextInt();
            System.out.println ("\n Digite  os minutos associados a hora  de fim  da partida"); int min2=teclado.nextInt();
            int total=24*60; int inicio= hora1*60+min1; int fim =hora2*60+min2; int diferenca=fim-inicio;
            if (diferenca > 0){hora=diferenca/60; minuto=diferenca%60; System.out.println("\n A partida durou: "+ hora+" horas e "+minuto+" minutos ");}
                else{hora= (total-inicio)+ fim; System.out.println("\n A partida durou: "+ (hora/60) +" horas e "+(hora%60)+" minutos");}
            teclado.close();
    }
    //Calendário com data e hora atuais
    public static void DataAtual(){
        System.out.print("\f");
        Calendar agora = Calendar.getInstance();
        System.out.println("Dia: "+agora.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mês: "+(agora.get(Calendar.MONTH)+1));
        System.out.println("Ano: "+agora.get(Calendar.YEAR));

        System.out.println("Hora: "+agora.get(Calendar.HOUR));
        System.out.println("Minutos: "+agora.get(Calendar.MINUTE));
        System.out.println("Segundos: "+agora.get(Calendar.SECOND));

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormat.format(agora.getTime()));
    }
    //Maior e Menor
    public static double maior(double a, double b, double c){ //Entre 3 números
        double maior=0;
        if(a>b&&a>c){maior=a;}else if(a>b&&a<c){maior=c;}else if(a<b&&a>c){maior=b;}
        return maior;
    }
    public static double menor(double a, double b, double c){  //Entre 3 números
        double menor=0;
        if(a<b&&a<c){menor=a;}else if(a<b&&a>c){menor=c;}else if(a>b&&a<c){menor=b;}
        return menor;
    }
    //retorna um array com os 3 números ordenados em ordem crescente
    public static void ordenaTresCrescente(int a, int b, int c){
        Integer[] Ordem = {a,b,c};
        Arrays.sort(Ordem);
        System.out.println(Arrays.toString(Ordem));
    }
    //retorna um array com os 3 números ordenados em ordem decrescente
    public static void ordenaTresDecrescente(int a, int b, int c){
        Integer[] Ordem = {a,b,c};
        Arrays.sort(Ordem, Collections.reverseOrder());
        System.out.println(Arrays.toString(Ordem));
    }
    //Quantidade de divisores e a soma desses valores
    public static int quantiDiv(int valor){
        int antecessor=1;
        int contador=0;
        while(antecessor<=valor){
            if(valor%antecessor==0)
                                {
                                    contador++;
                                }
            antecessor++;
        }
        return contador;
    }
    public static int SomaDiv(int valor){
        int antecessor=1;
        int soma=0;
        while(antecessor<=valor){
            if(valor%antecessor==0)
                                {
                                    soma=soma+antecessor;
                                }
            antecessor++;
        }
        return soma;
    }
    //Número Primo
    public static boolean numeroPrimo(int num){
        if(num<=1){
            return false;
        }
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    //verifica se um número é um "número amigo"
    public static boolean numeroAmigo(int num1, int num2){
        boolean a = true;
        if(SomaDiv(num1)==num2&&SomaDiv(num2)==num1){
            a = true;
        }else{a = false;}
        return a;
    }
    //verifica se um número é perfeito.
    public static boolean numeroPerfeito(int num){
        if(SomaDiv(num)==num){
            return true;
        }else{return false;}
    }
    //verifica se um número é defectivo.
    public static boolean numeroDefectivo(int num){
        if(SomaDiv(num)<num){
            return true;
        }else{return false;}
    }
    //verifica se um número é abundante
    public static boolean numeroAbundante(int num){
       if(SomaDiv(num)>num){
            return true;
        }else{return false;}
    }
    //Divisor Simples
    public static boolean DivSimples(int num1, int num2){
        if(num1%num2==0){return true;}else{return false;}
    }
    //Primos entre si
    public static boolean PrimosEntreSi(int a, int b){
        boolean ans = true;
        if(mdc(a,b)==1){
            ans = true;
        }else{
            ans = false;
        }
        return ans;
    }
    //Máx.Div.Comum
    public static int Mdc(int a, int b) {
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static int mdc(int a, int b) {
        if (b == 0) {
			return a;
		} else {
			return mdc(b, a % b);
		}
    }
    //Mega Plus
    public static boolean MegaPlus(int valor){
        if(numeroPrimo(valor)&&valor>=100&&valor<=999){
            return true;
        }else{
            return false;
        }
    }
    //Ano bissexto
    public static boolean Bissexto(int ano){
        return (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
    }
    //Quantidade de Vogais
    public static int vogais(String palavra){
        int total = 0;
        for(int count = 0; count<palavra.length();count++){
            char letra = palavra.charAt(count);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                total++;
            }
        }
        return total;
    }
    //Se a String possui o char retorna true senão false
    public static boolean temChar(String palavra, char caracter){
        boolean found = false;
        for(int i = 0; i<palavra.length(); i++){
            if(palavra.charAt(i)==caracter){
                found = true;
            }else{
                found = false;
            }
        }
        return found;
    }
    //Se a String possuir o char, quantas vezes ele aparece
    public static int temCharX(String palavra, char caracter){
        int quant = 0;
        for(int i = 0; i<palavra.length(); i++){
            if(palavra.charAt(i)==caracter){
                quant++;
            }
        }
        return quant;
    }
    //Se a 1º String estiver contida na 2º
    public static boolean temStringString(String P1, String P2){
        if(P1.contains(P2)){
            return true;
        }else{
            return false;
        }
    }
    //Palíndromo
    public static boolean Palindromo(String palavra){
        for(int i = 0; i<palavra.length()/2-1;i++){
            if(palavra.charAt(i)!=palavra.charAt(palavra.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    //Retorna a menor String
    public static String menorS(String S1, String S2){
        if(S1.length()<S2.length()){
            return S1;
        }else{
            return S2;
        }
    }
    //Retorna uma concatenação das duas Strings
    public static String maiorS(String S1, String S2){
        S1 = S1.concat(" ");
        String Novo = S1.concat(S2);
        return Novo;
    }

    //Imprime vetor inteiro
    public static void imprimeVint(int[] vetor){
        for (int element : vetor) {
        System.out.print(" [ "+element+" ] ");
        }
    }
    //Imprime vetor double
    public static void imprimeVdouble(double[] vetor){
        for (double element : vetor) {
        System.out.print(" [ "+element+" ] ");
        }
    }
    //Maior do vetor int
    public static int maior(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }
    //Maior do vetor double
    public static double maior(double[] vetor) {
        double max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }
    //Menor do vetor int
    public static int menor(int[] vetor) {
        int min = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }
        return min;
    }
    //Menor do vetor double
    public static double menor(double[] vetor) {
        double min = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }
        return min;
    }
    //Ordena vetor inteiro
    public static int[]ordena(int[]v){
        int tam = v.length;
        int aux = 0;
        for(int i=0; i<tam; i++){
        for(int j=i+1; j<tam; j++){
        if(v[j]<v[i]){aux=v[i]; v[i]=v[j]; v[j]=aux;}
           }
         }
        return v;
    }
    //Ordena vetor real
    public static double[]ordena(double[]v){
        int tam = v.length;
        double aux = 0;
        for(int i=0; i<tam; i++){
        for(int j=i+1; j<tam; j++){
        if(v[j]<v[i]){aux=v[i]; v[i]=v[j]; v[j]=aux;}
           }
         }
        return v;
    }
    //Soma de vetores inteiros
    public static int[] adicionaInt(int[] vetor1, int[] vetor2) {
        int tam = vetor1.length;
        int[] soma = new int[tam];
        for(int i=0; i<tam; i++){
            soma[i] = (vetor1[i]) + (vetor2[i]);
        }
        return soma;
    }
    //Soma de vetores reais
    public static double[] adicionaDouble(double[] vetor1, double[] vetor2) {
        int tam = vetor1.length;
        double[] soma = new double[tam];
        for(int i=0; i<tam; i++){
            soma[i] = (vetor1[i]) + (vetor2[i]);
        }
        return soma;
    }
    //Subtração de vetores inteiros
    public static int[] subtrai(int[] vetor1, int[] vetor2) {
        int tam = vetor1.length;
        int[] subtracao = new int[tam];
        for(int i=0; i<tam; i++){
            subtracao[i] = (vetor1[i]) - (vetor2[i]);
        }
        return subtracao;
    }
    //Subtração de vetores reais
    public static double[] subtrai(double[] vetor1, double[] vetor2) {
        int tam = vetor1.length;
        double[] subtracao = new double[tam];
        for(int i=0; i<tam; i++){
            subtracao[i] = (vetor1[i]) - (vetor2[i]);
        }
        return subtracao;
    }
    //Multiplicação de vetor por um int
    public static int[] multiplicado(int[] vetor, int multiplicador) {
        int tam = vetor.length;
        int[] novo = new int[tam];
        for(int i=0; i<tam; i++){
            novo[i] = (vetor[i]) * multiplicador;
        }
        return novo;
    }
    //Produto de dois vetores Int
    public static int[] prodVetorInt(int[] array1, int[] array2){
        if(array1.length<array2.length){
            int[] aux = array1;
            array1 = array2;
            array2 = aux;
        }
        for(int i = 0; i<array1.length;i++){
            array1[i] = array1[i]*array2[i];
        }
        return array1;
    }
    //Produto de dois vetores double
    public static double[] prodVetorDouble(double[] array1, double[] array2){
        if(array1.length<array2.length){
            double[] aux = array1;
            array1 = array2;
            array2 = aux;
        }
        for(int i = 0; i<array1.length;i++){
            array1[i] = array1[i]*array2[i];
        }
        return array1;
    }
    //Aumenta o vetor e adiciona maior valor
    public static double[] aumenta(double[] vetor){
        int tam=vetor.length;
        double[]novo=new double[tam+1];
        for(int i=0; i<tam; i++){
          novo[i]=vetor[i];
        }
          double aux = maior(vetor);
          novo[tam]=aux;
        return novo;
    }
    //Diminui o vetor e remove o menor valor
    public static int[] diminui(int[] array){
        int count = 0;
        int tam = array.length;
        int menorIndex = menor(array);
        for(int k = 0; k<tam; k++){
            if(array[k]==array[menorIndex]){count++;}
        }
        int[] novo = new int[tam-count];
        int index = 0;
        for(int i = 0; i<tam;i++){
            if(array[i]!=array[menorIndex]){
                novo[index++] = array[i];
            }
        }
        return novo;
    }
    //Espicho
    public static int[] espicha(int[] array){
        int tam = array.length;
        int[] novo = new int[(2*tam)-1];
        int Tam = (2*tam)-1;
        for(int i = 0, j = 0, k = 1; i<tam; i++,j=j+2, k=k+2){
            novo[j] = array[i];
            if(k+2>Tam){
                k=k-2;
                novo[k] = 0;
            }else{
                novo[k] = 0;
            }
        }
        return novo;
    }
    //Mistura
    public static int[] mistura(int[] array){
        int tam = array.length;
        int meio = tam/2;
        int[] novo = new int[tam];
        for(int j = 0; j<tam; j++){
            novo[j] = array[j];
        }
        for(int i = 0; i<meio; i++){
            int posTroca = tam-i-1;
            int temp = novo[i];
            novo[i] = novo[posTroca];
            novo[posTroca] = temp;
        }
        return novo;
    }
    //União Int *TESTE
    public static int[] uniao(int[] array1, int[]array2){
        int tam = array1.length+array2.length;
        int[] uniao = new int[tam];
        int index = 0;
        for (int element : array1) {
            uniao[index++] = element;
        }
        for (int element : array2) {
            boolean found = false;
            for(int x = 0; x<index; x++){
                if(element==uniao[x]){
                    found = true;
                    break;
                }
            }
            if(!found){
                uniao[index++] = element;
            }
        }
        int[] Uniao = new int[index];
        for(int i = 0; i<index; i++){
            Uniao[i] = uniao[i];
        }
        return Uniao;
    }
    //União Double *TESTE
    public static double[] uniao(double[] array1, double[]array2){
        int tam = array1.length+array2.length;
        double[] uniao = new double[tam];
        int index = 0;
        for (double element : array1) {
            uniao[index++] = element;
        }
        for (double element : array2) {
            boolean found = false;
            for(int x = 0; x<index; x++){
                if(element==uniao[x]){
                    found = true;
                    break;
                }
            }
            if(!found){
                uniao[index++] = element;
            }
        }
        double[] Uniao = new double[index];
        for(int i = 0; i<index; i++){
            Uniao[i] = uniao[i];
        }
        return Uniao;
    }
    //Intersecção Int *TESTE
    public static int[] interseccao(int[] array1, int[] array2){
        int[] inter = new int[Math.min(array1.length,array2.length)];
        int index = 0;
        for (int element : array1) {
            for (int element2 : array2) {
                if(element==element2){
                    boolean duplicata = false;
                    for(int k = 0; k<index;k++){
                        if(inter[k]==element){
                            duplicata = true;
                            break;
                        }
                    }
                    if(!duplicata){
                        inter[index++] = element;
                    }
                }
            }
        }
        int[] Inter = new int[index];
        for(int k = 0; k<index;k++){
            Inter[k] = inter[k];
        }
        return Inter;
    }
    //Intersecção Double *TESTE
    public static double[] interseccao(double[] array1, double[] array2){
        double[] inter = new double[Math.min(array1.length,array2.length)];
        int index = 0;
        for (double element : array1) {
            for (double element2 : array2) {
                if(element==element2){
                    boolean duplicata = false;
                    for(int k = 0; k<index;k++){
                        if(inter[k]==element){
                            duplicata = true;
                            break;
                        }
                    }
                    if(!duplicata){
                        inter[index++] = element;
                    }
                }
            }
        }
        double[] Inter = new double[index];
        for(int k = 0; k<index;k++){
            Inter[k] = inter[k];
        }
        return Inter;
    }
    //Produto Escalar Int *TESTE
    public static int prodEscalar(int[] array1, int[] array2){
        int produto = 0, tam = 0;
        if(array1.length>array2.length){
            tam = array2.length;
        }else if(array1.length<array2.length){
            tam = array1.length;
        }else{
            tam = array1.length;
        }
        for(int i = 0; i<tam;i++){
            produto += array1[i]*array2[i];
        }
        return produto;
    }
    //Produto Escalar double *TESTE
    public static double prodEscalar(double[] array1, double[] array2){
        double produto = 0, tam = 0;
        if(array1.length>array2.length){
            tam = array2.length;
        }else if(array1.length<array2.length){
            tam = array1.length;
        }else{
            tam = array1.length;
        }
        for(int i = 0; i<tam;i++){
            produto += array1[i]*array2[i];
        }
        return produto;
    }
    //multiplica os elementos de dois vetores int e gera num vetor **nao e produto escalar
    public int[] produtoVetorInt(int[] vetor1, int[] vetor2){
        if(vetor1.length<vetor2.length){
            int[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        for(int i = 0; i<vetor1.length;i++){
            vetor1[i]=vetor1[i]*vetor2[i];
        }
        return vetor1;
    }
    //multiplica os elementos de dois vetores double
    public double[] produtoVetorDouble(double[] vetor1, double[] vetor2){
        if(vetor1.length<vetor2.length){
            double[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        for(int i = 0; i<vetor1.length;i++){
            vetor1[i]=vetor1[i]*vetor2[i];
        }
        return vetor1;
    }
    //Soma todos os elementos do vetor de naturais
    public int somaTotalIntVetor(int[] array){
        int total = 0;
        for (int element : array) {
            total+=element;
        }
        return total;
    }
    //Soma todos os elementos do vetor de inteiros
    public double somaTotalDoubleVetor(double[] array){
        double total = 0;
        for (double element : array) {
            total+=element;
        }
        return total;
    }
    //Imprime Matriz INT
    public static void imprimeMatrizInt(int[][] matriz){
        for (int[] element : matriz) {
            System.out.print("\n");
            for (int element2 : element) {
                System.out.print("|"+element2);
            }
            System.out.print("|");
        }
    }
    //Imprime Matriz DOUBLE
    public static void imprimeMatrizDouble(double[][] matriz){
        for (double[] element : matriz) {
            System.out.print("\n");
            for (double element2 : element) {
                System.out.print("|"+element2);
            }
            System.out.print("|");
        }
    }
    //imprime a diagonal principal de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
    public int[] diagonalInt(int[][] matriz){
        int[] diag = new int[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++){
            diag[i]=matriz[i][i];
            System.out.print("|"+matriz[i][i]+"|");
        }
        System.out.print("|");
        return diag;
    }
    //imprime a diagonal principal de uma matriz quadrada de doubles e retorna um vetor com estes termos
    public double[] diagonalDouble(double[][] matriz){
        double[] diag = new double[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++){
            diag[i]=matriz[i][i];
            System.out.print("|"+matriz[i][i]+"|");
        }
        System.out.print("|");
        return diag;
    }
    //imprime a diagonal secundaria de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
    public int[] secundariaInt(int[][] matriz){
        int[] diag = new int[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++){
            diag[i] = matriz[i][matriz[i].length-i-1];
            System.out.print("|"+matriz[i][matriz[i].length-i-1]+"|");
        }
        System.out.print("|");
        return diag;
    }
    //imprime a diagonal secundaria de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
    public double[] secundariaDouble(double[][] matriz){
        double[] diag = new double[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++){
            diag[i]=matriz[i][matriz[i].length-i-1];
            System.out.print("|"+matriz[i][matriz[i].length-i-1]+"|");
        }
        System.out.print("|");
        return diag;
    }
    //checa se uma matriz é diagonal (int)
    public static boolean matrizDiagonalInt(int[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                if(i!=j){
                    if(matriz[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    //checa se uma matriz é diagonal (double)
    public boolean matrizDiagonalDouble(double[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                if(i!=j){
                    if(matriz[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    //checa se uma matriz é uma matriz unidade (int)
    public boolean matrizUnidadeInt(int[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                if(i==j){
                    if(matriz[i][j]!=1){
                        return false;
                    }
                }else if (matriz[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    //checa se uma matriz é uma matriz unidade (double)
    public boolean matrizUnidadeDouble(double[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                if(i==j){
                    if(matriz[i][j]!=1){
                        return false;
                    }
                }else if (matriz[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    //retorna true se a matriz tem mais de 50% dos elementos iguais a zero
    //Uma matriz é dita esparsa quando possui uma grande quantidade de elementos com valor zero
    //Matrizes esparsas são matrizes nas quais a maioria das posições é preenchida por zeros.
    //Para essas matrizes,podemos economizar um espaço significativo de memória se apenas os termos diferentes de zero forem
    //armazenados. As operações usais sobre essas matrizes (somar, multiplicar, inverter, pivotar) também podem
    //ser feitas em tempo muito menor se não armazenarmos as posições que contêm zeros;
    //Na disciplina de estrutura de dados farao isto com listas encadeadas
    public boolean matrizEsparsaInt(int[][] matriz){
        double count = 0;
        for (int[] element : matriz) {
            for (int element2 : element) {
                if(element2==0){
                    count+=1.0;
                }
            }
        }
        if(count/(matriz.length*matriz[0].length)>0.5){
            return true;
        }
        return false;
    }
    //retorna true se a matriz (retangular) tem mais de 50% dos elementos iguais a zero
    public boolean matrizEsparsaIDouble(double[][] matriz){
        double count = 0;
        for (double[] element : matriz) {
            for (double element2 : element) {
                if(element2==0){
                    count+=1.0;
                }
            }
        }
        if(count/(matriz.length*matriz[0].length)>0.5){
            return true;
        }
        return false;
    }
    //soma os elementos de duas matrizes de mesmo tamanho (int)
    public static int[][] somaMatrizInt(int[][] matriz1, int[][] matriz2){
    	int[][] soma = new int[matriz1.length][matriz1[0].length];
        for(int i = 0; i<matriz1.length;i++){
        	for(int j = 0; j<matriz1[i].length;j++) {
        		soma[i][j] = matriz1[i][j] + matriz2[i][j];
        	}
        }
        return soma;
    }
    //soma os elementos de duas matrizes de mesmo tamanho (double)
    public static double[][] somaMatrizDouble(double[][] matriz1, double[][] matriz2){
    	double[][] soma = new double[matriz1.length][matriz1[0].length];
        for(int i = 0; i<matriz1.length;i++){
        	for(int j = 0; j<matriz1[i].length;j++) {
        		soma[i][j] = matriz1[i][j] + matriz2[i][j];
        	}
        }
        return soma;
    }
    //Multiplica todos os elementos de uma matriz de mesmo tamanho (int)
    public static int[][] produtoMatrizInt(int[][] matriz1, int[][] matriz2){
        int[][] prod = new int[matriz1.length][matriz2[0].length];
        for(int i = 0; i<matriz1.length;i++){
            for(int j = 0; j<matriz2[0].length;j++) {
                prod[i][j] = matriz1[i][j]*matriz2[i][j];
            }
        }
        return prod;
    }
    //Multiplica todos os elementos de uma matriz de mesmo tamanho (double)
    public static double[][] produtoMatrizDouble(double[][] matriz1, double[][] matriz2){
        double[][] prod = new double[matriz1.length][matriz2[0].length];
        for(int i = 0; i<matriz1.length;i++){
            for(int j = 0; j<matriz2[0].length;j++) {
                prod[i][j] = matriz1[i][j]*matriz2[i][j];
            }
        }
        return prod;
    }
    public static int[] jogaNoVetor(int[][] matriz) {
    	int n=matriz.length;
        int m=matriz[0].length;
        int tam=n*m;
        int[] array = new int[tam];
        int aux = 0;
        for(int i = 0; i<n;i++) {
        	for(int j = 0; j<m; j++) {
        		array[aux] = matriz[i][j];
        		aux++;
        	}
        }
        return array;
    }
    public static int[][] jogaNaMatriz(int[] array, int lin, int col){
    	int[][] matriz = new int[lin][col];
    	int aux = 0;
    	for(int i = 0; i<lin; i++) {
    		for(int j = 0; j<col; j++) {
    			matriz[lin][col] = array[aux];
    			aux++;
    		}
    	}
    	return matriz;
    }
    public static int somaDiagonalP(int[][] matriz) {
    	int tam = matriz.length;
    	int soma = 0;
    	for(int i = 0; i<tam; i++) {
    		soma = soma + matriz[i][i];
    	}
    	return soma;
    }
    public static int somaDiagonalS(int[][] matriz) {
    	int tam = matriz.length;
    	int soma = 0;
        int aux = tam - 1;
        for(int i = 0; i<tam; i++) {
        	soma = soma + matriz[i][aux-1];
        }
        return soma;
    }
    //soma elementos das diagonais
    public static int somaDiagonais(int[][] matriz){
    	int soma=0; int tam=matriz.length;//ordem da matriz
        int aux1=somaDiagonalS(matriz);
        int aux2=somaDiagonalP(matriz);
        soma=aux1+aux2;
        //elemento central tem coordenadas
        int coord= (tam-1)/2;
        int central= matriz[coord][coord];
        if (tam%2!=0) {soma=soma-central; }
        return soma;
    }
  //verifica se todos sao zeros abaixo da DP
    public static boolean acimaP(int[][] matriz){
        int tam=matriz.length;int cont=0;
        for (int i=0;i<tam;i++) {
         for (int j=0;j<tam;j++){
             if(i>j){
            	 if (matriz[i][j]==0) {
					cont++;
				}}
         }
        }
        int quant=((tam*tam)-tam)/2;
        if (cont==quant) {
			return true;
		} else {
			return false ;
		}
    }
  //veirfica se todos sao zeros acima da DP
    public static boolean abaixoP(int[][] matriz){
        int tam=matriz.length;int cont=0;
        for (int i=0;i<tam;i++) {
         for (int j=0;j<tam;j++){
             if(i<j){
            	 if (matriz[i][j]==0) {
					cont++;
				}}
         }
        }
        int quant=((tam*tam)-tam)/2;
        if (cont==quant) {
			return true;
		} else {
			return false ;
		}
    }
  //soma elemntos de determinada coluna
    public static int somaCOLUNA(int[][] matriz, int col){
        int tam=matriz.length;int soma=0;
        for (int i=0;i<tam;i++){
         soma=soma+matriz[i][col];
        }
         return soma;
    }
  //soma elemntos de determinada linha
    public static int somaLINHA(int[][] matriz, int li){
        int tam=matriz.length;int soma=0;
        for (int i=0;i<tam;i++){
         soma=soma+matriz[li][i];
        }
         return soma;
    }
    public static int linhaMaiorValor(int[][] matriz) {
		int maior = 0;
		int lin = 0;
		for(int i = 0; i<matriz.length; i++) {
			maior = Biblioteca.maior(Biblioteca.jogaNoVetor(matriz));
			for(int j = 0; j<matriz[0].length; j++) {
				if(maior==matriz[i][j]) {
					lin = i;
					break;
				}
			}
		}
		return lin;
	}
}