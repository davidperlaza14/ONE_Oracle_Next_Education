package stack_java;
public class Flujo {
	
	public static void main(String[] args) {
	    System.out.println("Inicio de main");
	    try	{
	    	metodo1();
	    } catch (ArithmeticException | NullPointerException ex) {
	    	String msg = ex.getMessage();
	    	System.out.println("ArithmeticException" + msg);
	    	ex.printStackTrace();
		}
	    System.out.println("Fin del main");
	  }
	  public static void metodo1(){
	    System.out.println("Inicio de metodo1");
	    metodo2();
	    System.out.println("Fin de metodo1");
	  }
	  public static void metodo2(){
	    System.out.println("Inicio de metodo2");
	    for(int i =1; i<= 5; i++){
	      System.out.println(i);
	      Cuenta c = null;
	      c.depositar();
//	      int a  = i / 0;
//	      try { // Intenta esto
////	    	  int num = i;
////		      int reultado = num / 0;
////		      System.out.println(reultado);
//	    	  String test = null;
//	    	  System.out.println(test.toString());
//		      
//	      } catch (ArithmeticException | NullPointerException exception) {	// Atrapa el error
//	    	  System.out.println("Atrapo Exception");
//	    	  System.out.println(exception.getMessage());
//	    	  exception.printStackTrace();
//		}
	    }
	    System.out.println("Fin de metodo2");
	  }

}
