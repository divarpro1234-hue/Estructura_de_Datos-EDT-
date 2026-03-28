

import java.util.Scanner;
public class Mp_ColaSimpleMesa {

	ColaSimpleMesa mp[] = new ColaSimpleMesa[20];
	int n = 0;
	Mp_ColaSimpleMesa(int n) {
		int i;
		this.n=n;
		for (i = 0; i < n; i++)
			mp[i] = new ColaSimpleMesa();
	}

	int Nropilas() {
		return (n);
	}

	int nroelem(int i) {
		return (mp[i].nroElem());
	}

	boolean esvacia(int i) {
		if (mp[i].esVacia())
			return true;
		return false;
	}

	boolean esllena(int i) {
		if (mp[i].esLlena())
			return true;
		return false;
	}

	void adicionar(int i, MesaE L) {
		if (!mp[i].esLlena())
			mp[i].adi(L);
		else
			System.out.print("pila " + i + " esta llena");
	}

	MesaE eliminar(int i) {
		MesaE e = new MesaE();
		if (!mp[i].esVacia())
			e = mp[i].eli();
		else
			System.out.print("pila " + i + " esta vacia");
		return e;
	}
	public void llenar(int i, int n) {
		mp[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			System.out.println("------nro de Mesas de la Cola-------");
			int nroMesa = lee.nextInt();
			mp[i].llenar(nroMesa);
		}
	}

	void mostrar(int i) {
		mp[i].mostrar();
	}

	void mostrar() {
		int i;
		for (i = 0; i < n; i++) {
			String mes = segun_mes(i);
			System.out.println("\nDatos "+mes+"["+i+"]");
			mp[i].mostrar();
		}
	}

	void vaciar(int i, ColaSimpleMesa z) {
		mp[i].vaciar(z);
	}

	public ColaSimpleMesa[] getMp() {
		return mp;
	}

	public void setMp(ColaSimpleMesa[] mp) {
		this.mp = mp;
	}

	

	public int getNp() {
		return n;
	}

	public void setNp(int np) {
		this.n = np;
	}
	private static String segun_mes(int i) {
	    String mes = "";
	    switch(i) {
	        case 0:
	            mes = "Facultad de Agronomía";
	            break;
	        case 1:
	            mes = "Facultad de Arquitectura";
	            break;
	        case 2:
	            mes = "Facultad de Ciencias Económicas y Financieras";
	            break;
	        case 3:
	            mes = "Facultad de Ciencias Farmacéuticas y Bioquímicas";
	            break;
	        case 4:
	            mes = "Facultad de Ciencias Geológicas";
	            break;
	        case 5:
	            mes = "Facultad de Ciencias Puras y Naturales";
	            break;
	        case 6:
	            mes = "Facultad de Ciencias Sociales";
	            break;
	        case 7:
	            mes = "Facultad de Derecho y Ciencias Políticas";
	            break;
	        case 8:
	            mes = "Facultad de Humanidades y Ciencias de la Educación";
	            break;
	        case 9:
	            mes = "Facultad de Ingeniería";
	            break;
	        case 10:
	            mes = "Facultad de Medicina, Enfermería, Nutrición y Tecnología Médica";
	            break;
	        case 11:
	            mes = "Facultad de Odontología";
	            break;
	        case 12:
	        	mes = "Facultad de Tecnología";
	        	break;
	    }
	    return mes;
	}

	

}