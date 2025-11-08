package ejerciciosExtra;

public class ej10 {
	/*
	Haz una función que obtenga el maximo numero de un array, pasandole el array, 
	el indice y el numero maximo actual.
	Otra función sin que sea necesario el tercer parámetro.

	Haz lo mismo con el mínimo.
	*/
	
	//BUSCAR MÁXIMO
	public static int maxArray(int[] array, int indice, int numMax) {
		if(array[indice]==numMax) {
			return numMax;
		}
		
		return maxArray(array, indice+1, numMax);
	}
	
	//BUSCAR MÁXIMO SIN TERCER PARÁMETRO
	public static int maxArray1(int[] array, int indice) {
		int numMax;
		
		if(indice == array.length-1) {
			return array[indice];
		}
	
		 // Llamada recursiva: obtenemos el máximo del resto del array
        int maxDelResto = maxArray1(array, indice + 1);

        // Comparamos el actual con el máximo del resto
        if (array[indice] > maxDelResto) {
            return array[indice];
        } else {
            return maxDelResto;
        }
	}
	
	//BUSCAR MÍNIMO
	public static int minArray(int[] array, int indice, int numMin) {
		if(array[indice]==numMin) {
			return numMin;
		}
		
		return maxArray(array, indice+1, numMin);
	}
	
	
	public static void main(String[] args) {
		int[] array = {7, 10, 15, 1, 3, 8};
		
		int numMax = 15;
		System.out.println(maxArray(array, 0, numMax));
		
		int numMin = 1;
		System.out.println(minArray(array, 0, numMin));
		
		System.out.println(maxArray1(array, 0));

	}

}
