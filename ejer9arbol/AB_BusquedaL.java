import java.util.Scanner;
//Lic. Marcelo Aruquipa
public class AB_BusquedaL extends ArbolBinarioL {
	public void crear(NodoL R) {
		Scanner lee = new Scanner(System.in);
		if(R != null) {
			Libro x = new Libro();
			x.leer();
			R.setLetra(x);
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
//	public void crearPorDefecto() {
//		this.getRaiz().setPer(new Persona("alan", 17));
//		this.getRaiz().setIzq(new Nodo(new Persona("ruben", 20)));
//		this.getRaiz().setDer(new Nodo(new Persona("ana", 15)));
//		this.getRaiz().getIzq().setIzq(new Nodo(new Persona("elba", 18)));
//		this.getRaiz().getIzq().setDer(new Nodo(new Persona("joel", 21)));
//		this.getRaiz().getDer().setDer(new Nodo(new Persona("zoila", 18)));		
//	}
	public boolean verificarLibroExiste(NodoL R, String titulox) {
		ColaSimpleNodo nivel = new ColaSimpleNodo();
		ColaSimpleNodo des = new ColaSimpleNodo();
		
		NodoL q = this.raiz;
		nivel.adi(q);
		 
		while(!nivel.esVacia()) {
			while(!nivel.esVacia()) {
				NodoL x = nivel.eli();
				if(x.getLetra().getTitulo().equals(titulox)) {
					x.getLetra().mostrar();
					return true;
				}
				if(x.getIzq() != null) {
					des.adi(x.getIzq());
				}
				if(x.getDer() != null) {
					des.adi(x.getDer());
				}
			}nivel.vaciar(des);
		}
		return false;
		
	}
	
	public void mostrarLibro(NodoL R) {
		ColaSimpleNodo nivel = new ColaSimpleNodo();
		ColaSimpleNodo des = new ColaSimpleNodo();
		
		NodoL q = this.raiz;
		nivel.adi(q);
		
		while(!nivel.esVacia()) {
			while(!nivel.esVacia()) {
				NodoL x = nivel.eli();
				if(x.getLetra().getCantEjem() > 5) {
					System.out.println(x.getLetra().getTitulo());
				}
				if(x.getIzq() != null) {
					des.adi(x.getIzq());
				}
				if(x.getDer() != null) {
					des.adi(x.getDer());
				}
			}nivel.vaciar(des);
		}
		
	}
	public void menorEjem() {
		ColaSimpleNodo nivel = new ColaSimpleNodo();
		ColaSimpleNodo des = new ColaSimpleNodo();
		int menor = menorEjemplar(this.raiz);
		
		NodoL q = this.raiz;
		nivel.adi(q);
		while(!nivel.esVacia()) {
			while(!nivel.esVacia()) {
				NodoL x = nivel.eli();
				if(x.getLetra().getCantEjem() == menor) {
					System.out.println("libro menor ejemplar");
					x.getLetra().mostrar();
				}
				if(x.getIzq() != null) {
					des.adi(x.getIzq());
				}
				if(x.getDer() != null) {
					des.adi(x.getDer());
				}
			}nivel.vaciar(des);
		}
		
	}
	
	public int menorEjemplar(NodoL R) {
		ColaSimpleNodo nivel = new ColaSimpleNodo();
		ColaSimpleNodo des = new ColaSimpleNodo();
		int menor = 100000;
		NodoL q = this.raiz;
		nivel.adi(q);
		while(!nivel.esVacia()) {
			while(!nivel.esVacia()) {
				NodoL x = nivel.eli();
				if(x.getLetra().getCantEjem() < menor) {
					menor = x.getLetra().getCantEjem();
				}
				if(x.getIzq() != null) {
					des.adi(x.getIzq());
				}
				if(x.getDer() != null) {
					des.adi(x.getDer());
				}
			}nivel.vaciar(des);
		}
		return menor;
	}
	
	public void preorden(NodoL R) {
		if(R != null) {
			R.getLetra().mostrar();
			preorden(R.getIzq());
			preorden(R.getDer());
		}
	}
	
	public void postOrden(NodoL R) {
		if(R != null) {
			postOrden(R.getIzq());
			postOrden(R.getDer());
			R.getLetra().mostrar();
		}
	}
	public void inorden(NodoL R) {
		if(R != null) {
			inorden(R.getIzq());
			R.getLetra().mostrar();
			inorden(R.getDer());
		}
	}

	
}

