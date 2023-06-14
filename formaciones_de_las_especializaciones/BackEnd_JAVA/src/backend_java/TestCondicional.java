package backend_java;

public class TestCondicional {

	public static void main(String[] args) {
		System.out.println("Probando condicionales");

		int edad = 10;
		int cantidad = 1;

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
			System.out.println("Bienvenido");
		} else {
            if (cantidad >= 2) {
                System.out.println("No tienes 18 años, pero puedes ingresar, porque estás acompañado");
            } else {
                System.out.println("Lamentablemente no puedes ingresar");
            }
        }
	}
}
