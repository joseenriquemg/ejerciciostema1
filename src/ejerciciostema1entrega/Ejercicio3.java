package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		//Creamos las variables necesarias 
	    int suma;
	    int x;
	    int num1;
	    int num2;
	    //Activamos el Scanner  
	    Scanner sc = new Scanner(System.in);
	    //Pedimos al usuario un numero entero
	    System.out.println("Escribe el numero entero: ");
	    //Leemos el numero del teclado
	    num1 = sc.nextInt();
	    //Pedimos al usuario el numero del que quiere que sea multipliplo el anterior
	    System.out.println("Escribe el numero del que quieres que el primero sea multiplo de el: ");
	    //Leemos el numero del teclado
	    num2 = sc.nextInt();
	    //Planteamos las operaciones que tiene que realizar el programa 
        x = num1 % num2;
	    suma = num2 - x;
	    //Ofrecemos el resultado al usuario    
	    System.out.println("Para que el primer numero sea multiplo del segundo hay  que sumar: " + suma);
		//Cerramos el scanner
	    sc.close();
	}
}
