package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		 int segundos;
		 int minutos;
		 int horas;
		 int segundos2;
         Scanner sc = new Scanner(System.in);
		 //Pedimos al usuario los segundos que desea transformar
		  System.out.println("Introduzca los segundos: ");
		  //Leemos el numero del teclado
		  segundos = sc.nextInt();
		 //Añadimos las operaciones matematicas
		  horas = segundos /3600;
		  minutos =  segundos %3600 /60;
		  segundos2 = segundos %3600 %60;
		  //Ofrecemos el resultado al usuario
		  System.out.println("Se corresponden con " + horas + " horas " + minutos +" minutos " + segundos2 + " segundos");
		  //Cerramos el Scanner
		  sc.close();
		  
	}

}
