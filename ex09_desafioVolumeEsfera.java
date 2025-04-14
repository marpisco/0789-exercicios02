
public class ex09_desafioVolumeEsfera {

	public static void main(String[] args) {
		System.out.println("Cálculo Volume Esfera v1.0");
		/* Calcular volume da Esfera
		 * Fórmula: 4/3*3.14159*r(cubo)
		 * 
		 * Deve-se definir o raio r.*/
		double raio = Double.parseDouble(System.console().readLine("Qual é o raio da esfera? "));
		System.out.println("Volume = " + (((4/3)*3.14159)*(raio*raio*raio)));
	}

}
