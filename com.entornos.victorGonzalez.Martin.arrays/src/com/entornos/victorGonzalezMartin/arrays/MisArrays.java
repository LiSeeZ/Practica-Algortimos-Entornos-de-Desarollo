package com.entornos.victorGonzalezMartin.arrays;

import java.util.Arrays;

/**
 * @version 1.1
 * 
 * @author Victor
 */
public abstract class MisArrays {

	/**
	 * Recibe un array de números enteros y devuelve la media con decimales de dicho
	 * array.
	 * 
	 * @param array de números enteros
	 * 
	 * @return devuelve la media con decimales de dicho array.
	 */

	public static double media(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	/**
	 * Recibe un array de números enteros y devuelve la mediana con decimales de
	 * dicho array.
	 * 
	 * @param array de números enteros
	 * 
	 * @return devuelve la mediana con decimales de dicho array.
	 */

	public static double mediana(int[] array) {
		Arrays.sort(array);

		double mediana = 0.0;
		int mitad = array.length / 2;
		if (array.length % 2 == 0) {
			mediana = (array[mitad - 1] + array[mitad]) / 2;
		} else {
			mediana = array[mitad];
		}
		return mediana;
	}

}
