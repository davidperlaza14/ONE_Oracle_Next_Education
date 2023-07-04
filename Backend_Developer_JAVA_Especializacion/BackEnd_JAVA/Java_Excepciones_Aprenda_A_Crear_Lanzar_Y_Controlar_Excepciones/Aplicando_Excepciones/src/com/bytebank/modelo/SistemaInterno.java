package com.bytebank.modelo;

public class SistemaInterno {
	
	private String clave = "123456";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeInisiarSesion = gerente.iniciarSesion(clave);
		if (puedeInisiarSesion) {
			System.out.println("Login exitoso");
			return true;
			
		} else {
			System.out.println("Error login");
			return false;
		}
	}

}
