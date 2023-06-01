package exercicios2;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = leia.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.println(n + " X " + i + " = " + n*i);
		}

	}

}
