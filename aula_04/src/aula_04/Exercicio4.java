package aula_04;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double[][] matriz = new double[10][4];
		double vetor[] = new double[10];

		for (int contadorL = 0; contadorL < matriz.length; contadorL++) {
			System.out.println("Digite as 4 notas do " + (contadorL + 1) + "º alune: ");
			for (int contadorC = 0; contadorC < matriz[contadorL].length; contadorC++) {
				matriz[contadorL][contadorC] = leia.nextDouble();
			}
		}
		for (int contadorL = 0; contadorL < matriz.length; contadorL++) {
			for (int contadorC = 0; contadorC < matriz[contadorL].length; contadorC++) {
				vetor[contadorL] += matriz[contadorL][contadorC];
			}
			vetor[contadorL] = vetor[contadorL] / 4;
			System.out.println("Média do " + (contadorL+1) + "º Alune: " + vetor[contadorL]);
		}
		leia.close();
	}

}
