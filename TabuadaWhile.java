package exercicios2;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = leia.nextInt();
		
		int i = 1;
		while (i < 11) {
			System.out.println(n + " X " + i + " = " + n * i);
			i++;
		}
		
	}

}
