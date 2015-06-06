package pkgAlgoritmoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgAlgoritmo.AlgoritmoOrdenacion;

public class TestAlgoritmo {

	private AlgoritmoOrdenacion algoritmo = new AlgoritmoOrdenacion();
	
	@Test
	public void testVectorVacio() {
		int [] vector = {};
		//int [] vector = new int [0]
		algoritmo.ordenaInsercion(vector);
		int expected = 0;
		int actual = vector.length;
		
		assertEquals(expected, actual);
	}

	@Test
	public void testVectorConUnElemento() {
		int [] vector = {1};
		// int [] vector = new int [1];
		// vector[0] = 1;
		algoritmo.ordenaInsercion(vector);
		int [] expected = {1};
				
		assertArrayEquals(expected, vector);
	}	
	
	@Test
	public void testVectorConDosElementos() {
		int [] vector = {3, 2};
		// int [] vector = new int [1];
		// vector[0] = 1;
		algoritmo.ordenaInsercion(vector);
		int [] expected = {2, 3};
			
		assertArrayEquals(expected, vector);
	}	
	
}
