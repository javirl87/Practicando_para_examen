package pkgAlgoritmo;

public class AlgoritmoOrdenacion {

	// Algoritmo de ordenacion por insercion
	public static void ordenaInsercion(int[] vector) {
		for(int i = 1; i< vector.length; i++) {
			int j = i;
			while((j>0) && (vector[j] < vector[j-1])){
				int tmp = vector[j];
				vector[j]    = vector[j-1];
				vector[j-1]  = tmp;
				j--;
			}

		}
	}
}