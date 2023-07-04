package bytebank_heredado;

public class TestControlBonificacion {
	
	public static void main(String[] args) {
		Funcionario david = new Funcionario();
		david.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador carlos = new Contador();
		carlos.setSalario(5000);
		
		
		
		ControlBonificacion controlBonificacion = 
				new ControlBonificacion();
		
		controlBonificacion.registarSalario(david);
		controlBonificacion.registarSalario(jimena);
		controlBonificacion.registarSalario(carlos);
		

		
	}

}
