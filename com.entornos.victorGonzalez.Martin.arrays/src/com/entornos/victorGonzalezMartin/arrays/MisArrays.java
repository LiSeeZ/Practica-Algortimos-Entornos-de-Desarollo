package com.entornos.victorGonzalezMartin.arrays;
/**
 * @version 1
 * 
 * @author Victor
 */
public abstract class MisArrays {
	
	/**
	 * Recibe un array de números enteros y devuelve la media con decimales de dicho array.
	 * 
	 * @param array de números enteros
	 * .
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

}
