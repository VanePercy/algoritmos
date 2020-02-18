/*Leer un carácter y deducir si está o no comprendido entre las letras I y M ambas inclusive.*/

import java.util.*;
public class Caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String caracter;
		String letra1 = "i";
		String letra2 = "m";
		Scanner  entrada = new Scanner (System.in);
		
		System.out.println("Ingrese carácter");
		caracter = entrada.next();
		
		if(caracter.compareToIgnoreCase(letra1) >= 0 && caracter.compareToIgnoreCase(letra2) <= 0) {
			
			System.out.println("El carácter " + caracter + " está entre la letra " + letra1 + " y la letra " + letra2);
			
		}else {
			System.out.println("El carácter ingresado no está entre la letra " + letra1 + " y la letra " + letra2);
		}
		
		entrada.close();
	}

}
