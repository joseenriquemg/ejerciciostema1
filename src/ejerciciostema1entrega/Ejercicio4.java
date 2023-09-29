package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio4 {

	  public static void main(String[] args) {
	  //Creamos nuestras variables
	  float base;
      float altura;
      float area;
	  //Creamos el Scanner
      Scanner sc = new Scanner(System.in);
      //Pedimos al usuario la base del triangulo
	  System.out.println("Introduzca la altura del triangulo: ");
	  //Leemos el numero del teclado
	  base = sc.nextInt();
      //Pedimos al usuario la base del triangulo
	  System.out.println("Introduzca la base del triangulo: ");
	  //Leemos el numero del teclado
	   altura = sc.nextInt();
       //Ponemos las operaciones matemáticas
	   area = base*altura/2;
	   //Ofrecemos al usuario el area del triangulo
	   System.out.print("El area del triangulo es: " + area );
	   //Cerramos el Scanner
	   sc.close();
	}
	 

}
