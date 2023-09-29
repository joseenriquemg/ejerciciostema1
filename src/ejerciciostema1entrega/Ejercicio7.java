package ejerciciostema1entrega;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		 //Creamos nuestras variables
		 float centimetros;
		 float milimetros;
		 float metros;
		 float suma;
		 //Abrimos el Scanner
		 Scanner sc = new Scanner(System.in);
		 //Pedimos al usuario la primera medida en milimetros
		 System.out.println("Introduzca la primera medida en milimetros: ");
		 //Leemos la medida del teclado
		 milimetros = sc.nextFloat();
		 //Pedimos al usuario la primera medida en centimetros
		 System.out.println("Introduzca la primera medida en centimetros: ");
		 //Leemos la medida del teclado
		 centimetros = sc.nextFloat();
		 //Pedimos al usuario la primera medida en metros
		 System.out.println("Introduzca la primera medida en metros: ");
		 //Leemos la medida del teclado
		 metros = sc.nextFloat();
		 //Ponemos las ecuaciones matematicas
		 suma = metros / 100 + centimetros + milimetros * 10;
		 //Ofrecemos al usuario el resultado
		 System.out.println("La suma de sus medidas se corresponde con: " + suma + " centimetros");
		 //cerramos el Scanner
		 sc.close();
		 
		 
		 
		 
		 
	}

}
