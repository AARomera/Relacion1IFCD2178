/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Andrés
 *
 */
public class Ej4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 4.Programa que lea una cantidad de grados centígrados y 
		//la pase a grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la temperatura en ºC: ");
		float C=teclado.nextFloat();
		System.out.println("Son "+ (32 + ( 9 * C / 5)) +"º Fahrenheit.");
		teclado.close();
	}

}
