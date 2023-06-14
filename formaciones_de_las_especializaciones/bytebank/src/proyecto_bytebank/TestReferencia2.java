package proyecto_bytebank;

public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente david = new Cliente();
		david.nombre = "David";
		david.documento = "4545454545";
		david.telefono = "3212222222";
		
		Cuenta cuentaDeDavid = new Cuenta();
		cuentaDeDavid.agencia = 1;
		cuentaDeDavid.titular = david;
		
		System.out.println(cuentaDeDavid.titular.documento);
		
		
		
	}

}
