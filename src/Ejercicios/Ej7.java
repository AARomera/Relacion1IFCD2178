/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Andrés
 *
 */
public class Ej7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7.Programa lea la longitud de los catetos de un triángulo rectángulo 
		// y calcule la longitud de la hipotenusa según el teorema de Pitágoras. 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducza el primer cateto: ");
		double cateto1 =teclado.nextDouble();
		System.out.println("Introducza el segundo cateto: ");
		double cateto2 =teclado.nextDouble();
		
		System.out.println("La hipotenusa es: "+ (Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2,2))));
		teclado.close();
	}

}
