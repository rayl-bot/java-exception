package exercice2;

public class MyException extends Exception {
	
	/***
	 * Constructor por defecto
	 */
	public MyException() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public String getMessage() {
		
		return "Esto es un objeto Exception";
	}
}
