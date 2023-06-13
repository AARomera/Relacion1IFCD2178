/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//8 Programa que calcula el volumen de una esfera.
		Scanner teclado=new Scanner(System.in);
		System.out.println("Intriduzca el radio: ");
		double radio = teclado.nextDouble();
		
		System.out.println("El volumen de una esfera es: " + ((4/3)*Math.PI*Math.pow(radio, 3)) );
		teclado.close();
	}

}
