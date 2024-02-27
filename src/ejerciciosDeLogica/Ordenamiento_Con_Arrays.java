package ejerciciosDeLogica;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ordenamiento_Con_Arrays {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite la longitud del array: ");
		int longitud = read.nextInt();
		
		/*
		Si quieres ordenar los numeros de forma descendente utilizando los metodos de Arrays, no debes crear arreglos 
		de tipos primitivos si no que debes hacerlo con Integer. para asi poder usar el metodo
		Arrays.sort(numeros, Collections.reverseOrder)
		*/
		
		Integer numeros[] = new Integer[longitud];
		
		for(int i = 0; i<numeros.length; i++) {
			
			System.out.print("Digite el " + (i+1) + "° numero: ");
			numeros[i] = read.nextInt();
			
		}
		
		// Algoritmo burbuja
		/*
		for(int i = 0; i < numeros.length - 1; i++) {
			for(int j = 0; j < numeros.length - 1; j++) {
				if(numeros[j] > numeros[j+1]) { // menor a mayor
					int temp = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = temp;
				}
			}
		}
		*/
		
		// Metodo especial de Arrays - Para ordenar numeros de menor a mayor
		//Arrays.sort(numeros);
		
		// Metodo especial de Arrays - Para ordenar numeros de mayor a menor
		Arrays.sort(numeros, Collections.reverseOrder());
		
		// Muestro los valores
		/*
		System.out.println("Numeros ordenados de menor a mayor");
		for(int i = 0; i < numeros.length; i++) {
			System.out.println((i+1) + ") " + numeros[i]);
		}
		*/
		
		// Otra forma de mostrar los valores
		System.out.println("Arreglo ordenanado de mayor a menor: " + Arrays.toString(numeros));
		
		read.close(); // Finalizo la entrada de datos

	}

}
