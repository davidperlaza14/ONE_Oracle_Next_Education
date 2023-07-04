package repaso;

public class Cliente implements Autenticacion {
	
	private String nombre;
    private String documento;
    private String telefono;
    
    private AutenticacionUtil autenticador;

    public Cliente() {
        this.autenticador = new AutenticacionUtil();
    }

    public void setContraseña(int contraseña) {
        this.autenticador.setContraseña(contraseña);
    }

    public boolean autenticar(int contraseña) {
        return this.autenticador.autenticar(contraseña);
    }
    
}