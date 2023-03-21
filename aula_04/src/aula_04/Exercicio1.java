package aula_04;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero; 
		boolean verificador = false;
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
				
		for (int contador = 0; contador < vetor.length; contador ++) {
			if (vetor[contador] == numero) {
				System.out.println("O número " + numero + " está localizado na posição: " + contador);
				verificador = true;
			}
		}
		
		if (verificador == false)
			System.out.println("O número " + numero + " não foi encontrado!: ");
		
		leia.close();
	}

}
