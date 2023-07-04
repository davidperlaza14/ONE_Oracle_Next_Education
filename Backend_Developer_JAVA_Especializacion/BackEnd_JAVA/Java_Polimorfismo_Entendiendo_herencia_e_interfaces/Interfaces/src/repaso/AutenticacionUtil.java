package repaso;

public class AutenticacionUtil {
	
	private int contraseña;
	
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
	
	public boolean autenticar(int contraseña) {
		if (this.contraseña == contraseña) {
			return true;
		} else {
			return false;
		}
	}

	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
