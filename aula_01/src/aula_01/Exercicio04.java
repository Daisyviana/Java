package aula_01;

import java.util.Scanner;

public class Exercicio04 {
        public static void main(String[] args) {
			
        	Scanner leia = new Scanner (System.in);
        	
        	float numero1, numero2, numero3, numero4, calculo;
        	
        	System.out.println("Digite o Primeiro Número:");
        	numero1 = leia.nextFloat();
        	
        	System.out.println("Digite o Segundo Número:");
        	numero2 = leia.nextFloat();
        	
        	System.out.println("Digite o Terceiro Número:");
        	numero3 = leia.nextFloat();
        	
        	System.out.println("Digite o Quarto Número:");
        	numero4 = leia.nextFloat();
        	
        	calculo = (numero1 * numero2) - (numero3 * numero4);
        	System.out.println("Resoltado do Calculo:" + calculo);
        	
        	leia.close();
        	
		}
}
