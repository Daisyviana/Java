package clente;

public class PessoaJuridica extends Clientes {

	private String cnpj;

	public PessoaJuridica(String nome, int idade, String endereco, String email, String nomeDaMae, String cnpj) {
		super(nome, idade, endereco, email, nomeDaMae);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ do cliente " + this.cnpj);
	}

}
