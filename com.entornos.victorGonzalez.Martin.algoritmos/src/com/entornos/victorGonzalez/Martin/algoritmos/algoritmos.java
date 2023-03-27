package com.entornos.victorGonzalez.Martin.algoritmos;
/**
 * @version 1.0
 * 
 * @author Victor
 */
public abstract class algoritmos {

	/**
	 * Devuelve el numerode fibonacci de dicho numero.
	 * 
	 * @param numero numero al que le haremos el fibonacci 
	 * 		
	 * @return	el numero en fibonacci de ese numero.
	 */
	public int fibonacci (int numero) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (int x = 1; x <= numero; x++) {
			System.out.print(actual + ", ");
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		return actual;
	}
	

}
