package bytebank_heredado;

public class Gerente extends Funcionario {	
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "123456";
	}

}
