package exercicios1;

import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, negativo = 0;
		
		System.out.println("Digite o 1º valor");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2º valor");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o 3º valor");
		n3 = leia.nextDouble();
		
		if (Math.signum(n1) == -1) {
			negativo++;
		}
		
		if (Math.signum(n2) == -1) {
			negativo++;
		}
		
		if (Math.signum(n3) == -1) {
			negativo++;
		}
		
		System.out.println("A quantidade de números negativos é de: " + negativo);
	}

}
