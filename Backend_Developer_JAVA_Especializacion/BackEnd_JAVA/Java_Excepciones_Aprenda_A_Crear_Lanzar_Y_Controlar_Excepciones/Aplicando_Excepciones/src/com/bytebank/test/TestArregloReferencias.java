package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
	
	public static void main(String[] args) {
		
		Cuenta[] cuentas = new Cuenta[5];
        CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        cuentas[0] = cc1;
        
        
        CuentaAhorros ca2 = new CuentaAhorros(22,22);
        cuentas[1] = ca2;
        
        System.out.println(cuentas[1].getNumero());

        CuentaCorriente cc2 = new CuentaCorriente(22, 22);
        cuentas[1] = cc2;    

        System.out.println( cuentas[1].getNumero()  );

        
        CuentaCorriente ref = (CuentaCorriente)cuentas[1];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
	}
	

}
