package pOO;

//Atividade 1 --> 3.12 
public class Loja {
	public static void main(String[] args) {
		Invoice produto = new Invoice("12345","Um belo bolo",5,19.90);
		System.out.println(produto);
		double fatura = produto.getInvoiceAmount(produto.getQuant(), produto.getPreco());
		System.out.println("A fatura da compra é: "+ fatura);
		Invoice failProduct = new Invoice("9876","Shampoo do CR7",2,-19);
		double failFatura = failProduct.getInvoiceAmount(failProduct.getQuant(), failProduct.getPreco());
		System.out.println("A fatura da compra é: "+ failFatura);
		Invoice failProduct2 = new Invoice("9876","Shampoo do CR7",-2,19);
		double failFatura2 = failProduct2.getInvoiceAmount(failProduct2.getQuant(), failProduct2.getPreco());
		System.out.println("A fatura da compra é: "+ failFatura2);
		Invoice failProduct3 = new Invoice("9876","Shampoo do CR7",-2,-19);
		double failFatura3 = failProduct3.getInvoiceAmount(failProduct3.getQuant(), failProduct3.getPreco());
		System.out.println("A fatura da compra é: "+ failFatura3);
	}
}
