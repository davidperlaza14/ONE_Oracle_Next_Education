package bytebank_heredado;

public class TestGerente {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
//		gerente.setSalario(5000);
//		Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("123456");
		gerente.setNombre("Ivan");
		gerente.setTipo(1);
		
		System.out.println(gerente.getNombre());
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("123456"));
	}

}
