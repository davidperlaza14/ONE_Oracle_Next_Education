package repaso_excepciones;

public class FlujoConTratamiento {

	public static void main(String[] args) {
	    System.out.println("Inicio de main");
	    metodo1();
	    System.out.println("Fin del main");
	  }
	  public static void metodo1(){
	    System.out.println("Inicio de metodo1");
	    metodo2();
	    System.out.println("Fin de metodo1");
	  }
	  public static void metodo2(){
	    System.out.println("Inicio de metodo2");
//	    ArithmeticException exception = new ArithmeticException();
	    throw new ArithmeticException("Surgio un error");
//	    System.out.println("Fin de metodo2");
	  }

}
