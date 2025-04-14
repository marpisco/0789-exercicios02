
public class ex12_produtos {

	public static void main(String[] args) {
		System.out.println("Faturação v1.0");
		// Introdução dos dados pretendidos.
		double id = Double.parseDouble(System.console().readLine("ID: "));
		String nome = System.console().readLine("Nome: ");
		String descricao = System.console().readLine("Descrição: ");
		double quantidade = Double.parseDouble(System.console().readLine("Quantidade: "));
		double precoUnitario = Double.parseDouble(System.console().readLine("Preço Unitário: "));
		double taxaImposto = Double.parseDouble(System.console().readLine("Percentagem da Taxa de Imposto: "));
		taxaImposto = (taxaImposto/100);
		// Resolução dos dados introduzidos
		System.out.println("");
		System.out.println("Produto: Código " + id + ", " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço Unitário €: " + precoUnitario);
		System.out.println("Preço Total €: " + (precoUnitario*quantidade));
		System.out.println("Valor do Imposto €: " + ((precoUnitario*quantidade)*taxaImposto));
		System.out.println("Valor Total da Compra €: " + ((precoUnitario*quantidade)+((precoUnitario*quantidade)*taxaImposto)));
	}

}
