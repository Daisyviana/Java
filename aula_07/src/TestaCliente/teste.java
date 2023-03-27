package TestaCliente;

public class teste {

	public static void main(String[] args) {
	

		Cliente dados = new Cliente("Derick França Viana", 27, "rua Alberto Calix, 26", "deckviana@gmail.com", "Jose Viana");
		Cliente dados2 = new Cliente("Alexmar Oliveira", 21, "rua Diogo Gonçalves, 43", "alexmaroliveira@gmail.com", "Pietro Oliveira");
		
				dados.visualizar();
				dados2.visualizar();
		
	}

}

