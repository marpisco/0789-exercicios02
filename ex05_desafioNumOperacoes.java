
public class ex05_desafioNumOperacoes {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(System.console().readLine("Qual é o #1: "));
		int num2 = Integer.parseInt(System.console().readLine("Qual é o #2: "));
		System.out.println("Soma = " + (num1+num2));
		System.out.println("Subtração = " + (num1-num2));
		System.out.println("Multiplicação = " + (num1*num2));
		System.out.println("Divisão = " + (num1/num2));
	}

}
