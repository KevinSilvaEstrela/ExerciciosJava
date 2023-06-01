package exercicios1;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade < 16) {
			System.out.println("Você não pode votar");
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("Voto facultativo");
		} else  {
			System.out.println("Voto obrigatório");
		}
	}

}
