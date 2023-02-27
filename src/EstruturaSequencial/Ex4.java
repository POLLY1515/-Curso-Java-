package EstruturaSequencial;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the width of the land");
		double width = sc.nextDouble();
		System.out.println("Enter the length of the land");
		double length = sc.nextDouble();
		System.out.println("Enter the value per square meter");
		double squareMeter = sc.nextDouble();
		
		double area = width * length ;
		double price = area * squareMeter;
		
		System.out.printf("Land area: %.2f\n" ,  area);
		System.out.printf("land price: %.2f\n" , price);
		//Para controlar a impressão de casas decimais,deve-se usar printf
		// após a frase colocar %.quantidade de casas decimais + f + \ + n para
		//pular linha,e no lugar do + antes da variavel,usar (,) virgula.

		
		
	}

}
