package com.bytebank.test;
import com.bytebank.modelo.*;
public class TestControlBonificacion {
	
	public static void main(String[] args) {
		com.bytebank.modelo.Funcionario diego = new com.bytebank.modelo.Contador();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador alexiz = new Contador();
		alexiz.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexiz);
		
	}

}
