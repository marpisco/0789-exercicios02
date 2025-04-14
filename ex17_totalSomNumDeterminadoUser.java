
public class ex17_totalSomNumDeterminadoUser {

	public static void main(String[] args) {
		int soma = 0;
		int numsSomar = Integer.parseInt(System.console().readLine("Introduza a quantidade de números a somar: "));
		for (int i=1; i<=numsSomar; i++) {
			soma = soma + i;
		}
		System.out.println("Total da soma dos primeiros " + numsSomar + " números: " + soma);
	}

}
