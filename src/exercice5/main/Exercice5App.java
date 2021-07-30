package exercice5.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import exercice5.objects.Password;

public class Exercice5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduce la longitud de las arrays: ");
			int length = sc.nextInt();
			Password[] passws = new Password[length];
			Boolean[] bools = new Boolean[length];
			
			for (int i = 0; i < length; i++) {
				System.out.println("Introduce la longitud del password "+(i+1));
				passws[i] = new Password(sc.nextInt());
				bools[i] = passws[i].esFuerte();
				System.out.println("Password: "+passws[i].getPassword()+" fuerte: "+bools[i]);
			}
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("No has introducido un numero entero positivo.");
		}
		
	}

}
