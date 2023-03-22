package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio04 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número : ");
		int numero = scanner.nextInt();

		if (numeros.contains(numero)) {
			System.out.printf("Número  encontrado!\n", numero);
		} else {
			System.out.printf("O número  não foi encontrado!\n", numero);
		}

		scanner.close();
	}

}
