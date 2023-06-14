package proyecto_bytebank;

public class Cuenta2 {

	double saldo;
	int agencia;
    int numero;
    String titular;
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferire (double valor, Cuenta2 cuenta2) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta2.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
}
