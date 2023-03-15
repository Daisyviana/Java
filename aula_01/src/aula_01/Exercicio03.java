package aula_01;

import java.util.Scanner;

public class Exercicio03 {
        public static void main(String[] args) {
			 
        	Scanner leia = new Scanner(System.in);
        	
        	float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
        	
        	System.out.println("Digite o valor do Salário Bruto:");
        	salarioBruto = leia.nextFloat();
        	
        	System.out.println("Digite o valor do Adicional Noturno:");
        	adicionalNoturno = leia.nextFloat();
        	
        	System.out.println("Digite o valor das Horas Extras:");
        	horasExtras = leia.nextFloat();
        	
        	System.out.println("Digite o valor do Descontos:");
        	descontos = leia.nextFloat();
        	
        	salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras *5) - descontos;
        	System.out.println("Valor do Salário Líquido: R$" + salarioLiquido);
        	
        	
        	
        	leia.close();
        	
        	
		}
}
