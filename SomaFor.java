package exercicios2;

import java.util.Scanner;

public class SomaFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double n, soma = 0;
		
		for (int i = 1; i < 6;) {
			System.out.println("Digite um número: ");
			n = leia.nextDouble();
			
			soma = soma + n;
			i++;
		}
		System.out.println(soma);
	}

}
