package ejercicos;

public class Gerente extends Funcionario{
	
	private int clave;
	

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}
	
	public boolean autenticar(int clave) {
		if (this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}
	
}
