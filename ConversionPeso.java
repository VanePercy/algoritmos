/*Diseñar un programa que lea el peso de un hombre en 
 * libras y nos devuelva su peso en kilogramos y
gramos (Nota: una libra equivale a 0.453592 kilogramos).*/

import java.util.*;

public class ConversionPeso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		final double libra = 0.453592;
		double peso, kg, gr;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese peso en libras");
		peso = entrada.nextDouble();

		kg = peso * libra;
		gr = kg * 1000;

		System.out.println("El peso en kilogramos es = " + kg);
		System.out.println("El peso en gramos es = " + gr);
		entrada.close();
	}

}
