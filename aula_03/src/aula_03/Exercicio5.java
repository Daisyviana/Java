package aula_03;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros, soma = 0;

		do {
			System.out.println("Digite um número: ");
			numeros = leia.nextInt();

			if (numeros > 0)
				soma = soma + numeros;

		} while (numeros != 0);
		System.out.println("A soma dos números positivos é: " + soma);

	}

}
