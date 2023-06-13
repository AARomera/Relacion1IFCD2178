/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//13.Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el final igual que en el ejemplo.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero de 5 cifras.");
		int numero = teclado.nextInt();
		
		int digito1 = (numero%10000);
		int digito2	= (numero%1000);
		int digito3 = (numero%100);
		int digito4 = (numero%10);
		int digito5 = numero;
		
		if (numero<10000 || numero >99999) {
			System.out.println("Numero clarita");
		} else {
		
		System.out.println( digito4);
		System.out.println( digito3);
		System.out.println( digito2);
		System.out.println( digito1);
		System.out.println( digito5);
		}
		teclado.close();
	}

}
