package com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;


public class TestOrdenarList {
	
	public static void main(String[] args) {
		
		Cuenta cc1  = new CuentaCorriente(22,33);
		cc1.deposita(333.0);
		
		Cuenta cc2  = new CuentaCorriente(22,44);
		cc1.deposita(444.0);
		
		Cuenta cc3  = new CuentaCorriente(22,11);
		cc1.deposita(111.0);
		
		Cuenta cc4  = new CuentaCorriente(22,22);
		cc1.deposita(222.0);
		
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Antes de ordenar.");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);
		
		System.out.println("Despues de ordenar.");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		
	}
	

}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		if (o1.getNumero() == o2.getNumero()) {
			return 0;
		} else if (o1.getNumero() >= o2.getNumero()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
