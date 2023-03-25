package TestaCliente;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente dados = new Cliente("Derick França Viana", 27, "rua Alberto Calix, 26", "deckviana@gmail.com", "Maria Jose");
		Cliente dados2 = new Cliente("Alexmar Oliveira", 21, "rua Diogo Gonçalves, 43", "thiagoatkl@gmail.com", "Mirtes Almeida");
		
				dados.visualizar();
				dados2.visualizar();
	}

}

