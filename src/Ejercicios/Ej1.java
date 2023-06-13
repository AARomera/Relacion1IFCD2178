/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Andrés
 *
 */
public class Ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//1.Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		float num1 = teclado.nextFloat();
		
		System.out.println("Introduce un número: ");
		float num2 = teclado.nextFloat();
		
		System.out.printf("Los números introducidos son %f y %f.",num1,num2);
		
		teclado.close();
	}

}
