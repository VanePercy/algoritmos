/*Averiguar si una palabra es un palíndromo. Un palíndromo es
 *una palabra que se lee igual de izquierda
a derecha que de derecha a izquierda, como por ejemplo «radar».*/
import java.util.*;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra = null;
		char recorder = 0;
		char recorizq = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese la palabra");
		palabra = entrada.next();

		int n = palabra.length();

		for (int i = 0; i < n; i++) {
			recorder = palabra.charAt(i);
			//System.out.println(recorder);
			recorizq = palabra.charAt(n - i - 1);
			//System.out.println(recorizq);
		}

		if (recorder == recorizq) {
			System.out.println("La palabra " + palabra + "Es palíndromo");
		} else {
			System.out.println("La palabra " + palabra + " No es palíndromo");
		}
		entrada.close();
	}

}
