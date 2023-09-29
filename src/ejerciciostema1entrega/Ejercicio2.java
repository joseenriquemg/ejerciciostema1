package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos las variables necesarias 
		int entero;
	    int suma;
	    int x;
	    //Activamos el Scanner  
	    Scanner sc = new Scanner(System.in);
	    //Pedimos al usuario un numero entero
	    System.out.println("Escribe un numero entero: ");
	    //Leemos el numero del teclado
	    entero = sc.nextInt();
	    //Planteamos las operaciones que tiene que realizar el programa 
        x = entero % 7;
	    suma = 7 - x;
	    //Ofrecemos el resultado al usuario    
	    System.out.println("para que sea multiplo de 7 hay  que sumar: " + suma);
		//Cerramos el scanner
	    sc.close();
	}

}
