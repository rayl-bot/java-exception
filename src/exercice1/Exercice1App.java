package exercice1;

import java.util.*;

public class Exercice1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaramos un scanner para introducir valores por teclado
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		// Hacemos un try catch para encapsular la exception
		try {
			int valorDado = (int) Math.floor(Math.random() * 501 + 1);
			int num;
			do {
				// bucle que ira preguntando un numero hasta que coincida, sumara el numero de
				// intentos
				System.out.println("Introduce un numero para ver si coincide: ");
				num = sc.nextInt();
				cont++;
			} while (num != valorDado);
			System.out.println("Enhorabuena has acertado con " + cont + " intentos!!!");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			// en caso de no introducir un entero positivo saltara la exception y acabara el
			// programa con estos mensajes
			cont++;
			System.out.println("Debes de introducir un numero entero positivo.");
			System.out.println("Intentos: " + cont);
		}

	}

}
