/*Leer un carácter y deducir si está situado antes o después de la «m» en orden alfabético.*/

import java.util.*;

public class CaracterM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caracter, letra = "k";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese carácter");
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
					System.out.println(caracter + " va después  que " + letra);

				}
			}
		}

		entrada.close();
	}

}
