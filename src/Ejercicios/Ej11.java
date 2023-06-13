/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//11.Programa que lee un número de 3 cifras y muestra sus cifras por separado. 345     3 4 5  
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un numero de 3 cifras.");
		int numero = teclado.nextInt();
		
		int digito1 = (numero/100);
		int digito2	= (numero/10)%10;
		int digito3 = (numero%10);
		if (numero<100 || numero >999) {
			System.out.println("Numero clarita");
		} else {
		System.out.println("El primer digito es: " + digito1);
		System.out.println("El segundo digito es: " + digito2);
		System.out.println("El tercer digito es: " + digito3);
		}
		teclado.close();
	}
}
