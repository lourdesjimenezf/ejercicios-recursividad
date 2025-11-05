package ejercicicios21;

public class EJ5 {
	public static int misterio(int a, int b) {
		   if (b == 0)     return 0;
		   if (b % 2 == 0) return misterio(a*a, b/2);
		   return misterio(a*a, b/2) + a;
		}

	public static void main(String[] args) {
		System.out.println(misterio(3,6));

	}
	//Pensado en papel, comprobado en programa
}
