package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos nuestras variables y constantes
		final float INFANTILES = (float) 15.50;
		final float ADULTOS = 20;
		int entradasadul;
		int entradasinf;
		float total;
		//Abrimos el Scanner
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario el numero de entradas que desea comprar de cada una
		System.out.println("Introduzca el numero de entrads de adultos que desea: ");
		//Leemos el numero del teclado
		entradasadul = sc.nextInt();
		System.out.println("Introduzca el numero de entrads de infantiles que desea: ");
		//Leemos el numero del teclado
		entradasinf = sc.nextInt();
		//Creamos las operaciones matematicas
		total = entradasadul * ADULTOS + entradasinf * INFANTILES; 
		//Ofrecemos al usuario el precio final
		System.out.println("Su precio final es de: " + (total >= 100f ? total - (total * 0.05) : total));
        //Cerramos el Scanner
		sc.close();
	}

}
