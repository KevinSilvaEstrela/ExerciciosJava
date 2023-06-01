package exercicios2;

import java.util.Scanner;

public class SomaWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double i = 1, n, soma = 0;
		
		while (i < 6) {
			System.out.println("Digite um número: ");
			n = leia.nextDouble();
			
			soma = soma + n;
			i++;
		}
		
		System.out.println(soma);

	}

}
