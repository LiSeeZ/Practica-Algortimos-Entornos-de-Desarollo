package com.entornos.victorGonzalez.Martin.algoritmos;

public class Principal extends algoritmos {

	public static void main(String[] args) {
		/* Apartado 1 */
		int numeros[] = new int[5];
		int resultadoFibonacci[] = new int[5];
		double resultadoFactorial[] = new double[5];
		boolean resultadoPrimos[] = new boolean[5];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) ((Math.random() * (20 - 1 + 1)) + 1);
		}
		/* Apartado 2 */
		for (int i = 0; i < numeros.length; i++) {
			resultadoFibonacci[i] = algoritmos.fibonacci(numeros[i]);
		}
		
		/* Apartado 3 */
		for (int i = 0; i < numeros.length; i++) {
			resultadoFactorial[i] = algoritmos.factorial(numeros[i]);
		}
		
		/* Apartado 4 */
		for (int i = 0; i < numeros.length; i++) {
			resultadoPrimos[i] = algoritmos.Primo(numeros[i]);
		}
		
		
		
	}

}
