package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cor = new ArrayList<String>();
		
		int cores = 0;
		
		do {
			System.out.println("Digite uma cor: ");
			cor.add(leia.nextLine());
			cores++;
			
		}while ( cores < 5);
		
		System.out.println("\n Lista as cores digilitadas: ");
		for (var eCor : cor) {
			System.out.println(eCor);
		}
		
		cor.sort(null);
		System.out.println("\nCores Ordenadas: ");
		for (var eCor : cor) {
			System.out.println(eCor);
		}

	}

}
