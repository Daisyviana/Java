package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
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
        System.out.println("Digite um número : ");
        int numero = scanner.nextInt();
        int posicao = numeros.indexOf(numero);

        if (posicao >= 0) {
            System.out.println("O número " + numero + " está na posição " + posicao + " da lista.");
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
    }

}