/*Leer un car�cter y deducir si est� situado antes o despu�s de la �m� en orden alfab�tico.*/

import java.util.*;

public class CaracterM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caracter, letra = "k";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese car�cter");
		caracter = entrada.next();

		//int result = caracter.compareTo(letra);
		//System.out.println(result);

		if (caracter.compareTo(letra) == 0) {
			System.out.println("Caracteres iguales " + caracter + " = " + letra);
		} else {
			if (caracter.compareTo(letra) < 0) {
				System.out.println(caracter + " va antes que " + letra);
			} else {
				if (caracter.compareTo(letra) > 0) {
					System.out.println(caracter + " va despu�s  que " + letra);

				}
			}
		}

		entrada.close();
	}

}
