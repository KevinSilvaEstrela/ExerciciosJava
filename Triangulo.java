package exercicios1;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.println("Informe o 1º lado: ");
		lado1 = leia.nextDouble();
		
		System.out.println("Informe o 2º lado: ");
		lado2 = leia.nextDouble();
		
		System.out.println("Informe o 3º lado: ");
		lado3 = leia.nextDouble();
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("O triângulo é equilatero");
		} else {
			System.out.println("O triângulo não é equilatero");
		}
	}

}
