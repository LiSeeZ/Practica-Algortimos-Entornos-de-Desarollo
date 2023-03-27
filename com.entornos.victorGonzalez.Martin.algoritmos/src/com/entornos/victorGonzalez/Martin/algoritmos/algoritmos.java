package com.entornos.victorGonzalez.Martin.algoritmos;

/**
 * @version 1.2
 * 
 * @author Victor
 */
public abstract class algoritmos {

	/**
	 * Recibe un numero entero y devuelve el fibonacci de dicho numero.
	 * 
	 * @param numero al que le haremos el fibonacci.
	 * 
	 * @return devuelve el numero fibonacci de dicho numero.
	 */
	public int fibonacci(long numero) {
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
	 * Recibe un numero entero y devuelve el factorial de dicho numero.
	 * 
	 * @param numero al que le haremos el factorial.
	 * 
	 * @return devuelve el factorial de dicho numero.
	 */
	public double factorial(long numero) {
		double res = 1;
		for (int i = 1; i <= numero; i++) {
			res = res * i;
		}
		return res;
	}

	/**
	 * Recibe un numero entero y devuelve true o false en funcion de si es primo o
	 * no.
	 * 
	 * @param numero al que comprobaremos si es primo o no.
	 * 
	 * @return devuelve true o false en funcion de si es primo o no.
	 */

	public static boolean Primo(int numero) {
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			if (numero % x == 0)
				return false;
		}
		return true;
	}

}
