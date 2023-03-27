package com.entornos.victorGonzalez.Martin.algoritmos;

/**
 * @version 1.0
 * 
 * @author Victor
 */
public abstract class algoritmos {

	/**
	 * Recibe un numero entero y devuelve el fibonacci de dicho numero
	 * 
	 * @param numero al que le haremos el fibonacci
	 * 
	 * @return devuelve el numero fibonacci de dicho numero.
	 */
	public int fibonacci(int numero) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (int x = 1; x <= numero; x++) {
			System.out.print(actual + ", ");
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		return actual;
	}

	/**
	 * Recibe un numero entero y devuelve el factorial de dicho numero .
	 * 
	 * @param numero al que le haremos el factorial
	 * 
	 * @return devuelve el factorial de dicho numero .
	 */

	public double factorial(int numero) {
		double res = 1;
		for (int i = 1; i <= numero; i++) {
			res = res * i;
		}
		return res;
	}

}
