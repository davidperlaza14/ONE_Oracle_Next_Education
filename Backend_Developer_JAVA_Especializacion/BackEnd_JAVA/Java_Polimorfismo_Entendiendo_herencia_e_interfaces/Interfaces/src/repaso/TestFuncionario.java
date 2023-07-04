package repaso;

public class TestFuncionario {
	
	public static void main(String[] args) {
		Funcionario david = new Contador();
		david.setNombre("David Stiven");
		david.setDocumento("123456");
		david.setSalario(2000);
		david.setTipo(0);
		
		System.out.println(david.getNombre());
		System.out.println(david.getSalario());
		System.out.println(david.getBonificacion());
	}
	

}
