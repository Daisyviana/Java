package clente;

public class PessoaFisica extends Clientes {
	private String cpf;

	public PessoaFisica(String nome, int idade, String endereco, String email, String nomeDaMae, String cpf) {
		super(nome, idade, endereco, email, nomeDaMae);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF do cliente " + this.cpf);
	}

}
