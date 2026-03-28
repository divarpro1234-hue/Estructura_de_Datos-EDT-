import java.util.Scanner;
//Lic. Marcelo Aruquipa
public class AB_NormalM extends ArbolBinarioM {
	public void crear(NodoM R) {
		Scanner lee = new Scanner(System.in);
		if(R != null) {
			Mascota x = new Mascota();
			x.leer();
			R.setMascota(x);
			System.out.println("tendra izq? s/n");
			String resp = lee.next();
			if(resp.equals("s")) {
				NodoM nuevo = new NodoM();
				R.setIzq(nuevo);
				crear(R.getIzq());
			}
			System.out.println("tendra der? s/n");
			resp = lee.next();
			if(resp.equals("s")) {
				NodoM nuevo = new NodoM();
				R.setDer(nuevo);
				crear(R.getDer());
			}
		}
	}
	
	public int contarHojas(NodoM R){
		if(R != null) {
			int c = contarHojas(R.getIzq()) + contarHojas(R.getDer());
			if(R.getIzq() == null && R.getDer() == null)
				c = c+1;
			return c;
		}else
			return 0;
	}
	public void crearPorDefecto() {
		this.getRaiz().setMascota(new Mascota("001", "gato", "rufo", "macho", 4, "001"));
		this.getRaiz().setIzq(new NodoM(new Mascota("002", "perro", "firu", "macho", 3, "001")));
		this.getRaiz().setDer(new NodoM(new Mascota("003", "lagarto", "leo", "Hembra", 1, "003")));
		this.getRaiz().getIzq().setIzq(new NodoM(new Mascota("004", "sapo", "lechon", "hembra", 2, "004")));
		this.getRaiz().getIzq().setDer(new NodoM(new Mascota("005", "tortuga", "tortus", "macho", 6, "005")));
		this.getRaiz().getDer().setDer(new NodoM(new Mascota("006", "gato", "rufa", "hembra", 5, "006")));		
	}
	
	public void preorden(NodoM R) {
		if(R != null) {
			R.getMascota().mostrar();
			preorden(R.getIzq());
			preorden(R.getDer());
		}
	}
	
	
//	public double promEdad() {
//		ColaSimpleNodo niv = new ColaSimpleNodo();
//		ColaSimpleNodo des = new ColaSimpleNodo();
//		int cnt = 0;
//		int sum = 0;
//		NodoM x = getRaiz();
//		niv.adi(x);
//		while(!niv.esVacia()) {
//			while(!niv.esVacia()) {
//				x = niv.eli();
//				Mascota z =  x.getMascota();
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
//	public void mostrarMascotaConEdadX(int edadx) {
//		ColaSimpleNodo niv = new ColaSimpleNodo();
//		ColaSimpleNodo des = new ColaSimpleNodo();
//		int contador = 0;
//		niv.adi(getRaiz());
//		while(!niv.esVacia()) {
//			while(!niv.esVacia()) {
//				NodoM x = niv.eli();
//				Mascota z = x.getMascota();
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

