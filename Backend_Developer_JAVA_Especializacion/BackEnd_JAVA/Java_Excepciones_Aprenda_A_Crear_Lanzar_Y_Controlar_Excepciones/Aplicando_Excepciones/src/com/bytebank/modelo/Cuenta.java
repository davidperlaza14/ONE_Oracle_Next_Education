package com.bytebank.modelo;

public abstract class Cuenta {
	
	protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;
    
    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }
    
    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
    	if (this.saldo < valor) {
			throw new SaldoInsuficienteException("No tiene saldo");
			
		}
         this.saldo -= valor;
       
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            try {
				this.saca(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
    public boolean esIgual(Cuenta otra) {
    	if(this.agencia != otra.agencia) {
    		return false;
    	}
    	if(this.numero != otra.numero) {
    		return false;
    	}
		return false;
    }
    
    public String toString() {
    	String cuenta = "Numero: " + this.numero + ", Agencia:" + this.agencia;
    	return cuenta;
    }

}
