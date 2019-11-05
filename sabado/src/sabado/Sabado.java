package sabado;

import java.util.Scanner;

public class Sabado {
	//private int valor
	private int valor1;
	private int valor2;
	
	public static void main(String[] args) {
	//main  = control + espacio
	Scanner ingreso = new Scanner(System.in);// con crear un solo objeto alcanza y se usa el nombre del objeto todas las veces que se necesite
	System.out.println("Ingrese un valor:");
	int valor1 = ingreso.nextInt();
	System.out.println("Ingrese otro valor");
	int valor2 = ingreso.nextInt();
	int resultado = valor1 + valor2;
	System.out.println("El resultado es " + resultado);
	ingreso.close(); //cierra el objeto
			
	/** Suma de dos valores ingresados por el usuario */
	//constructor tiene un metodo con el mismo nombre que la clase
	//buscar que es un constructor, devuelve un objeto de esa clase, que puede hacer un proceso dentro
			
		}

}
