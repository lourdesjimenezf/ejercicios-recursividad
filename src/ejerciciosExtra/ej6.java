package ejerciciosExtra;

public class ej6 {
	//Calcular el valor de la posición fibonacci usando recursividad.
	//Sucesión de números donde cada número es la suma de los dos anteriores
	
	public static int fibonacci(int i, int j,int indice, int n) {
		int suma;
		
		if (indice==n) {return i;} 
		suma = i+j;
		i = j;
		j = suma;
		indice++;
		
		return fibonacci(i,j,indice, n);
	}
	public static void main(String[] args) {
		int n= 7;
		int resultado = fibonacci(0,1,0,n);
		System.out.println("El valor de la posicion " + n + " de Fibonacci es "+ resultado);
		

	}

}
