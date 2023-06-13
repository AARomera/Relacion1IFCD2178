/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Andrés
 *
 */
public class Ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 2.Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.printf("Buenos días %s.", nombre);
		teclado.close();
	}

}
