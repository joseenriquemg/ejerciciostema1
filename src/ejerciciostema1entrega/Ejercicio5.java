package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		 float a;
		 float b;
		 float c;
		 float x;
		 float y;
		  Scanner sc = new Scanner(System.in);
	      //Pedimos al usuario el valor de a
		  System.out.println("Introduzca el valor de a: ");
		  //Leemos el numero del teclado
		  a = sc.nextInt();
	      //Pedimos al usuario el valor de b
		  System.out.println("Introduzca el valor de b: ");
		  //Leemos el numero del teclado
		   b = sc.nextInt();
	      //Pedimos al usuario 
		  System.out.println("Introduzca el valor de c: "  );
		  //Leemos el numero del teclado
		   c = sc.nextInt();
		   //Pedimos al usuario el valor de x
		   System.out.println("Introduzca el valor de x: ");
		   //Leemos el numero del teclado
		   x = sc.nextInt();
		   //Aplicamos los calculos matematicos
		   y =a*x*x+b*x+c;
		   //Ofrecemos al usuario el resultado
		   System.out.println("El numero que se corresponde con la y para esos valores es: " + y);
		   //Cerramos el Scanner
		   sc.close();
		   
		   
	}

}
