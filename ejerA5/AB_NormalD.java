import java.util.Scanner;
//Lic. Marcelo Aruquipa
public class AB_NormalD extends ArbolBinarioD {
	public void crear(NodoD R) {
		Scanner lee = new Scanner(System.in);
		if(R != null) {
			Dueño x = new Dueño();
			x.leer();
			R.setDuenio(x);
			System.out.println("tendra izq? s/n");
			String resp = lee.next();
			if(resp.equals("s")) {
				NodoD nuevo = new NodoD();
				R.setIzq(nuevo);
				crear(R.getIzq());
			}
			System.out.println("tendra der? s/n");
			resp = lee.next();
			if(resp.equals("s")) {
				NodoD nuevo = new NodoD();
				R.setDer(nuevo);
				crear(R.getDer());
			}
		}
	}
	
	public int contarHojas(NodoD R){
		if(R != null) {
			int c = contarHojas(R.getIzq()) + contarHojas(R.getDer());
			if(R.getIzq() == null && R.getDer() == null)
				c = c+1;
			return c;
		}else
			return 0;
	}
	public void crearPorDefecto() {
		this.getRaiz().setDuenio(new Dueño("001", "rafael","61145221"));
		this.getRaiz().setIzq(new NodoD(new Dueño("002", "fernando", "67788521")));
		this.getRaiz().setDer(new NodoD(new Dueño("003", "joel", "71185622")));
		this.getRaiz().getIzq().setIzq(new NodoD(new Dueño("004", "saul", "67785522")));
		this.getRaiz().getIzq().setDer(new NodoD(new Dueño("005", "daniel", "71519727")));
		this.getRaiz().getDer().setDer(new NodoD(new Dueño("006", "marco", "74125896")));		
	}
	
	public void preorden(NodoD R) {
		if(R != null) {
			R.getDuenio().mostrar();
			preorden(R.getIzq());
			preorden(R.getDer());
		}
	}
	public void determinarDuenoConMasMascotas(NodoD R, NodoM S) {
        ColaSimpleNodoD cd = new ColaSimpleNodoD();
        cd.adi(R);
        NodoD T = null;
        int maxMasc = 0;
        while (!cd.esVacia()) {
            NodoD ac = cd.eli();
            String idDuenio = ac.getDuenio().getidDueño();
            int cntM = contarMascotasDuenio(S, idDuenio);
            if (cntM > maxMasc) {
                maxMasc = cntM;
                T = ac;
            }
            if (ac.getIzq() != null) cd.adi(ac.getIzq());
            if (ac.getDer() != null) cd.adi(ac.getDer());
        }
        if (T != null) {
            System.out.println("El dueño con mas mascotas es: " + T.getDuenio().getNombreDueño()
                    + " con " + maxMasc + " mascotas.");
        } else {
            System.out.println("No se encontro mascotas");
        }
    }
	
    private int contarMascotasDuenio(NodoM S, String idDuenio) {
        if (S == null) return 0;
        ColaSimpleNodoM cM = new ColaSimpleNodoM();
        cM.adi(S);
        int c = 0;
        while (!cM.esVacia()) {
            NodoM R = cM.eli();
            if (R.getMascota().getIdDueñoMascota().equals(idDuenio)) {
                c++;
            }
            if (R.getIzq() != null) cM.adi(R.getIzq());
            if (R.getDer() != null) cM.adi(R.getDer());
        }

        return c;
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
//				Dueño z =  x.getPer();
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
//				Nodo x = niv.eli();
//				Dueño z = x.getPer();
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

