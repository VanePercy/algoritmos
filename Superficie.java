/*Escribir un algoritmo que calcule la superficie de un
 *  tri�ngulo en funci�n de la base y la altura*/

import java.util.*;

public class Superficie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base, altura, superficie;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese base del tri�ngulo");
		base = entrada.nextDouble();

		System.out.println("Ingrese altura del tri�ngulo");
		altura = entrada.nextDouble();

		superficie = (base * altura) / 2;
		
		System.out.println("La superficie del tri�ngulo es = " + superficie);
		entrada.close();

	}

}
