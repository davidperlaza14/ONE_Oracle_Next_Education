package java_stack;

public class TestConexion {
	
	public static void main(String[] args) throws Exception {
		try(Conexion con = new Conexion()){
			con.leerDatos();			
		} catch (IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		/*
		Conexion con = null;
		try {
			 con = new Conexion();
			con.leerDatos();
			
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo exception");
			ex.printStackTrace();
		} finally {
			System.out.println("Ejecutando Finally");
			if (con != null) {
				con.cerrar();
			}
		}
		*/
		
	}

}
