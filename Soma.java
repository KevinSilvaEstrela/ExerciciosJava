package exercicios1;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, soma;
		
		System.out.println("Digite o 1º Número: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2º Número: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o 3º Número: ");
		n3 = leia.nextDouble();

		soma = n1 + n2 + n3;
		System.out.println("A soma desses números é: " + soma);
	}

}
