/*Realizar un algoritmo que calcule la suma de los
 *enteros entre 1 y 10, es decir 1+2+3+...+10*/
public class SumaEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0;

		for (int v = 0; v <= 10; v++) {

			suma = suma + v;

		}

		System.out.println("La suma de enteros entre  1 y 10 es = " + suma);
	}

}
