package EstruturaSequencial;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double precoUnitario , valorPago, valorTotal, troco;
		int quantidade;
		
		
		System.out.println("Entre com o preço da unidade:");
		precoUnitario = sc.nextDouble();
		System.out.println("Entre com a quantidade comprada:");
		quantidade = sc.nextInt();
		
		 valorTotal = precoUnitario * quantidade;

		System.out.printf("Valor a pagar R$:%.2f\n", valorTotal);
		System.out.println("Entre com o pagamento:");
		valorPago = sc.nextDouble();
		 troco =  valorPago - valorTotal ;
		 
		 System.out.printf("Preço unitário do produto R$: %.2f reais \n" , precoUnitario);
		 System.out.println("Quantidade comprada:" + quantidade + " unidade(s)");
		 System.out.printf("Dinheiro recebido R$:%.2f reais \n" , valorPago );
		 System.out.printf("Troco R$: %.2f reais \n", troco );


		
	}

}
