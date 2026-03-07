package parcial;

import java.util.Scanner;
//Importamos Scanner para poder leer datos que el usuario escriba desde el teclado


public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion; // variable que guardará la opción que el usuario elija del menú

	     // Este ciclo permite que el menú se repita hasta que el usuario decida salir
	     do {

	         // ===== MENÚ PRINCIPAL =====
	         System.out.println("\n=============== MENU ===============");
	         System.out.println("1. Suma de divisibles entre 4");
	         System.out.println("2. Factorial");
	         System.out.println("3. Positivos, negativos y ceros");
	         System.out.println("4. Promedio de pares");
	         System.out.println("0. Salir");

	         // Pedimos al usuario que elija una opción
	         System.out.print("Seleccione una opcion: ");
	         opcion = sc.nextInt();

	         // Switch que ejecuta el método correspondiente según la opción elegida
	         switch (opcion) {

	             case 1: 
	            	 ejercicio1(); 
	            	 break;
	             case 2: 
	            	 ejercicio2(); 
	            	 break;
	             case 3: 
	            	 ejercicio3(); 
	            	 break;
	             case 4: 
	            	 ejercicio4(); 
	            	 break;
	            	 break;
	             case 0:
	                 // Si el usuario elige 0 el programa terminará
	                 System.out.println("Saliendo del programa...");
	                 break;

	             default:
	                 // Si escribe una opción incorrecta
	                 System.out.println("Opcion invalida");
	         }

	     } while (opcion != 0); 
	     // El menú seguirá apareciendo hasta que el usuario escriba 0
	}

}
