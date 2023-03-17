package aula_02;

public class Operadores {

	public static void main(String[] args) {
		
		int n1 = 2, n2 =2, n3= 5;
		
		System.out.println(n1 != n2 && n2 > n3);
		
	
		
		System.out.println("Variável N1: " + n1);
		System.out.println("Variável N1: " + (++ n1));
		
		System.out.println("Variável N2: " + n2);
		System.out.println("Variável N2: " + (n2 ++));
		System.out.println("Variável N2: " + n2);
		
		System.out.println("Variável N2: " + (n2 += 2));
		System.out.println("Variável N2: " + (n2 -= 2));
		
	
	}

}
