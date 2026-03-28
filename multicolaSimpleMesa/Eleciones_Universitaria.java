

import java.util.Scanner;

public class Eleciones_Universitaria {

	public static void main(String[] args) {
		ColaSimpleElector E = new ColaSimpleElector();
		Elector e1 = new Elector("jose",123);
		Elector e2 = new Elector("juana",123);
		Elector e3 = new Elector("segio",123);
		Elector e4 = new Elector("jhamil",123);
		E.adi(e1);
		E.adi(e2);
		E.adi(e3);
		E.adi(e4);
		
		ColaCircularDelegado D = new ColaCircularDelegado();
		Delegado d1 = new Delegado("joel",123);
		Delegado d2 = new Delegado("jhamil",123);
		D.adi(d1);
		D.adi(d2);
		
		PilaVoto P = new PilaVoto();
		P.adicionar("candidato 1");
		P.adicionar("candidato 1");
		P.adicionar("candidato 3");
		P.adicionar("candidato 2");
		MesaE m = new MesaE(1,"estudiantes",E,D,P);
		
		ColaSimpleElector E1 = new ColaSimpleElector();
		Elector e5 = new Elector("mery",123);
		Elector e6 = new Elector("abril",123);
		Elector e7 = new Elector("sindel",123);
		Elector e8 = new Elector("leo",123);
		E1.adi(e5);
		E1.adi(e6);
		E1.adi(e7);
		E1.adi(e8);
		
		ColaCircularDelegado D1 = new ColaCircularDelegado();
		Delegado d3 = new Delegado("jose",123);
		Delegado d4 = new Delegado("juana",123);
		D1.adi(d3);
		D1.adi(d4);
		
		PilaVoto P1 = new PilaVoto();
		P1.adicionar("candidato 1");
		P1.adicionar("candidato 2");
		P1.adicionar("candidato 2");
		P1.adicionar("candidato 3");
		MesaE m1 = new MesaE(2,"docentes",E1,D1,P1);
		
		ColaSimpleElector E2 = new ColaSimpleElector();
		Elector e9 = new Elector("melani",123);
		Elector e10 = new Elector("abram",123);
		Elector e11 = new Elector("lucho",123);
		Elector e12 = new Elector("juaquin",123);
		Elector e13 = new Elector("susan",123);
		E2.adi(e9);
		E2.adi(e10);
		E2.adi(e11);
		E2.adi(e12);
		E2.adi(e13);
		ColaCircularDelegado D2 = new ColaCircularDelegado();
		Delegado d5 = new Delegado("jose",123);
		D2.adi(d5);

		PilaVoto P2 = new PilaVoto();
		P2.adicionar("candidato 1");
		P2.adicionar("candidato 2");
		P2.adicionar("candidato 3");
		P2.adicionar("candidato 3");
		P2.adicionar("candidato 3");
		MesaE m2 = new MesaE(6,"estudiantes",E2,D2,P2);
		
		ColaSimpleElector E3 = new ColaSimpleElector();
		Elector e14 = new Elector("melani",123);
		Elector e15 = new Elector("abram",123);
		Elector e16 = new Elector("lucho",123);
		Elector e17 = new Elector("juaquin",123);
		Elector e18 = new Elector("susan",123);
		E3.adi(e14);
		E3.adi(e15);
		E3.adi(e16);
		E3.adi(e17);
		E3.adi(e18);
		ColaCircularDelegado D3 = new ColaCircularDelegado();
		Delegado d6 = new Delegado("jose",123);
		D3.adi(d6);

		PilaVoto P3 = new PilaVoto();
		P3.adicionar("candidato 1");
		P3.adicionar("candidato 2");
		P3.adicionar("candidato 3");
		P3.adicionar("candidato 3");
		P3.adicionar("candidato 3");
		MesaE m3 = new MesaE(3,"docente",E3,D3,P3);
		
		System.out.println("LA mesa tiene los detos");
		
		Mp_ColaSimpleMesa MPC = new Mp_ColaSimpleMesa(13);
		//MPC.llenar(3);//esto solo es para llenar por teclado cada facultad
		MPC.adicionar(0, m);
		MPC.adicionar(0, m1);
		MPC.adicionar(1, m2);
		MPC.adicionar(1, m3);
		MPC.mostrar();
		
		//b)mostrar el nro de mesa donde sufraga el estudiante de nombre X
		System.out.println("\t******INCISO B*******");
		Scanner sc = new Scanner(System.in);
		String nomX=sc.next();
		//String nomX="jose";
		mostrarMesaVotacion(MPC,nomX,"estudiantes");
		//c)Cuntos votos ha obtenido el cndidato de nombre X
		System.out.println("\t******INCISO C*******");
		String candX =sc.next();
		//String candX ="candidato 3";
		int cantV = cantidad_de_votos(MPC,candX);
		System.out.println("El cadidato: "+candX+" tuvo la cantida total de votos =>["+cantV+"]");
		
	}

	private static int cantidad_de_votos(Mp_ColaSimpleMesa m, String candX) {
		int cont=0;
		for (int i = 0; i < m.getNp(); i++) {
			cont+= buscar_candidato(m,i,candX);
		}
		return cont;
	}

	private static int buscar_candidato(Mp_ColaSimpleMesa m, int i, String candX) {
	    int cont = 0;
	    ColaSimpleMesa aux = new ColaSimpleMesa();
	    while (!m.esvacia(i)) {
	        MesaE x = m.eliminar(i); // Obtener la mesa en lugar de eliminarla
	        aux.adi(x);
	        PilaVoto v = x.getVoto();
	        int nroV = v.nroElem();
	        PilaVoto auxv = new PilaVoto();
	        while(!v.esVacia()) {
	            String voto = v.eleminar(); // Corregir el nombre del método a "eliminar"
	            if (voto.equals(candX)) {
	                cont++;
	            }
	            auxv.adicionar(voto);
	        }
	        v.vaciar(auxv);
	    }
	    m.vaciar(i, aux);
	    return cont;
	}



	private static void mostrarMesaVotacion(Mp_ColaSimpleMesa m, String nomX, String tipox) {
		boolean sw = false;
		for (int i = 0; i < m.getNp(); i++) {
			if (buscarElector(m,i,nomX,tipox)) {
				sw=true;
			}
		}
		if(sw) {
			System.out.println("Elector "+nomX+" si se encuntra registrado....");
		}
		if (!sw) {
			System.out.println("Elector "+nomX+" no registrado");
		}
		
	}

	private static boolean buscarElector(Mp_ColaSimpleMesa m, int i, String nomX, String tipox) {
	    ColaSimpleMesa aux = new ColaSimpleMesa();
	    boolean sw = false;
	    while (!m.esvacia(i)) {
	        MesaE x = m.eliminar(i); // Obtener la mesa en lugar de eliminarla
	        aux.adi(x);
	        if (x.getTipo().equals(tipox)) {
	            ColaSimpleElector z = x.getElector();
	            int nroE = z.nroElem();
	            for (int j = 0; j < nroE; j++) {
	                Elector e = z.eli();
	                z.adi(e);
	                if (e.getNom().equals(nomX)) {
	                    System.out.println("esta registrado en el Nro de Mesa [" + x.getNumMesa()+"]");
	                    sw = true;
	                }
	            }
	        }
	    }
	    m.vaciar(i, aux);
	    return sw;
	}


}
