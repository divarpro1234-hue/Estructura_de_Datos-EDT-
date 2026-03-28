
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ColaSimpleC c1 = new ColaSimpleC();
		c1.adi(new Competencia("nick", "zorro", 100, 10, "felino"));
		c1.adi(new Competencia("gazelle", "chivo", 50, 5, "cabras"));
		c1.adi(new Competencia("judy", "conejo", 90, 7, "felino"));
		c1.adi(new Competencia("of._ben", "jaguar", 100, 8, "felino"));
		c1.adi(new Competencia("yax", "toro", 70, 6, "bufalos"));
		c1.adi(new Competencia("judy", "conejo", 90, 7, "ratones"));
		c1.adi(new Competencia("frufru", "raton", 20, 3, "ratones"));
		c1.adi(new Competencia("priscilla", "perezoso", 1, 0, "perezosos"));
		
		c1.mostrar();
		
		System.out.println("\nd) Eliminar a los animales cuya velocidad sea "
				+ "menor a 20 km/h, excepto si son\r\n"
				+ "perezosos (porque Flash, el perezoso, es la estrella del"
				+ " evento).\r\n"
				+ "");
		eliminarAnimalVelocidad(c1);
		c1.mostrar();
		
		System.out.println("a) Verificar si hay algún animal registrado en"
				+ " más de una categoría");
		
		if(verificarAnimalRegistradoMasCategoria(c1)) {
			System.out.println("hay algun animal en mas categorias");
		}else {
			System.out.println("no hay algun animal en mas categorias");
		}
	
	}

	private static boolean verificarAnimalRegistradoMasCategoria(ColaSimpleC c1) {
		// TODO Auto-generated method stub
		ColaSimpleC aux = new ColaSimpleC();
		while(!c1.esVacia()) {
			ColaSimpleC aux1 = new ColaSimpleC();
			Competencia x = c1.eli();
			while(!c1.esVacia()) {
				Competencia z = c1.eli();
				if(x.getNombre() == z.getNombre()) {
					if(x.getCategoria() != z.getCategoria()) {
						aux1.adi(z);
						c1.vaciar(aux1);
						return true;
					}
				}else {
					aux1.adi(z);
				}
				
			}
			c1.vaciar(aux1);
			aux.adi(x);
		}
		c1.vaciar(aux);
		return false;
	}

	private static void eliminarAnimalVelocidad(ColaSimpleC c1) {
		// TODO Auto-generated method stub
		ColaSimpleC aux = new ColaSimpleC();
		ColaSimpleC aux1 = new ColaSimpleC();
		while(!c1.esVacia()) {
			Competencia x = c1.eli();
			if(x.getVelMax() <= 20) {
				if(x.getEspecie() == "perezoso") {
					aux.adi(x);
				}
			}else {
				aux1.adi(x);
			}
			
		}
		c1.vaciar(aux1);
		c1.vaciar(aux);
		
	}

}