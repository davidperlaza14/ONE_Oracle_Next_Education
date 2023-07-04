package repaso_bytebank;

public class TestFuncionario {
	
	public static void main(String[] args) {
		Funcionario stiven = new Funcionario();
		stiven.setNombre("Stiven");
		stiven.setDocumentoIdentidad("123456");
		stiven.setSalario(3000);
		
		System.out.println(stiven.getNombre());
		System.out.println(stiven.getDocumentoIdentidad());
		System.out.println(stiven.getSalario());
		System.out.println(stiven.getBonificacion());
		
	}

}
