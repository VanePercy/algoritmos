/*Si A = 6, B = 2 y C = 3, encontrar los valores de las siguientes expresiones:*/
public class Expresiones_Aritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 6, b = 2, c = 3, operacion1, operacion2, operacion3, operacion4, operacion5, operacion6;

		operacion1 = a - b + c;
		operacion2 = a * b / c;
		operacion3 = a / b + c;
		operacion4 = a * b % c;
		operacion5 = a + b % c;
		operacion6 = a / b / c;
		
		System.out.println("Operaciones 1");
		System.out.println("-------------------------------------");
		System.out.println("A - B + C = " + operacion1);
		System.out.println("A * B / C = " + operacion2);
		System.out.println("A / B + C = " + operacion3);
		System.out.println("A * B mod C = " + operacion4);
		System.out.println("A + B mod C = " + operacion5);
		System.out.println("A / B / C = " + operacion6);

	}
	
}
