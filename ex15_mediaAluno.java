
public class ex15_mediaAluno {

	public static void main(String[] args) {
		System.out.println("Calculador de Notas v1.0");
		double n1 = Double.parseDouble(System.console().readLine("Introduza a primeira nota: "));
		double n2 = Double.parseDouble(System.console().readLine("Introduza a segunda nota: "));
		System.out.println("Média | Conceito | Situação");
		if (((n1 + n2)/2) >= 9) {
			System.out.println(((n1 + n2)/2) + " | A | Aprovado");
		}
		if (((n1 + n2)/2) <= 8.9 && ((n1 + n2)/2) >= 8.0) {
			System.out.println(((n1 + n2)/2) + " | B | Aprovado");
		}
		if (((n1 + n2)/2) <= 7.9 && ((n1 + n2)/2) >= 7.0) {
			System.out.println(((n1 + n2)/2) + " | C | Aprovado");
		}
		if (((n1 + n2)/2) <= 6.9 && ((n1 + n2)/2) >= 6.0) {
			System.out.println(((n1 + n2)/2) + " | D | Recuperação");
		}
		if (((n1 + n2)/2) < 6) {
			System.out.println(((n1 + n2)/2) + " | E | Reprovado");
		}
		
	}

}
