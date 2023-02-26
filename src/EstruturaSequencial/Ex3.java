package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Entre com o valor do produto:");
		double valorProduto = sc.nextDouble();
		System.out.println("Entre com a quantidade de itens comprados:");
		int quantidadeItens = sc.nextInt();
		
		double valorTotal = valorProduto * quantidadeItens;
		
		System.out.printf("Valor total da compra: %.2f\n", valorTotal);
		System.out.println("Entre com o valor  a ser pago:");
		double valorPago = sc.nextDouble();
		
		double troco = valorPago - valorTotal ;

		System.out.println("*************************************************");
		System.out.printf("Total: %.2f\n ", valorTotal);
		System.out.printf("Preço unitário do produto: %.2f\n ", valorProduto);
		System.out.println("Quantidade de itens: "+ quantidadeItens);
		System.out.printf("Dinheiro recebido: %.2f\n", valorPago);
		System.out.printf("Troco: %.2f ", troco);



		
		sc.close();

	}

}
