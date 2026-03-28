//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche ch1 = new Coche("ae86", "toyota", "blanco", "005PLF");
		Coche ch2 = new Coche("ae86", "toyota", "azul", "123LLF");
		Coche ch3 = new Coche("ae86", "toyota", "negro", "987ACD");
		
		Conductor c1 = new Conductor("123456", "lucas", 20, "A");
		Conductor c2 = new Conductor("654321", "carlos", 22, "C");
		Conductor c3 = new Conductor("987654", "juan", 23, "P");
		
		Ruta r1 = new Ruta("sopocachi", "prado", 10);
		Ruta r2 = new Ruta("prado", "cotacota", 20);
		Ruta r3 = new Ruta("calacoto", "prado", 15);
		
		LS_CircularP lp1 = new LS_CircularP();
		lp1.adiFinal(new Pasajero("100235", "pedro", 18, "masculino", "64471222"));
		lp1.adiFinal(new Pasajero("101233", "maria", 18, "femenino", "64887222"));
		lp1.adiFinal(new Pasajero("100169", "luis", 19, "masculino", "70471222"));
		
		LS_NormalH lh1 = new LS_NormalH();
		lh1.adiFinal(new Horario("lunes", "12:00"));
		lh1.adiFinal(new Horario("miercoles", "12:00"));
		lh1.adiFinal(new Horario("viernes", "12:00"));
		
		LD_NormalT A = new LD_NormalT();
		A.adiFinal(new Trufi(ch3, c3, r3, lp1, lh1));
		
		A.mostrar();
	}


}













