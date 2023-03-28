package clente;

public class TestaCliente {

	public static void main(String[] args) {
		
	
		PessoaJuridica pj1 = new PessoaJuridica("Derick Viana", 18, "Rua Diogo", "derickviana9@gmail.com", "Daisy Viana", "00.394.460/0058-87");
		pj1.visualizar();
		PessoaFisica pf1 = new PessoaFisica("Derick Viana", 18, "Rua Diogo", "derickviana9@gmail.com", "Daisy Viana", "123.456.789-09"); 
		pf1.visualizar();
	}

}
