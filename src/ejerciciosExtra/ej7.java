package ejerciciosExtra;

import java.util.Arrays;

public class ej7 {
	
	//Invertir una palabra de forma recursiva


	public static char[] invertir(char[] palabraInvertir, char[] palabraNueva, int i, int n) {
		
		if(i>=palabraInvertir.length) {return palabraNueva;}
		
		palabraNueva[i] = palabraInvertir[n];
		i++;
		n--;
		
		System.out.println(Arrays.toString(palabraInvertir));
		System.out.println(Arrays.toString(palabraNueva));
		System.out.println("---------");
		
		return invertir(palabraInvertir, palabraNueva, i, n);
	}

	public static void main(String[] args) {
		
		char[] palabra = {'L', 'A', 'P', 'I', 'Z'};
		char[] palabraNueva = new char[palabra.length];
		int n = palabra.length - 1;
		char[] resultado = invertir(palabra, palabraNueva, 0, n);
		// TODO Auto-generated method stub

	}

}
