package com.bytebank.test;
import com.bytebank.modelo.*;


public class TestReferencias {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("David");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		System.out.println(funcionario.getNombre());
		System.out.println(funcionario.getSalario());
		
		System.out.println(gerente.getNombre());
		System.out.println(gerente.getSalario());
		
	}

}
