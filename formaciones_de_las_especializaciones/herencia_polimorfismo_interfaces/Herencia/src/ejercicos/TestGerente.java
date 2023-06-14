package ejercicos;

public class TestGerente {
	
	public static void main(String[] args) {
		Gerente david = new Gerente();
		david.setNombre("David Stiven");
		david.setDocumentoIdentidad("1234567890");
		david.setSalario(5000);
		
		System.out.println(david.getNombre());
		System.out.println(david.getDocumentoIdentidad());
		System.out.println(david.getSalario());
		
		david.setClave(123456);
		boolean autenticar = david.autenticar(12456);
		
		System.out.println(autenticar);
	}

}
