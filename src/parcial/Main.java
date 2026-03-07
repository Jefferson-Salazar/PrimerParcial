package parcial;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcion = 0; // variable que guardará la opción que el usuario elija del menú

	     // Este ciclo permite que el menú se repita hasta que el usuario decida salir
	     do {
	    	 try {
	
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

         } catch (Exception e) {
             // Mensaje si el usuario ingresa algo que no sea número
             System.out.println("Error: Debe ingresar un número.");
             sc.nextLine(); 
         }

     } while (opcion != 0); 
	     // El menú seguirá apareciendo hasta que el usuario escriba 0
	 }
	
	
	     // EJERCICIO 1
	     static void ejercicio1() {
	    	 System.out.println("Escriba un número entre 1 y 12: ");
	    	 
	    	 int numero = sc.nextInt();
	    	 
	    	 if (numero >= 1 && numero <= 12)
	    		 
	    		 for (int i = 1; i <= 12; i++) {
	    	           System.out.println(numero + " x " + i + " = " + (numero * i));
	    	       }

	         else
	     System.out.println("Numero fuera del rango");
	    	 
	     }
	     

	     // EJERCICIO 2
	     static void ejercicio2() {
	    	 System.out.print("Escriba la primera calificacion: ");
	    	 int num1 = sc.nextInt();
	    	 
	    	 System.out.print("Escriba la segunda calificacion: ");
	    	 int num2 = sc.nextInt();
	    	 
	    	 System.out.print("Escriba la tercera calificacion: ");
	    	 int num3 = sc.nextInt();
	    	 
	    	 System.out.print("Escriba la cuarta calificacion: ");
	    	 int num4 = sc.nextInt();
	    	 
	    	 System.out.print("Escriba la quinta calificacion: ");
	    	 int num5 = sc.nextInt();
	    	 
	    	 double suma = num1 + num2 + num3 + num4 + num5;
	    	 
	    	 double promedio = suma / 5;
	    	 
	    	 System.out.println("El promedio es: " + promedio);

	     }

	     // EJERCICIO 3
	     static void ejercicio3() {
	    	 
	    	 
	    	 
	    	 System.out.print("Ingrese su nombre: ");
	     String nombre = sc.next();
	     nombre.toLowerCase();
	     
	    
	     System.out.print("Ingrese su apellido: ");
	     String apellido = sc.next();
	     apellido.toLowerCase();
	     
	     String nombreApellido = nombre + apellido;
	     nombreApellido.toLowerCase();
	     

	     System.out.println("Su correo electronico es: " + nombreApellido + "@umg.edu.gt");
	    	
	     }

	  // EJERCICIO 4
	     static void ejercicio4() {
	    	 System.out.print("Ingrese su nombre: ");
		     String nombre = sc.next();
		     nombre.toLowerCase();
		     nombre.charAt(0);
		    
		     System.out.print("Ingrese su apellido: ");
		     String apellido = sc.next();
		     apellido.toLowerCase();
		     
		     String usuario = nombre + apellido;
		     usuario.toLowerCase();
		     
		     System.out.println("Su usuario es : " + usuario);
	         
	     }
	     

}
