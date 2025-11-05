package ejerciciosExtra;

public class ej5 {
	//Recorrer una matriz de forma recursiva
	
	//i filas
	//j columnas
	
	public static void recorrerMatriz(int[][] matrizRecorrer, int i, int j) {
		if (i > matrizRecorrer.length || j > matrizRecorrer.length) {return;}
		System.out.println(matrizRecorrer[i][j]);
		recorrerMatriz(matrizRecorrer, i, j+1);
		recorrerMatriz(matrizRecorrer, i+1, j-2);
		
		
	}

	public static void main(String[] args) {
		int[][] matrizEjemplo = {{1, 2, 3}, {4,5,6}};
		recorrerMatriz(matrizEjemplo, 0,0);

	}

}
