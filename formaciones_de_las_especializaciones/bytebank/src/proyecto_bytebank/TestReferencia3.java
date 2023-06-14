package proyecto_bytebank;

public class TestReferencia3 {

	public static void main(String[] args) {
		Cuenta cuentaDeIvan = new Cuenta();
		cuentaDeIvan.titular = new Cliente();
		cuentaDeIvan.titular.nombre = "Ivan Andres";
		
		System.out.println(cuentaDeIvan.titular.nombre);
	}
}
