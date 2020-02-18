/*Diseñar un algoritmo que imprima y
 *  sume la serie de números 3,6,9,12,...,99.*/

public class Serie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0, num = 3;

		while (num <= 99) {

			System.out.println("Serie = " + num);
			suma += num;
			num += 3;
			System.out.println("Serie = " + num);

		}

		System.out.println("El resultado de la suma es = " + suma);

	}

}
