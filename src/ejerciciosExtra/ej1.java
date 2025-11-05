package ejerciciosExtra;

public class ej1 {
	//Sumar los números números naturales hasta N (se lo damos nosotros) de forma recursiva.
	
	public static int suma(int n) {
		if (n==1) {
			return 1;
		}
		return n + suma(n-1);
	}


	public static void main(String[] args) {
		System.out.println(suma(5));

	}

}
