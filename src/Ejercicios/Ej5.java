/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Andrés
 *
 */
public class Ej5 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 5.Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud 
		// y el área de la circunferencia. Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un radio: ");
		float radio = teclado.nextFloat();
		// double PI = Math.PI;
		System.out.println("La longiud de la circunferencia es: "+(2*Math.PI*radio)+" y el área es: "+(Math.PI*(Math.pow(radio,2))));
		teclado.close();
	}
}
