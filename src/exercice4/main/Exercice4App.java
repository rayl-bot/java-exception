package exercice4.main;

import java.util.*;

import exercice4.object.Calculos;

public class Exercice4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduce el numero a: ");
			int a = sc.nextInt();
			System.out.println("Introduce el numero b: ");
			int b = sc.nextInt();
			Calculos calc = new Calculos(a, b);
			System.out.println("Suma: " + calc.getSuma());
			System.out.println("Resta: " + calc.getResta());
			System.out.println("Multiplicacion: " + calc.getMultiplicacion());
			System.out.println("Division: " + calc.getDivision());
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("No has introducido un numero entero positivo.");
		} catch (ArithmeticException a) {
			System.out.println("Error de calculo, prueba a introducir otros numeros");
		}
	}

}
