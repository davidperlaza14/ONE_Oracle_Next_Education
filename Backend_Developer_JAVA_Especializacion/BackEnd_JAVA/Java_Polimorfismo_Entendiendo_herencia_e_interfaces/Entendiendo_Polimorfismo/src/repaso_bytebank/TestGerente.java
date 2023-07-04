package repaso_bytebank;

public class TestGerente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNombre("Cindy");
		g1.setDocumentoIdentidad("1234567899");
		g1.setSalario(4000);
		
		g1.setContraseña(12345);
		boolean autentico = g1.autenticar(12345);
		
		System.out.println(g1.autenticar(12345));
		System.out.println(g1.getNombre());
		System.out.println(g1.getDocumentoIdentidad());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacion());
		
		
	}
}
