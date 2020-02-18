/*Escribir un algoritmo que calcule la superficie de un
 *  triángulo en función de la base y la altura*/

import java.util.*;

public class Superficie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base, altura, superficie;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese base del triángulo");
		base = entrada.nextDouble();

		System.out.println("Ingrese altura del triángulo");
		altura = entrada.nextDouble();

		superficie = (base * altura) / 2;
		
		System.out.println("La superficie del triángulo es = " + superficie);
		entrada.close();

	}

}
