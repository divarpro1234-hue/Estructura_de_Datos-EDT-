import java.util.Scanner;
//Lic. Marcelo Aruquipa
public class AB_NormalL extends ArbolBinarioL {
	public void crear(NodoL R) {
		Scanner lee = new Scanner(System.in);
		if(R != null) {
			Libro x = new Libro();
			x.leer();
			R.setLibro(x);
			System.out.println("tendra izq? s/n");
			String resp = lee.next();
			if(resp.equals("s")) {
				NodoL nuevo = new NodoL();
				R.setIzq(nuevo);
				crear(R.getIzq());
			}
			System.out.println("tendra der? s/n");
			resp = lee.next();
			if(resp.equals("s")) {
				NodoL nuevo = new NodoL();
				R.setDer(nuevo);
				crear(R.getDer());
			}
		}
	}
	
	public int contarHojas(NodoL R){
		if(R != null) {
			int c = contarHojas(R.getIzq()) + contarHojas(R.getDer());
			if(R.getIzq() == null && R.getDer() == null)
				c = c+1;
			return c;
		}else
			return 0;
	}
	
	public boolean verificarLibroAutor(NodoL R, String autorx) {
		if(R != null) {
			if(R.getLibro().getAutor().equals(autorx)) {
				return true;
			}
			verificarLibroAutor(R.getIzq(), autorx);
			verificarLibroAutor(R.getDer(), autorx);
			
		}return false;
	}
	
	public void mostrarLibroAutorX(NodoL R, String autox) {
		if(R != null) {
			if(R.getLibro().getAutor().equals(autox)) {
				R.getLibro().mostrar();
			}
			mostrarLibroAutorX(R.getIzq(), autox);
			mostrarLibroAutorX(R.getDer(), autox);
		}
	}
	
	public int contarLibrosAutor(NodoL R, String autorx) {
		if(R != null) {
			int c = contarLibrosAutor(R.getIzq(), autorx) + contarLibrosAutor(R.getDer(), autorx);
			if(R.getLibro().getAutor().equals(autorx)) {
				return c+1;
			}
			return c;
		}return 0;
	}
	
	public void crearPorDefecto() {
		this.getRaiz().setLibro(new Libro("xxxx", "ever"));
		this.getRaiz().setIzq(new NodoL(new Libro("yyyy", "carlos")));
		this.getRaiz().setDer(new NodoL(new Libro("zzzz", "juan")));
		this.getRaiz().getIzq().setIzq(new NodoL(new Libro("qqqq", "pedro")));
		this.getRaiz().getIzq().setDer(new NodoL(new Libro("wwww", "danna")));
		this.getRaiz().getDer().setDer(new NodoL(new Libro("tttt", "juan")));		
	}
	
//	public void preorden(NodoL R) {
//		if(R != null) {
//			R.getLetra().mostrar();
//			preorden(R.getIzq());
//			preorden(R.getDer());
//		}
//	}
//	
//	public void postOrden(NodoL R) {
//		if(R != null) {
//			postOrden(R.getIzq());
//			postOrden(R.getDer());
//			R.getLetra().mostrar();
//		}
//	}
//	public void inorden(NodoL R) {
//		if(R != null) {
//			inorden(R.getIzq());
//			R.getLetra().mostrar();
//			inorden(R.getDer());
//		}
//	}
//	public double promEdad() {
//		ColaSimpleNodo niv = new ColaSimpleNodo();
//		ColaSimpleNodo des = new ColaSimpleNodo();
//		int cnt = 0;
//		int sum = 0;
//		Nodo x = getRaiz();
//		niv.adi(x);
//		while(!niv.esVacia()) {
//			while(!niv.esVacia()) {
//				x = niv.eli();
//				Persona z =  x.getPer();
//				sum += z.getEdad();
//				cnt ++;
//				if(x.getIzq() != null) 
//					des.adi(x.getIzq());
//				if(x.getDer() != null)
//					des.adi(x.getDer());
//			}
//			niv.vaciar(des);
//		}
//		return (sum/(double)cnt);
//	}
//	public void mostrarPerConEdadX(int edadx) {
//		ColaSimpleNodo niv = new ColaSimpleNodo();
//		ColaSimpleNodo des = new ColaSimpleNodo();
//		int contador = 0;
//		niv.adi(getRaiz());
//		while(!niv.esVacia()) {
//			while(!niv.esVacia()) {
//				NodoL x = niv.eli();
//				Letra z = x.getPer();
//				if(edadx == z.getEdad()) {
//					contador++;
//				}
//				if(x.getIzq() != null) des.adi(x.getIzq());
//				if(x.getDer() != null) des.adi(x.getDer());
//				
//				}
//			niv.vaciar(des);
//		}
//	}
	
}

