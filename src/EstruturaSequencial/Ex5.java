package EstruturaSequencial;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a base do retangulo:");
		double base = sc.nextDouble();
		System.out.println("Entre com a altura do retangulo:");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = 2 *(base + altura);
		
		System.out.printf("Area: %.4f\n ",area);
		System.out.printf("Perímertro: %.4f\n", perimetro);
		
	}

}
