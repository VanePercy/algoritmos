/*Dise�ar un algoritmo para calcular la velocidad 
(en metros/segundo) de los corredores de una carrera
de 1500 metros. La entrada ser�n parejas de n�meros
 (minutos, segundos) que dar�n el tiempo de cada
corredor. Por cada corredor se imprimir� el tiempo 
en minutos y segundos, as� como la velocidad media.
El bucle se ejecutar� hasta que demos una entrada
 de 0,0 que ser� la marca de fin de entrada de datos.*/


import java.util.Scanner;

public class Velocidad_Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int distancia = 1500;
		double tiempo, velocidad, minutos, segundos;

		Scanner entradaEscaner = new Scanner(System.in);
		System.out.println("Ingrese minutos ");
		minutos = entradaEscaner.nextDouble();
		System.out.println("Ingrese  segundos");
		segundos = entradaEscaner.nextDouble();

		while (minutos != 0 && segundos != 0) {

			tiempo = (segundos + minutos) * 60;
			velocidad = distancia / tiempo;

			System.out.println("Minutos = " + minutos + " Segundos = " + segundos + " velocidad = " + velocidad);
			System.out.println("Ingrese minutos ");
			minutos = entradaEscaner.nextDouble();
			System.out.println("Ingrese  segundos");
			segundos = entradaEscaner.nextDouble();
			
			if(minutos == 0 && segundos == 0)
				System.out.println("Ejecuci�n terminada");

		}

		entradaEscaner.close();

	}

}
