package aula_02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("1 - Cachorro Quente - R$10,00");
		System.out.println("2 - X-Salada - R$15,00");
		System.out.println("3 - X-Bacon - R$18,00");
		System.out.println("4 - Bauru - R$12,00");
		System.out.println("5 - Refrigerente - R$13,00");
		System.out.println("6 - Suco de Laranja - R$13,00");
		
		System.out.println("\nEscolha seu lanche");
		numero = leia.nextInt();
		
		switch (numero) {
		case 1: 
			System.out.println("Seu pedido é o Cachorro Quente no valor de R$10,00");
		break;
		case 2: 
			System.out.println("Seu pedido é o X-Salada no valor de R$15,00");
		break;
		case 3: 
			System.out.println("Seu pedido é o X-Bacon no valor de R$18,00");
		break;
		case 4: 
			System.out.println("Seu pedido é o Bauru no valor de R$12,00");
		break;
		case 5: 
			System.out.println("Seu pedido é o Refrigerente no valor de R$8,00");
		break;
		case 6: 
			System.out.println("Seu pedido é o Suco de Laranja no valor de R$13,00");
		break;
		}
		
		leia.close();
	}

}
