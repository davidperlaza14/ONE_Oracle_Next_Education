package java_stack;

public class TestCuentaExceptionChecked {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.depositar();
		} catch (MiException ex) {
			ex.printStackTrace();
		}
	}

}
