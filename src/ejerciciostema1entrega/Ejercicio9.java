package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		float num1;
		float num2;
		//Activamos el Scanner  
	    Scanner sc = new Scanner(System.in);
	    //Pedimos al usuario un numero 
	    System.out.println("Escribe un numero: ");
	    //Leemos el numero del teclado
	    num1 = sc.nextInt();
	    //Pedimos al usuario el numero
	    System.out.println("Escribe un numero: ");
	    //Leemos el numero del teclado
	    num2 = sc.nextInt();
	    //Aplicamos las operaciones y damos el resultado al usuario
	    System.out.println("Tu comparacion es: " + (num1 == num2 ? true : false));
	    //Cerramos el Scanner
	    sc.close();
	    
	    
	}

}
