public class Principal {

	public static void main(String[] args) {	
		PilaPasajero a = new PilaPasajero();
		Pasajero a1 = new Pasajero("Jhamil", 15, "estudiante");
		Pasajero a2 = new Pasajero("Divar", 15, "turista");
		Pasajero a3 = new Pasajero("carlos", 15, "estudiante");
		
		a.adi(a1);
		a.adi(a2);
		a.adi(a3);
		
		PilaPasajero b = new PilaPasajero();
		Pasajero b1 = new Pasajero("pepe", 15, "estudiante");
		Pasajero b2 = new Pasajero("pedro", 15, "turista");
		Pasajero b3 = new Pasajero("luis", 15, "estudiante");
		
		b.adi(b1);
		b.adi(b2);
		b.adi(b3);
		
		PilaPasajero c = new PilaPasajero();
		Pasajero c1 = new Pasajero("Jhamil", 15, "estudiante");
		Pasajero c2 = new Pasajero("Divar", 15, "turista");
		Pasajero c3 = new Pasajero("carlos", 15, "estudiante");
		
		c.adi(c1);
		c.adi(c2);
		c.adi(c3);
		
		PilaPasajero d = new PilaPasajero();
		
		Pasajero d1 = new Pasajero("pepe", 15, "estudiante");
		Pasajero d2 = new Pasajero("pedro", 15, "turista");
		Pasajero d3 = new Pasajero("luis", 15, "estudiante");
		
		d.adi(d1);
		d.adi(d2);
		d.adi(d3);
		PilaPasajero e = new PilaPasajero();
		
		Pasajero e1 = new Pasajero("Jhamil", 15, "estudiante");
		Pasajero e2 = new Pasajero("Divar", 15, "turista");
		Pasajero e3 = new Pasajero("carlos", 15, "estudiante");
		
		e.adi(e1);
		e.adi(e2);
		e.adi(e3);
		
		PilaPasajero f = new PilaPasajero();
		Pasajero f1 = new Pasajero("pepe", 15, "estudiante");
		Pasajero f2 = new Pasajero("pedro", 15, "turista");
		Pasajero f3 = new Pasajero("luis", 15, "estudiante");
		
		f.adi(f1);
		f.adi(f2);
		f.adi(f3);
		
		PilaPasajero g = new PilaPasajero();
		Pasajero g1 = new Pasajero("Jhamil", 15, "estudiante");
		Pasajero g2 = new Pasajero("Divar", 15, "turista");
		Pasajero g3 = new Pasajero("carlos", 15, "estudiante");
		
		g.adi(g1);
		g.adi(g2);
		g.adi(g3);
		
		PilaPasajero h = new PilaPasajero();
		Pasajero h1 = new Pasajero("pepe", 15, "estudiante");
		Pasajero h2 = new Pasajero("pedro", 15, "turista");
		Pasajero h3 = new Pasajero("luis", 15, "estudiante");
		
		h.adi(h1);
		h.adi(h2);
		h.adi(h3);
		
		//pila bus
		PilaBus x = new PilaBus();
		
		Bus x1 = new Bus("asd113","rojo", a, "moises","irpavi");
		Bus x2 = new Bus("zxc123","verde", b, "daniel","calacoto");
		Bus x3 = new Bus("vbn143","blanco", c, "edwin","cotacota");
		Bus x4 = new Bus("qwe223","rojo", d, "ricardo","calatayud");
	
		x.adi(x1);
		x.adi(x2);
		x.adi(x3);
		x.adi(x4);
		
		PilaBus y = new PilaBus();
		Bus y1 = new Bus("ipo183","cafe", e, "elvis","san pedro");
		Bus y2 = new Bus("uio523","rosa", f, "elias","san miguel");
		Bus y3 = new Bus("yui123","negro", g, "leonardo","6 de agosto");
		Bus y4 = new Bus("rty193","celeste", h, "adrian","20 de octubre");
		
		y.adi(y1);
		y.adi(y2);
		y.adi(y3);
		y.adi(y4);
		
		Mp_PilaBus mp_pilabus = new Mp_PilaBus(2);
		System.out.println("\tMultipila de objetos bus:");
		mp_pilabus.vaciar(0, x);
		mp_pilabus.vaciar(1, y);
		mp_pilabus.mostrar();
		
		//a)
		String tipox= "estudiante";
		System.out.println("\t\nmostrar buses que transportaron pasajero del tipo "+ tipox);
		mostrarPasajerosTipo(mp_pilabus, tipox);
				
		//b)
		String colorx = "rojo";
		System.out.println("\t\nDE LOS BUSES COLOX ORDENAR ASCENDENTEMENTE POR LA EDAD");
		ordenarPasajerosBusColor(mp_pilabus, colorx);
		mp_pilabus.mostrar();
		
	}
	static void ordenarPasajerosBusColor(Mp_PilaBus mp, String colorx) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mp.getN(); i++) {
			PilaBus auxbus = new PilaBus();
			while(!mp.esVacia(i)) {
				Bus x = mp.eliminar(i);
				auxbus.adi(x);
				if(x.getcolor().equals(colorx)){
					PilaPasajero pas = x.getPj();
					pas = ordenarAscPasEdad(pas);
					x.setPj(pas);
				}	
			}
			mp.vaciar(i, auxbus);
		}
	}
	static PilaPasajero ordenarAscPasEdad(PilaPasajero pp) {
		// TODO Auto-generated method stub
		PilaPasajero aux1 = new PilaPasajero();
		PilaPasajero aux2 = new PilaPasajero();
		while(!pp.esVacia()) {
			int edadMayor = buscarPasajeroEdadMayor(pp);
			while(!pp.esVacia()) {
				Pasajero px = pp.eli();
				if(px.getEdad()==edadMayor)
					aux1.adi(px);
				else
					aux2.adi(px);
			}
			pp.vaciar(aux2);
		}
		pp.vaciar(aux1);
		return pp;
	}
	static int buscarPasajeroEdadMayor(PilaPasajero pp) {
		// TODO Auto-generated method stub
		int mayor=0;
		PilaPasajero aux = new PilaPasajero();
		int nroPasajero = pp.nroElem();
		for (int i = 1; i < nroPasajero; i++) {
			Pasajero x = pp.eli();
			aux.adi(x);
			if(x.getEdad()==mayor)
				mayor = x.getEdad();
			
		}
		pp.vaciar(aux);
		return mayor;
	}
	static void mostrarPasajerosTipo(Mp_PilaBus mp, String tipox) {
		 //TODO Auto-generated method 
		for (int i = 0; i < mp.getN(); i++) {
			PilaBus auxbus = new PilaBus();
			while(!mp.esVacia(i)) {
				Bus x = mp.eliminar(i);
				PilaPasajero pas = x.getPj();
				if(buscarPasajeroTipo(pas,tipox))
					x.mostrar();
				auxbus.adi(x);
			}
			mp.vaciar(i, auxbus);
		}
	}
	static boolean buscarPasajeroTipo(PilaPasajero z, String tipox) {
		// TODO Auto-generated method stub
		PilaPasajero aux = new PilaPasajero();
		boolean sw = false;
		while(!z.esVacia()) {
			Pasajero x = z.eli();
			if(x.getTipo()==tipox) {
				sw=true;
				break;
			}
		}
		z.vaciar(aux);
		return sw;
	}

}
