package TestFuncionario;

public class TesteFuncionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionarios dados = new Funcionarios("Jose Filho", "josepereira@gmail.com", "Autônomo", 3500.0f, true);
		Funcionarios dados2 = new Funcionarios("Adail Pereira", "adailviana33@gmail.com", "Costureira", 2000.0f, false);

		dados.visualizar();
		dados2.visualizar();

	}
}
