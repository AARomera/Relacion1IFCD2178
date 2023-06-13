/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Andrés
 *
 */
public class Ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 3.Programa Java que lee un número entero por teclado y obtiene y muestra 
		// por pantalla el doble y el triple de ese número.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Intruduzca un número: ");
		int numero = teclado.nextInt();
		
		System.out.printf("El numero que ha introducido es el %d con el doble %d y el triple %d",numero,numero*2,numero*3);
		teclado.close();
	}

}
