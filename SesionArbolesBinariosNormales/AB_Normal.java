import java.util.Scanner;
//Lic. Marcelo Aruquipa
public class AB_Normal extends ArbolBinario {
	public void crear(Nodo R) {
		Scanner lee = new Scanner(System.in);
		if(R != null) {
			Persona x = new Persona();
			x.leer();
			R.setPer(x);
			System.out.println("tendra izq? s/n");
			String resp = lee.next();
			if(resp.equals("s")) {
				Nodo nuevo = new Nodo();
				R.setIzq(nuevo);
				crear(R.getIzq());
			}
			System.out.println("tendra der? s/n");
			resp = lee.next();
			if(resp.equals("s")) {
				Nodo nuevo = new Nodo();
				R.setDer(nuevo);
				crear(R.getDer());
			}
		}
	}
	
	public int contarHojas(Nodo R){
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
	
	public void preorden(Nodo R) {
		if(R != null) {
			R.getPer().mostrar();
			preorden(R.getIzq());
			preorden(R.getDer());
		}
	}
	
	public void postOrden(Nodo R) {
		if(R != null) {
			postOrden(R.getIzq());
			postOrden(R.getDer());
			R.getPer().mostrar();
		}
	}
	public void inorden(Nodo R) {
		if(R != null) {
			inorden(R.getIzq());
			R.getPer().mostrar();
			inorden(R.getDer());
		}
	}
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
	public void mostrarPerConEdadX(int edadx) {
		ColaSimpleNodo niv = new ColaSimpleNodo();
		ColaSimpleNodo des = new ColaSimpleNodo();
		int contador = 0;
		niv.adi(getRaiz());
		while(!niv.esVacia()) {
			while(!niv.esVacia()) {
				Nodo x = niv.eli();
				Persona z = x.getPer();
				if(edadx == z.getEdad()) {
					contador++;
				}
				if(x.getIzq() != null) des.adi(x.getIzq());
				if(x.getDer() != null) des.adi(x.getDer());
				
				}
			niv.vaciar(des);
		}
	}
	
}

