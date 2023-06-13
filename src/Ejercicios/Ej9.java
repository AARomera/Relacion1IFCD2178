/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 9.Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un lado: ");
		double lado1 = teclado.nextDouble();
		System.out.println("Introduce un lado: ");
		double lado2 = teclado.nextDouble();
		System.out.println("Introduce un lado: ");
		double lado3 = teclado.nextDouble();
		
		double semiperimetro = (lado1+lado2+lado3)/2;
		double area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
		
		if (Double.isNaN(area)) {
			System.out.println("Intriangulizable");
		} else {
			System.out.println("El area del triangulo es: "+ area);
		}
		teclado.close();
	}

}
