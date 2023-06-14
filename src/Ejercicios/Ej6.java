/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Andrés
 *
 */
public class Ej6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6.Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la velocidad en km/h: ");
		double km = teclado.nextDouble();
		System.out.println("La velocidad se convierte en "+ (km*1000/3600) +"m/s.");
		teclado.close();

	}

}
