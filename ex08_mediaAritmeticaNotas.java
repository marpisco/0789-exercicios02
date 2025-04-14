
public class ex08_mediaAritmeticaNotas {

	public static void main(String[] args) {
		System.out.println("Cálculo de Médias v1.0");
		double nota1 = Double.parseDouble(System.console().readLine("Nota1 = "));
		double nota2 = Double.parseDouble(System.console().readLine("Nota2 = "));
		
		System.out.println("Média = " + ((nota1+nota2)/2));
	}

}
