package exercice2;

public class Exercice2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inicializamos el try catch para que encapsule el error
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new MyException();// lanzamos la excepcion
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println("Excepcion capturada con mensaje: " + e.getMessage());// mostramos el mensaje
		} finally {
			System.out.println("Programa terminado");
		}
	}

}
