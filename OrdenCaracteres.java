/*Leer dos caracteres y deducir si están en orden alfabético.*/

import java.util.*;

public class OrdenCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a, b;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese primer carácter");
		a = entrada.next();

		System.out.println("Ingrese segundo carácter");
		b = entrada.next();

		if (a.compareToIgnoreCase(b) < 0) {

			System.out.println("Están en orden");
		} else {
			if (a.compareToIgnoreCase(b) == 0) {
				System.out.println("Son iguales");
			} else {
				System.out.println("No están en orden");
			}
		}
		entrada.close();
	}

}
