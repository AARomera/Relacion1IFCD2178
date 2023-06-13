/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		// 10.Programa que calcule el cambio que se debe devolver al usuario. 
		// Se pedirán por teclado dos números, el precio del artículo y el importe introducido. Se devolverá el número de monedas 
		// a entregar óptimo suponiendo que tenemos disponibilidad de monedas infinita.
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce el precio: ");
		float precio = teclado.nextFloat();
		System.out.println("Introduce el importe entregado: ");
		float entregado = teclado.nextFloat();
		
		double cambio = entregado-precio;
		int euros = (int) cambio;
		int euros2 = euros/2;
		int euros1 = euros%2;
		int centimos=  (int) ((cambio-euros)*100);
		int centimos50 = centimos/50;
		int centimos20 = (centimos%50)/20;
		int centimos10 = ((centimos%50)%20)/10;
		int centimos05 = (((centimos%50)%20)%10)/5;
		int centimos02 = ((((centimos%50)%20)%10)%5)/2;
		int centimos01 = ((((centimos%50)%20)%10)%5)%2;
		if (cambio<0) {
			System.out.println("Falta dinero.");
		} else if (cambio==0){
			System.out.println("Importe exacto.");
		} else {
			System.out.printf("Su cambio es:\n %d monedas de 2€\n %d monedas de 1€\n %d monedas de 50 centimos\n"
					+ " %d monedas de 20 centimos\n %d monedas de 10 centimos\n %d monedas de 5 centimos\n %d"
					+ " monedas de 2 centimos\n %d monedas de 1 centimo", 
					euros2,euros1,centimos50,centimos20,centimos10,centimos05,centimos02,centimos01);
		}
		
		teclado.close();
	}

}
