package stack_java;
public class Flujo {
	
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
	    throw new ArithmeticException();
//	    System.out.println("Fin de metodo2");
	  }

}
