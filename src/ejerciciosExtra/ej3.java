package ejerciciosExtra;

import java.util.Arrays;

public class ej3 {
	
	//Recorrer un array de forma recursiva

	public static void recorrer(int[] arrayRecorrer, int i) {
		if (i == arrayRecorrer.length) {return;}
		System.out.println(arrayRecorrer[i]);
		recorrer(arrayRecorrer, i+1);
		
		
	}
	public static void main(String[] args) {
		int[] arrayEjemplo = {2, 3, 5, 8, 10};
		recorrer(arrayEjemplo, 0);

	}

}
