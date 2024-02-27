package ejerciciosDeLogica;

import java.util.Scanner;

public class Bucles_ejercicio1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		// 1) Utilizando la sentencia while, imprima todos los numeros entre 2 variables "a" y "b"
		System.out.println("Ejercicio 1");
		int inicio1 = 5;
		int fin1 = 14;
		
		while(inicio1 <= fin1) {
			System.out.println(inicio1);
			inicio1++;
		}
		
		// 2) a lo anterior solo muestre los numeros pares
		System.out.println("Ejercicio 2");
		
		int inicio2 = 5;
		int fin2 = 14;
		
		while(inicio2 <= fin2) {
			if(inicio2%2 == 0) {
				System.out.println(inicio2);
			}
			inicio2++;
		}
		
		// 3) A lo anterior, con una variable extra, elija si se deben mostrar los numeros pares o impares
		System.out.println("Ejercicio 3");
		
		System.out.println("Quieres ver los numeros par o impar?");
		String decision = read.nextLine();
		
		int inicio3 = 5;
		int fin3 = 14;
		
		if(decision.equalsIgnoreCase("par")) {
			while(inicio3 <= fin3) {
				if(inicio3 % 2 == 0) {
					System.out.println(inicio3);
				}
				inicio3++;
			}
		}else if(decision.equalsIgnoreCase("impar")) {
			while(inicio3 <= fin3) {
				if(inicio3 % 2 != 0) {
					System.out.println(inicio3);
				}
				inicio3++;
			}
		}else {
			System.out.println("Opcion incorrecta");
		}
		
		read.close();

	}

}
