/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 */
public class Ej14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// 14.Programa que calcula el número de la suerte de una persona a partir de su fecha de nacimiento.El número de la suerte se calcula 		sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.Por ejemplo:Si la fecha 		de nacimiento es 12/07/1980 Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28Número de la suerte: 28
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el día de nacimieto");
		int dia = teclado.nextInt();
		System.out.println("Introduzca el mes de nacimieto");
		int mes = teclado.nextInt();
		System.out.println("Introduzca el año de nacimieto");
		int anno = teclado.nextInt();
		
		if (dia<1 && dia>31) {
			System.out.println("Día clarita.");
		}
		if (mes<1 && mes>12) {
			System.out.println("Día clarita.");
		}
		if (anno<1 && anno>9999) {
			System.out.println("Día clarita.");
		}
		int suerte = dia + mes + anno;
		
		int digito1 = suerte/1000;
		int digito2	= suerte%1000/100;
		int digito3 = suerte%1000%100/10;
		int digito4 = suerte%1000%100%10;
		
		int lucky =  digito1+ digito2+ digito3+ digito4;
		
		System.out.printf("El número de la suerte es el %d", lucky);
		
		teclado.close();
	}

}
