package aula_01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua primeira nota:");
		
		nota1 = leia.nextFloat();
		
		System.out.println("Digite sua segunda nota:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite sua terceira nota:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite sua quarta nota:");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Media Final:" + mediaFinal);
		
		leia.close();
		
	}
}
