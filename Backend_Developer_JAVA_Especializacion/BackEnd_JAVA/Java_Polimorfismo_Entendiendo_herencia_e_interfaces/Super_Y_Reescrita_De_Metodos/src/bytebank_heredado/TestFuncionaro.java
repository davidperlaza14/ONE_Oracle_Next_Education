package bytebank_heredado;

public class TestFuncionaro {
	
	public static void main(String[] args) {
		Funcionario david = new Funcionario();
		david.setNombre("David");
		david.setDocumento("123456789");
		david.setSalario(2000);
		david.setTipo(0);
		
		System.out.println(david.getSalario());
		System.out.println(david.getBonificacion());
	}

}
