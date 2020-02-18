/*Se tienen tres variables A, B y C. Escribir las instrucciones necesarias para intercambiar entre sí sus
valores del modo siguiente:
B toma el valor de A
C toma el valor de B
A toma el valor de C*/

public class Intercambio_Valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 29, b = 11, c = 7, aux = 0;
		
		System.out.println("Antes del cambio");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		
		aux = a;
		a = c;
		c = b;
		b = aux;

		System.out.println("Después del cambio");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		
		
	}

}
