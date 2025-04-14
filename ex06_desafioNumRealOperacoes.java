
public class ex06_desafioNumRealOperacoes {

	public static void main(String[] args) {
		double num1 = Double.parseDouble(System.console().readLine("Qual é o #1: "));
		double num2 = Double.parseDouble(System.console().readLine("Qual é o #2: "));
		System.out.println("Soma = " + (num1+num2));
		System.out.println("Subtração = " + (num1-num2));
		System.out.println("Multiplicação = " + (num1*num2));
		System.out.println("Divisão = " + (num1/num2));
	}

}
