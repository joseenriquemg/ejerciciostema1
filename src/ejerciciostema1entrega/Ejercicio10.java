package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		float metros;
		float centimetros;
		//Abrimos el es Scanner
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario los metros
		System.out.println("Introduzca los metros de su lanzamiento: ");
		//Leemos el numero del teclado
		metros = sc.nextFloat();
		//Añadimos las operaciopnes matematicas
		centimetros = metros *100;
		//Damos el resultado al usuario
		System.out.println("Su puntuacion final es: " + (int)centimetros);
		//Cerramos el Scanner
		sc.close();

	}

}
