package aula_02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		
		System.out.println("Digite um número inteiro");
		numero = leia.nextInt();
		
		if (numero < 0 && numero % 2 == 0)
			System.out.println("O número digitado é negativo e par!");
		else if (numero > 0 && numero % 2 == 0)
			System.out.println("O numero digitado é positivo e par!");
		else if (numero > 0 && numero % 2 == 1)
			System.out.println("O numero digitado é positivo e impar!");
		else 
			System.out.println("O numero digitado é negativo e impar!");
		
		leia.close();
		

	}

}
