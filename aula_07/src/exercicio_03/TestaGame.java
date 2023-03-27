package exercicio_03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestaGame {

	public static void main(String[] args) {
		
		// Formatador de datas - PT-BR
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		LocalDate data1 = LocalDate.of(2020, 9, 20);		
		Produto g1 = new Produto(1, "Valorant", 1, "Riot Games", data1, 1200.0f);
		g1.visualizar();
		
		LocalDate data2 = LocalDate.parse("2021-08-15");
		Console cs1 = new Console(2, "X-Box 360", 2, "Microsoft", data2, 5000.00f, 1);
		cs1.visualizar();
		
		LocalDate data3 = LocalDate.parse("15/10/2022", df);
		Jogo jg1 = new Jogo(3, "Kena", 2, "Microsoft", data3, 600.00f, 1);
		jg1.visualizar();
		
	}

}
