package ejerciciosDeLogica;

import java.util.Scanner;

public class Main {
	
	static void verPares(int cantidad) {
		int orden, num;
		orden = 0;
		num = 0;
		while(cantidad > 0) {
			num++;
			if(num % 2 == 0) {
				orden++;
				System.out.println(orden + ") " + num);
				cantidad--;
			}
		}
	}
	
	static void verImpares(int cantidad) {
		int orden, num;
		orden = 0;
		num = 0;
		while(cantidad > 0) {
			num++;
			if(num % 2 != 0) {
				orden++;
				System.out.println(orden + ") " + num);
				cantidad--;
			}
		}
	}
	
	static void verPrimos(int cantidad) {
		int contador_divisores, divisor_actual, orden, num;
		orden = 0;
		num = 0;
		while(cantidad > 0) {
			num++;
			contador_divisores = 0;
			divisor_actual = 1;
			while(divisor_actual <= num) {
				if(num % divisor_actual == 0) {
					contador_divisores++;
				}
				divisor_actual++;
			}
			if(contador_divisores == 2) {
				orden++;
				System.out.println(orden + ") " + num);
				cantidad--;
			}
		}
	}
	
	public static void main(String [] args) {
		
		Scanner read = new Scanner(System.in);
		
		int decision, cantidad_numeros;
		
		do {
			
			System.out.print("Digite la cantidad de numeros que quiere mostrar: ");
			cantidad_numeros = read.nextInt();
			
			System.out.println("Que tipo de números deseas ver?");
			System.out.println("1) Pares. \n2) Impares. \n3) Primos");
			decision = read.nextInt();
			
			switch(decision) {
			
				case 1:
					System.out.println("Estos son los primeros " + cantidad_numeros + " numero pares.");
					verPares(cantidad_numeros);
					break;
				case 2:
					System.out.println("Estos son los primeros " + cantidad_numeros + " numero impares.");
					verImpares(cantidad_numeros);
					break;
				case 3:
					System.out.println("Estos son los primeros " + cantidad_numeros + " numero primos.");
					verPrimos(cantidad_numeros);
					break;
				default:
					System.out.println("Opcion incorrecta. Ingrese nuevamente.");
					break;
					
			}
			
			System.out.println("Quiere ver otros numeros? 1) Si. \0) Finalizar");
			decision = read.nextInt();
			
		}while(decision != 0);
		
		read.close();
		
	}
	
	
}
