package com.entornos.victorGonzalez.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.entornos.victorGonzalezMartin.arrays.MisArrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class testMisArrays {

	int array1[], array2[], array3[];

	@BeforeAll
	void iniciar() {
		array1 = new int[] { 1, 3, 2, 7 };
		array2 = new int[] { 9, 8, 10 };
		array3 = new int[] { 6, 2, 4, 7 };
	}

	@Test
	void testMedia() {
		assertEquals(3, Math.round(MisArrays.media(array1)));
		assertEquals(9, Math.round(MisArrays.media(array2)));
		assertEquals(4, Math.round(MisArrays.media(array3)));
	}

	@Test
	void testMediana() {
		assertEquals(2, MisArrays.mediana(array1));
		assertEquals(9, MisArrays.mediana(array2));
		assertEquals(5, MisArrays.mediana(array3));
	}

	@Test
	void testMaximo() {
		assertEquals(7, MisArrays.maximo(array1));
		assertEquals(10, MisArrays.maximo(array2));
		assertEquals(7, MisArrays.maximo(array3));
	}

	@Test
	void testMinimo() {
		assertEquals(1, MisArrays.minimo(array1));
		assertEquals(8, MisArrays.minimo(array2));
		assertEquals(2, MisArrays.minimo(array3));
	}
}
