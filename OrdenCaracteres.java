/*Leer dos caracteres y deducir si est�n en orden alfab�tico.*/

import java.util.*;

public class OrdenCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a, b;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese primer car�cter");
		a = entrada.next();

		System.out.println("Ingrese segundo car�cter");
		b = entrada.next();

		if (a.compareToIgnoreCase(b) < 0) {

			System.out.println("Est�n en orden");
		} else {
			if (a.compareToIgnoreCase(b) == 0) {
				System.out.println("Son iguales");
			} else {
				System.out.println("No est�n en orden");
			}
		}
		entrada.close();
	}

}
