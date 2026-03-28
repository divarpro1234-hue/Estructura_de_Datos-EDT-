package ColaSimpleJuguetes;

public class Principal {
	public static void main(String args[]) {
		ColaSimpleJuguete c1 = new ColaSimpleJuguete();
		Juguete j1 =new Juguete("El lotso", "peluche", 80, "Anita");
		Juguete j2 =new Juguete("Woody", "muñeco", 20, "Andy");
		Juguete j3 =new Juguete("Rex", "dinosaurio", 90, "Andy");
		Juguete j4 =new Juguete("Buzz Ligther", "muñeco", 1, "Andy");
		
		c1.adi(j2);
		c1.adi(j1);
		c1.adi(j3);
		c1.adi(j4);
		
		c1.mostrar();
		System.out.println("nro de juguetes: " + c1.nroElem());
		
		System.out.println("\nb) llevar los juguetes con mas de 50 de desgaste al final de la cola");
		llevarJugueteFinalCola(c1, 50);
		c1.mostrar();
		
		System.out.println("\nc) Ordenar la cola de juguetes segun su nivel de desgaste, de menor a mayor");
		ordenarMenorMayorDesgaste(c1);
		c1.mostrar();
		
		System.out.println("\nd) eliminar los juguetes con desgaste mayor a 80,excepto si son peluches");
		eliminarMayDesgaste(c1);
		c1.mostrar();
	}

	private static void eliminarMayDesgaste(ColaSimpleJuguete c1) {
		// TODO Auto-generated method stub
		ColaSimpleJuguete aux = new ColaSimpleJuguete();
		while(!c1.esVacia()) {
			Juguete x = c1.eli();
			if(x.getNivelDes() <= 80 || x.getTipo().equals("peluche")) {
				aux.adi(x);
			}
		}
		c1.vaciar(aux);
	}

	private static void ordenarMenorMayorDesgaste(ColaSimpleJuguete c1) {
		// TODO Auto-generated method stub
		ColaSimpleJuguete aux = new ColaSimpleJuguete();
		while(!c1.esVacia()) {
			int may = desgasteMay(c1);
			Juguete x = c1.eli();
			if(x.getNivelDes() == may) {
				aux.adi(x);
			}else {
				c1.adi(x);
			}
		}
		c1.vaciar(aux);
	}

	private static int desgasteMay(ColaSimpleJuguete c1) {
		// TODO Auto-generated method stub
		ColaSimpleJuguete aux = new ColaSimpleJuguete();
		int may = 1000;
		while(!c1.esVacia()) {
			Juguete x = c1.eli();
			if(x.getNivelDes() <= may) {
				may = x.getNivelDes();
			}
			aux.adi(x);
		}c1.vaciar(aux);
		return may;
	}

	static void llevarJugueteFinalCola(ColaSimpleJuguete c1, int num) {
		// TODO Auto-generated method stub
		ColaSimpleJuguete aux1 = new ColaSimpleJuguete();
		ColaSimpleJuguete aux2 = new ColaSimpleJuguete();
		while(!c1.esVacia()) {
			Juguete x = c1.eli();
			if(x.getNivelDes() > num) {
				aux2.adi(x);
			}else {
				aux1.adi(x);
			}
		}
		c1.vaciar(aux1);
		c1.vaciar(aux2);

	}
}
