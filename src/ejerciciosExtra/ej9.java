package ejerciciosExtra;

import java.util.Scanner;

public class ej9 {
	//Suma los digitos de un numero de forma recursiva.
	
	public static int suma(int[] digitos, int indice) {
		if (indice == digitos.length-1) {
			return digitos[indice];
		}

		return digitos[indice] + suma(digitos, indice+1);
		
	}
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Primer dígito: ");
		int n1 = num.nextInt();
		
		System.out.println("Segundo dígito: ");
		int n2 = num.nextInt();
		
		System.out.println("Tercer dígito: ");
		int n3 = num.nextInt();
		
		System.out.println("Cuarto dígito: ");
		int n4 = num.nextInt();
		
		int[] digitosNum = {n1, n2, n3, n4};
		
		int indice = 0;
		
		System.out.println(suma(digitosNum, indice));
	}

}
