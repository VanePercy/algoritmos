/*Determinar los valores de A, B, C y D después de la ejecución de las siguientes instrucciones:*/
public class Valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;

		a = 1;
		b = 4;
		c = a + b;
		d = a - b;
		a = c + 2 * b;
		b = c + b;
		c = a * b;
		d = b + d;
		a = d + c;
		if (c > d) {
			c = a - d;
		} else {
			c = b - d;
		}
		
		System.out.println("a = "+ a + " ," +  " b = " +  b + " ," + " c = " + c + " ," + " d ="  + d);

	}

}
