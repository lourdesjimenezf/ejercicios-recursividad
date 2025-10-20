package ejercicicios21;

public class ej1 {
	
	static long factorial(long n) { 
		if (n <= 1) return 1;
		else return n * factorial(n-1);
	}

	public static void main(String[] args) {
		
		System.out.println("Si n<0 el metodo devuelve 1");
	}

}
