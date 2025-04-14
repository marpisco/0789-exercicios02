
public class ex13_parImpar {

	public static void main(String[] args) {
		System.out.println("NumChecker v1.0");
		int numCheck = Integer.parseInt(System.console().readLine("Introduza o número a verificar: "));
		numCheck = numCheck % 2;
		if (numCheck == 1) {
			System.out.println("O número é ímpar.");
		} else {
			System.out.println("O número é par.");
		}
	}

}
