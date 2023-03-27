package exercicio_03;

import java.time.LocalDate;

public class Jogo extends Produto{

	private int categoria;

	public Jogo(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco,
			int categoria) {
		super(id, nome, versao, produtora, dataLancamento, preco);
		this.categoria = categoria;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void visualizar() {
		
		String categoria = "";
		
		switch(this.categoria) {
			case 1 -> categoria = "Simulação";
			case 2 -> categoria = "Aventura";
			case 3 -> categoria = "E-Sport";
		}
		
		super.visualizar();
		System.out.println("Categoria do jogo: " + categoria);
	}
	
	
}