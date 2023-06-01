package exercicios1;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.println("Digite o 1º valor");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2º valor");
		n2 = leia.nextDouble();
		
		if (n1 > n2) {
			System.out.println(n1 + " é maior que " + n2);
		} else if (n2 > n1) {
			System.out.println(n2 + " é maior que " + n1);
		} else {
			System.out.println("Os números são iguais");
		}
	}
}
