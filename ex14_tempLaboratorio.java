
public class ex14_tempLaboratorio {

	public static void main(String[] args) {
		Double tempCelsius = Double.parseDouble(System.console().readLine("Celsius = "));
		// Fórmula Celsius para Fahreinheit= F = (9 * C + 160) / 5.
		// Se F for maior a 45 e menor que 90, 'é ideal para o experimento'
		// Se não for, 'é inapropriada para o experimento'.
		// Para astética, definimos uma variável.
		Double tempFahreinheit = ((9*tempCelsius+160)/5);
		System.out.println("Fahreinheit = " + tempFahreinheit);
		if (tempFahreinheit >45 && tempFahreinheit <90) {
			System.out.println("É ideal para o experimento.");
		} else {
			System.out.println("É inapropriada para o experimento.");
		}
	}

}
