package constructor;

public class Cuenta2 {	
	private int agencia;
	private int numero;
	private double saldo;
	
	private static int total = 0;
	
	
	public Cuenta2(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100; // esto significa que cada cuenta comienza con un saldo de 100.
		total ++;
		System.out.println("creando una cuenta");
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
