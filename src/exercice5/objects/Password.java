package exercice5.objects;

import java.util.Iterator;

public class Password {
	public static String NUMEROS = "0123456789";
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
	public static String ESPECIALES = "Ò—";
	private int length;
	private String password;
	

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 */
	public Password() {
		super();
		this.length = 10;
		generatePassword(length);
	}

	/**
	 * @param length
	 * @param passwowrd
	 */
	public Password(int length) {
		super();
		this.length = length;
		generatePassword(length);
	}

	public void generatePassword(int length) {
		this.password = "";
		String key = NUMEROS+MAYUSCULAS+MINUSCULAS+ESPECIALES;
		
		for (int i = 0; i < length; i++) {
			this.password+=(key.charAt((int)(Math.random() * key.length())));
		}
	}
	
	public boolean esFuerte() {
		int contMay = 0;
		int contMin = 0;
		int contInt = 0;
		System.out.println(password.length());
		for (int i = 0; i < this.password.length(); i++) {
			if(Character.isUpperCase(i))
				contMay++;
			else if(Character.isLowerCase(i))
				contMin++;
			else if(Character.isDigit(i))
				contInt++;
		}
		
		if(contMay > 2 && contMin > 1 && contInt > 5)
			return true;
		else
			return false;
	}
}
