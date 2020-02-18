/*Escribir un algoritmo que calcule la compra de un cliente en un supermercado.
 * Por cada producto de la compra, se leerá el precio del producto y se calculará
 *  el importe mediante la expresión precio * unidades. Una vez calculado 
 *  el importe se acumulará al total que, previamente, se habrá inicializado a 0.
 *   El proceso continuará mientras el cliente todavía tenga productos.*/
import java.util.*;

public class Compra_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double total_compra = 0, precio_produc, costo_produc = 0;
		int unidades = 0, resp = 1;
		Scanner entrada = new Scanner(System.in);
		
		while (resp == 1) {

			System.out.println("Ingrese precio de producto");
			precio_produc = entrada.nextDouble();

			System.out.println("Ingrese unidades a comprar del producto");
			unidades = entrada.nextInt();

			costo_produc = precio_produc * unidades;
			total_compra = total_compra + costo_produc;

			System.out.println("¿Tiene más productos para ingresar? Digite --> 1 = (SI)  0 = (NO)");
			resp = entrada.nextInt();

		}

		System.out.println("El total de la compra es = " + total_compra);

		entrada.close();
	}

}
