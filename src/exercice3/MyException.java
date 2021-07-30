package exercice3;

public class MyException extends Exception {
	int code;

	/***
	 * Constructor por defecto
	 */
	public MyException() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @param code
	 */
	public MyException(int code) {
		super();
		this.code = code;
	}

	// metodo publico que muestra el numero el numero que introducimos anteriormente
	public String getMessage() {

		return "" + this.code;
	}

	public String esParInpar() {
		if (this.code % 2 == 0)
			return "Es par";
		else
			return "Es inpar";
	}
}
