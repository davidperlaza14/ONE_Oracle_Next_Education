package bytebank_heredado;

public class ControlBonificacion {
	private double suma;
	
	public double registarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	
	public double registarSalario(Gerente gerente) {
		this.suma = gerente.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}


}
