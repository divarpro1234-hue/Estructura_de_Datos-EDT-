
public class Principal {

	public static void main(String[] args) {
	
		PilaOso pardo = new PilaOso();
		Oso r1 = new Oso("bambu", 60);
		Oso r2 = new Oso("bambu", 60);
		Oso r3 = new Oso("bambu", 60);
		Oso r4 = new Oso("bambu", 60);
			
		pardo.adi(r1);
		pardo.adi(r2);
		pardo.adi(r3);
		pardo.adi(r4);
		
		PilaOso panda = new PilaOso();
		panda.adi(new Oso("lechuga", 30));
		panda.adi(new Oso("lechuga", 30));
		panda.adi(new Oso("lechuga", 30));
		panda.adi(new Oso("lechuga", 30));
		
		PilaOso polar = new PilaOso();
		polar.adi(new Oso("platano", 20));
		polar.adi(new Oso("platano", 20));
		polar.adi(new Oso("platano", 20));
		polar.adi(new Oso("pollo", 20));
		
	
		pardo.mostrar();
		panda.mostrar();
		polar.mostrar();
		
		System.out.println("\na) Determinar cuál de los tres osos tiene la mayor "
				+ "cantidad total de comida acumulada.");
		mayorCantidadComida(pardo, panda, polar);
		
		System.out.println("b) Verificar si un alimento X se encuentra en la "
				+ "pila de alguno de los osos.");
		
		String alix = "pollo";
		if(verificarAlimentoEncuetra(pardo, panda, polar, alix)){
			System.out.println("el alimento se encuentra en alguna pila de los osos");
		}else
			System.out.println("el alimento no se encuetra en alguna pila de osos");

	}

	private static boolean verificarAlimentoEncuetra(PilaOso pardo, PilaOso panda, PilaOso polar, String alix) {
		// TODO Auto-generated method stub
		PilaOso aux = new PilaOso();
		while(!pardo.esVacia()) {
			Oso x = pardo.eli();
			if(x.getNomAlimento().equalsIgnoreCase(alix)) {
				return true;
			}
			aux.adi(x);
		}
		pardo.vaciar(aux);
		
		while(!panda.esVacia()) {
			Oso x = panda.eli();
			if(x.getNomAlimento().equalsIgnoreCase(alix)) {
				return true;
			}
			aux.adi(x);
		}
		panda.vaciar(aux);
		
		while(!polar.esVacia()) {
			Oso x = polar.eli();
			if(x.getNomAlimento().equalsIgnoreCase(alix)) {
				return true;
			}
			aux.adi(x);
		}
		polar.vaciar(aux);
		return false;
		
	}

	private static void mayorCantidadComida(PilaOso pardo, PilaOso panda, PilaOso polar) {
		// TODO Auto-generated method stub
		PilaOso aux = new PilaOso();
		int may = 0;
		int suma1 = 0;
		int suma2 = 0;
		int suma3 = 0;
		while(!pardo.esVacia()) {
			Oso x = pardo.eli();
			suma1 = suma1 + x.getCantidad();
			aux.adi(x);
		}
		if(suma1 >= may)
			may = suma1;
		pardo.vaciar(aux);
		while(!panda.esVacia()) {
			Oso z = panda.eli();
			suma2 = suma2 + z.getCantidad();
			aux.adi(z);
		}
		if(suma2 >= may)
			may = suma2;
		panda.vaciar(aux);
		while(!polar.esVacia()) {
			Oso w = polar.eli();
			suma3 = suma3 + w.getCantidad();
			aux.adi(w);
		}
		polar.vaciar(aux);
		if(suma3 >= may)
			may = suma3;
		
		System.out.println("la cantidad mayor es: " + may);
	}
}
