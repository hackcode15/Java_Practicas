package ejerciciosDeLogica;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		// Bucle While
		//int unNum = 1;
		/*
		while(unNum <= 10) {
			
			System.out.println(unNum);
			unNum++;
			
		}
		*/
		
		
		
		boolean terminoElPrograma = false;
		String accion;
		
		while(!terminoElPrograma) {
			
			System.out.println("Ingrese al ciclo WHILE");
			
			System.out.println("Quieres terminar el programa? SI / NO");
			accion = read.nextLine();
			
			if(accion.equalsIgnoreCase("SI")) {
				terminoElPrograma = true;
				System.out.println("Fin del programa.");
			}
			
		}
		
		
		// Bucle for
		/*
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		*/
		
		// Ejemplo del bucle do..while
		/*
		
		
		int suma, num;
		suma = 0;
		
		System.out.println("Ingrese numeros para sumarlos. (0 para finalizar)");
		
		do {
			
			System.out.print("Ingrese: ");
			num = read.nextInt();
			
			suma += num;
			
		}while(num != 0);
		
		System.out.println("La suma de todos los numeros ingresados es de: " + suma);
		
		
		*/
		read.close();
	}

}
