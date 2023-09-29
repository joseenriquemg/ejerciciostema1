package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos una variable 
		double numero1 ;
		//Abrimos el Scanner
		Scanner sc = new Scanner(System.in);
		//Pedimos el numero que quiere redondear el usuario.
		System.out.println("Introduzca el numero que quieres redondear:");
		//Leemos el numero del teclado
		numero1=sc.nextDouble();
		//Modificamos la variable sumandole 0,5
		numero1+= 0.5;
		//Activamos la funcion de redondeo
		int res= (int)numero1;
		//Ofrecemos el resultado al usuario
		System.out.println("Su numero redondeado es:" + res); 
		//Cerramos el scanner
	      sc.close();

	
	
	
	
	}
} 