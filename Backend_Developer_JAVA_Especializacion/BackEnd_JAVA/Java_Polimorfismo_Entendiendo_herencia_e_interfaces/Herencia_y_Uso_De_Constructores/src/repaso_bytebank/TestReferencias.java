package repaso_bytebank;

public class TestReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
        g1.setNombre("Marco");
        g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
//		ev.setNombre("Marcos");
		ev.setSalario(1000);
		
		
		Designer d = new Designer();
		d.setSalario(2000);
		
//		System.out.println(ev.getBonificacion());
//		System.out.println(d.getBonificacion());
		
		ControleBonificacion controle = new ControleBonificacion();
		controle.registarSalario(g1);
		controle.registarSalario(ev);
		controle.registarSalario(d);
		
		System.out.println();
		
	}
}
