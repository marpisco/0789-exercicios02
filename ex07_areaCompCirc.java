
public class ex07_areaCompCirc {

	public static void main(String[] args) {
		System.out.println("Cálculo de Área e Comprimento v1.0");
		/* Fórmulas:
		 * Área: 3.14159*r(quadrado)
		 * Comprimento: 2*3.14159*r
		 * 
		 * Deve-se de definir o raio como r.
		 * */
		
		// Definir raio
		
		double raio = Double.parseDouble(System.console().readLine("Defina o raio: "));
		
		// Área
		System.out.println("Área = " + (3.14159*(raio*raio)));

		// Comprimento
		System.out.println("Comprimento = " + (2*3.14159*raio));
	}

}
