package backend_java;

public class TestDescuento {
	
	/**
	 * Si el valor de la compra está entre $100.0 y $199.99, el descuento es del 10%.
	 * Si el valor de la compra está entre $200.0 y $299.99, el descuento es del 15%.
	 * Para compras superiores a $300.0, el descuento es del 20%.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		double valorCompra = 300.0;
		double descuento = 0.0;
		
		if (valorCompra >= 100 && valorCompra <= 199.99) {
			descuento = 10.0;
		} 
		else if (valorCompra >= 200.0 && valorCompra <= 299.99) {
			descuento = 15.0;
		}
		else if (valorCompra >= 300) {
			descuento = 20.0;
		}
		
		double valorFinal = valorCompra - ((valorCompra * descuento) / 100);
		
		System.out.println("Valor de la compra: $" + valorCompra);
		System.out.println("Descuento: " + descuento + "%");
		System.out.println("Valor final: $" + valorFinal);
		
	}

}
