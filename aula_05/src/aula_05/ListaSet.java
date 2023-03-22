package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaSet {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Double> notas = new HashSet<Double>();

		int opcao = 0;

		double nota = 0.0;

		do {

			System.out.println("1- Cadastrar nota");
			System.out.println("2- Listar todas as notas");
			System.out.println("3- Buscar uma nota");
			System.out.println("4- Remover uma nota");
			System.out.println("5- Atualizar uma nota");
			System.out.println("6- Ordenar as notas");
			System.out.println("7- Sair");

			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Cadastrar nota");
				System.out.println("Digite uma nota: ");

				notas.add(leia.nextDouble());

				break;
			case 2:
				System.out.println("Listar notas");

				if (notas.isEmpty()) {
					System.out.println("Não existem notas cadastradas!");
				} else {
					for (var eNota : notas)
						System.out.println(eNota);
				}

				break;
			case 3:
				System.out.println("Buscar uma nota");
				System.out.println("Digite uma nota: ");
				nota = leia.nextDouble();

				if (notas.contains(nota))
					System.out.println("A nota existe!");
				else
					System.out.println("A nota não foi encontrada!");

				break;
			case 4:
				System.out.println("Remover uma nota");
				System.out.println("Digite uma nota: ");
				nota = leia.nextDouble();

				notas.remove(nota);

				break;
			case 5:
				System.out.println("Atualizar uma nota");

				System.out.println("Opção insdisponível!");

				break;
			case 6:

				System.out.println("Ordenar as notas");

				System.out.println("Opção insdisponível!");

				break;
			default:
				if (opcao > 7)
					System.out.println("Opção inválida!");
			}

		} while (opcao != 7);

		
		leia.close();
	}

}