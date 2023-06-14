package backend_java;

public class condicionales2 {

	public static void main(String[] args) {
		System.out.println("Probando condicionales");

		int edad = 23;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;

		if (edad >= 18 && esPareja) {
			System.out.println("Puede usted entrar");
			System.out.println("Bienvenido");
		} else {

			System.out.println("Lamentablemente no puedes ingresar");
		}
	}
}
