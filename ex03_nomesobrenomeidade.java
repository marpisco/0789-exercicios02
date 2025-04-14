
public class ex03_nomesobrenomeidade {

	public static void main(String[] args) {
		String nome = System.console().readLine("Introduza o nome: ");
		String sobrenome = System.console().readLine("Introduza o sobrenome: ");
		int idade = Integer.parseInt(System.console().readLine("Introduza a idade: "));
		
		System.out.println("O seu nome é " + nome + " " + sobrenome + " e você tem " + idade + " anos.");
	}

}
