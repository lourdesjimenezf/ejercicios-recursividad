package ejerciciosExtra;

public class ej6 {
	//Calcular el valor de la posición fibonacci usando recursividad.
	
	//sucesión de números donde cada número es la suma de los dos anteriores
	
	public static int fibonacci(int i, int j, int indice, int max) {
		int suma;
		//if (i==0) {System.out.println(i);}
		//if (j==1) {System.out.println(j);}
		if (max==0) {
			return 0;
		}
		indice = i;
		suma = i + j;
		j= suma;
		System.out.println(suma);
		max--;
		indice++;
		return fibonacci(suma,j,indice, max);
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(0,1,0,6));

	}

}
