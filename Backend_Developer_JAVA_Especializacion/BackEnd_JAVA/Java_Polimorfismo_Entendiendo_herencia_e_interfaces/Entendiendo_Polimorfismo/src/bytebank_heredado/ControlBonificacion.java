package bytebank_heredado;

public class ControlBonificacion {
	private double suma;
	
	// Polimorfismo, ejecuta sin error porque las demas clases son hijas de la clase funcionario
	public double registarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}

}
