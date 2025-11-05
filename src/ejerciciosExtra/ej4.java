package ejerciciosExtra;

public class ej4 {
	//Buscar un elemnto de un array en forma recursiva
	public static void elementoArray(int[] arrayEnteros,int i, int numBuscado) {
		
		//CASO BASE
		if (i == arrayEnteros.length) {
			System.out.println("El elemento " + numBuscado + " no está en el array.");
		    return;
		    }
		 
		if (arrayEnteros[i] == numBuscado) {
			System.out.println("El elemento buscado es el " + arrayEnteros[i] + " que está en la posición " + i);
			return; //Si lo hemos encontrado paramos de buscar
		}
		elementoArray(arrayEnteros, i+1, numBuscado);
		
	}

	public static void main(String[] args) {
		int[] arrayEjemplo = {2, 3, 5, 8, 10};
		elementoArray(arrayEjemplo, 0, 10);

	}

}
