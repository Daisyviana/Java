package exercicio_03;

import java.time.LocalDate;

public class Console extends Produto{

	private int tipo;

	public Console(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco, int tipo) {
		super(id, nome, versao, produtora, dataLancamento, preco);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Tradicional";
			break;
		case 2:
			tipo = "Portátil";
			break;
		case 3:
			tipo = "Hibrído";
			break;
		}

		super.visualizar();
		System.out.println("\nTipo: " + tipo);

	}
}