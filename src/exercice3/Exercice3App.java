package exercice3;

public class Exercice3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Generando numero aleatorio...");
			int valorDado = (int) Math.floor(Math.random() * 1000 + 1);
			throw new MyException(valorDado);// lanzamos la excepcion con parametro
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println("El numero aleatorio generado es: "+e.getMessage());
			System.out.println(e.esParInpar());
		}
	}

}
