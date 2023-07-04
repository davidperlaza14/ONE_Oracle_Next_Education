package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;

import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		
//		List<Cliente> listaClientes = new LinkedList();
		List<Cuenta> lista = new ArrayList<Cuenta>();

	    Cuenta cc1 = new CuentaCorriente(22, 22);
	    Cuenta cc2 = new CuentaCorriente(22, 22);

	    lista.add(cc1);

	    boolean existe = lista.contains(cc2); //nuevo

	    System.out.println("Ya existe? " + existe);

	    for(Cuenta cuenta : lista){
	        System.out.println(cuenta);
	    }
		
	}

}
