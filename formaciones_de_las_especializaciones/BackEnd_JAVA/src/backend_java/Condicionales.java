package backend_java;

public class Condicionales {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int edad = 11;
		int cantidad = 2;
		
		if (edad >= 18) {
			System.out.println("Usted puede entrar");
		} else {
			if (cantidad >= 1) {
				System.out.println("Usted es menor de " + "edad, pero tiene permitido su ingreso");
			}else {
				System.out.println("Usted no puede entrar");
			}
		} 

	}

}
