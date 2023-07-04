package creando_anotaciones_en_Java;

import java.time.Period;

public class Usuario {
	
	private String nombre;
	private String identidad;
	@EdadMinima(valor =18)
	private LocalDate fechaNacimiento;
	
	
	
	public Usuario(String string, String string2, Object of) {
		// TODO Auto-generated constructor stub
	}



	public static boolean validador(Usuario usuario) {
		return false;
	}
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getIdentidad() {
		return identidad;
	}
	
	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

//	public boolean usuarioValido(Usuario usuario) {
//		if (usuario.getNombre().matches("[a-zA-Záàâãéèêíïóôõöúçñ\\s]+")) {
//			return false;
//		}
//		if(!usuario.getIdentidad().matches("[^0-9]+")) {
//			return false;
//		}
//		return Period.between(usuario.getFechaNacimiento(), LocalDate.now()).getYears() >= 18; 
		
//	}

}
