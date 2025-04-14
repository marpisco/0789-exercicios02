
public class ex11_clinicaCadastro {

	public static void main(String[] args) {
		System.out.println("Sistema de Cadastro ACRMed v1.0");
		String nomeCompleto = System.console().readLine("Introduza o seu nome completo: ");
		String email = System.console().readLine("Introduza o seu email: ");
		int tlf = Integer.parseInt(System.console().readLine("Introduza o seu número de telefone: "));
		int idade = Integer.parseInt(System.console().readLine("Introduza a sua idade: "));
		double peso = Double.parseDouble(System.console().readLine("Introduza o seu peso: "));
		double altura = Double.parseDouble(System.console().readLine("Introduza a sua altura: "));
		System.out.println("-------------");
		System.out.println("Cadastro de " + nomeCompleto);
		System.out.println("");
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + tlf);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		
	}

}
