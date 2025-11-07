package ejerciciosExtra;

public class ej8 {
	//Calcula la potencia de un numero de forma recursiva, tanto para exponentes
	//negativos como positivos.
	
	public static float potencia(int n, int e) {
		if (e==0) {
			return 1;
		}
		if (e<0) {
			return  1/(potencia(n, -e));
		}
		else {return  n * potencia(n, e-1);}
		
	}
	public static void main(String[] args) {
		System.out.println(potencia(2,-3));
		

	}

}
