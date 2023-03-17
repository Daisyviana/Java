package aula_02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float numero1, numero2, resultado = 0; 
		int operacao;
		
		System.out.println("Digite o primeiro número:");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número:");
		numero2 = leia.nextFloat();
		
		System.out.println("Escolha uma das operações:");
		System.out.println("1 - Soma");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		
		operacao = leia.nextInt();
		
		switch (operacao) {
			case 1:
				resultado = numero1 + numero2;
				System.out.println("O resultado da operação é: " + resultado);
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.println("O resultado da operação é: " + resultado);
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.println("O resultado da operação é: " + resultado);
				break;
			case 4:
				resultado = numero1 / numero2;
				System.out.println("O resultado da operação é: " + resultado);
				break;
			default:
				System.out.println("Operação inválida!");
		}
		
		
		
		leia.close();
		
	}

}
