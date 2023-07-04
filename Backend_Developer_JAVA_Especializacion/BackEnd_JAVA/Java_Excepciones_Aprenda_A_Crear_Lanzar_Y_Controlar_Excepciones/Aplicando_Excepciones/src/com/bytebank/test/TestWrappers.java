package com.bytebank.test;

public class TestWrappers {

	public static void main(String[] args) {

		Double numeroDoble = 33.0; // autoboxing
		Boolean verdadero = true; // autoboxing
		
		Double numeroDoble2 = Double.valueOf(33);
		System.out.println(numeroDoble2);
		
		String numeroToString= "43";
		
		Double stringToDouble = Double.valueOf(numeroToString);
		Integer stringToInteger = Integer.valueOf(numeroToString);
		
		System.out.println(stringToDouble);
		System.out.println(stringToInteger);
		 
		Number numero = Integer.valueOf(5);
		
		double numeroDoublePrimitivo = numero.doubleValue();
		
		Boolean falso = Boolean.FALSE;
	}

}
