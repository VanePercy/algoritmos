/*Realizar un algoritmo que calcule y visualice las potencias de 2 entre 0 y 10.*/

public class Potencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int potencia;

		for (int v = 0; v <= 10; v++) {

			potencia = (int) Math.pow(v, 2);

			System.out.println("Potencia de " + v + " = " + potencia);
		}

	}

}
