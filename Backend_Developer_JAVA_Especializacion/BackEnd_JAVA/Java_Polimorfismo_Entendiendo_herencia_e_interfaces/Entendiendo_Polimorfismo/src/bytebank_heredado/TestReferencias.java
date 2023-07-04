package bytebank_heredado;

public class TestReferencias {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Stiven");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("jsjsjsj");
	}

}
