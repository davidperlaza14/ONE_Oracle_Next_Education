package ejercicos;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario ivan = new Funcionario();
		ivan.setNombre("Ivan Andres");
		ivan.setDocumentoIdentidad("123456789");
		ivan.setSalario(2000);
		
		System.out.println(ivan.getNombre());
		System.out.println(ivan.getSalario());
		System.out.println(ivan.getBonificacion());
			
	}
}
