/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 15.Programa para pasar de grados centígrados a grados Kelvin.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la temperatura en ºC: ");
		double temperatura = teclado.nextFloat();
		double kelvin = temperatura + 273.15;
		System.out.printf("La temperatura en kelvin es de %.2f",kelvin);
		teclado.close();
	}

}
