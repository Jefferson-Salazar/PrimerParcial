package parcial;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion; // variable que guardará la opción que el usuario elija del menú

	     // Este ciclo permite que el menú se repita hasta que el usuario decida salir
	     do {

	         // MENÚ PRINCIPAL
	         System.out.println("\n=============== MENU ===============");
	         System.out.println("1. Tabla de multiplicar de n del 1 al 12");
	         System.out.println("2. Promedio de 5 calificaciones");
	         System.out.println("3. Generar correo electronico");
	         System.out.println("4. Generar usuario");
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
	
	
	     // EJERCICIO 1
	     static void ejercicio1() {
	     }

	     // EJERCICIO 2
	     static void ejercicio2() {

	     }

	     // EJERCICIO 3
	     static void ejercicio3() {

	     }

	  // EJERCICIO 4
	     static void ejercicio4() {

	         
	     }
	     

}
