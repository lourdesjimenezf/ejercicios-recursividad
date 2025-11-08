package ejercicios22;

import java.util.ArrayList;
import java.util.List;

public class ej1 {
	
	static int numDiscos; //número discos
	static char origen = 'o'; //torre origen
	static char auxiliar = 'a'; //torre auxiliar
	static char destino = 'd'; //torre destino
	
	public static void main(String[] args) {
		hanoi(4, origen, auxiliar, destino );
	}
	
	public static void hanoi(int numDiscos, char origen, char auxiliar, char destino) {
		//si solo hay un disco muevelo de o a d
		if(numDiscos==1) {
			System.out.println("Mover disco grande de origen a destino");
			return;
		}
		if(numDiscos>1) {
			
			//Mueves los n-1 discos de A a B, usando C como auxiliar.
			hanoi(numDiscos -1, origen, destino, auxiliar);
			//Mueves el disco más grande de A a C
			System.out.println("Mover disco " + numDiscos +" de origen a destino");;
			//Mueves los n-1 discos de B a C, usando A como auxiliar
			hanoi(numDiscos-1, auxiliar, origen, destino);
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	//ESTA MAL: NO SE PUEDE COLOCAR UN DISCO GRANDE SOBRE UNO PEQUEÑO
	
	/*
	//1. TORRE 1: LISTA DE TIPO DISCO DONDE ALMACENO 4 DISCOS ORDENADOS DE MAYOR A MENOR (myor abajo)
	List<Disco> torre1 = new ArrayList<Disco>();
	
	for(int i=4; i>0; i--) {
		torre1.add(new Disco(i));
	
	}
	System.out.println("La torre 1 INICIAL contiene: " + torre1);
	
	
	//2. TORRE 2: LISTA VACÍA DONDE SE ALMACENAN LOS DISCOS QUE HE SACADO DE MENOR A MAYOR (menor abajo)
	//tengo que sacar el disco en posicion3, despues2 despues 1 y despues 0, quedando el mayor arriba
	List<Disco> torre2 = new ArrayList<Disco>();
	for(int i=torre1.size() - 1; i>=0; i--) {
		Disco disco = torre1.remove(i); //saca el disco de torre 1
		torre2.add(disco); //mete el disco en torre 2
		
	}
	System.out.println("La torre 1 FINAL contiene: " + torre1);
	System.out.println("La torre 2 INICIAL contiene: " + torre2);
	
	//3. TORRE 3: LISTA VACÍA DONDE PONGO LOS DISCOS DE LA TORRE 3 POR ORDEN, QUEDANDO ORDENADOS
	List<Disco> torre3 = new ArrayList<Disco>();
	for(int i=torre2.size() - 1; i>=0; i--) {
		Disco disco = torre2.remove(i); //saca el disco de torre 2
		torre3.add(disco); //mete el disco en torre 3
		
	}
	
	System.out.println("La torre 2 FINAL contiene: " + torre2);	
	System.out.println("La torre 3 FINAL contiene: " + torre3);
*/
	//
	
	/*TEORÍA: 
	 *  El número mínimo de movimientos es 2n - 1, donde n es la cantidad de discos.
	 *  Si la cantidad de discos es impar la pieza inicial irá a destino 
	 *  y si es par a auxiliar.
	
*/	
	

	












