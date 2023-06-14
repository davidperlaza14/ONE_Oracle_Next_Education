package proyecto_bytebank;

public class TestMetodos {

	public static void main(String[] args) {
		
		Cuenta2 miCuenta = new Cuenta2();
		miCuenta.deposita(1000);
		System.out.println(miCuenta.saldo);
//		miCuenta.saca(200);
		

		
		Cuenta2 cuentaIvan = new Cuenta2();
		cuentaIvan.deposita(1000);
		System.out.println(cuentaIvan.saldo);
		cuentaIvan.saca(200);
		cuentaIvan.transferire(300, miCuenta);
		System.out.println(cuentaIvan.saldo);
		
		
		
		

	}

}
