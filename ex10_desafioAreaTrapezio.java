
public class ex10_desafioAreaTrapezio {

	public static void main(String[] args) {
		double baseMaior = Double.parseDouble(System.console().readLine("Base maior = "));
		double baseMenor = Double.parseDouble(System.console().readLine("Base menor = "));
		double altura = Double.parseDouble(System.console().readLine("Altura = "));
		
		System.out.println("Área = " + (((baseMaior + baseMenor) / 2)*altura));
	}

}
