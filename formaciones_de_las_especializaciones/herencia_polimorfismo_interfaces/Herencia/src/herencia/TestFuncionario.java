package herencia;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario david = new Funcionario();
		david.setNombre("David Stiven");
		david.setDocumento("123456789");
		david.setSalario(2000);
		
		System.out.println(david.getSalario());
		System.out.println(david.getBonificacion());
	}
}
