public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//	Participantes.
		
		//	Murillo Peñaranda Mario Fabricio
		//	Palomino Santos Kevin Yahir
		// 	Ronquillo Quispe Henry
		//	Peredo Ticona Edwin Daniel
		//	Tarqui Chiri Kleyder Fernando
		//	Divar Husaman Mamani Callisaya

		
		
		
		LD_CircularCan C =  new LD_CircularCan();

		Cancion c1 = new Cancion("x", "B", "xx");
		Cancion c2 = new Cancion("y", "A", "yy");
		Cancion c3 = new Cancion("z", "B", "xx");
		Cancion c4 = new Cancion("r", "C", "xx");
		Cancion c5 = new Cancion("k", "A", "kk");
		C.adiFinal(c1);
		C.adiFinal(c2);
		C.adiFinal(c3);
		C.adiFinal(c4);
		C.adiFinal(c5);
		
		C.mostrar();
		
		System.out.println(C.esVacia());
		System.out.println("nro de nodos de la lista: " + C.nroNodos());
		LS_NormalArt A = new LS_NormalArt();
		
		Artista z1 = new Artista("A", 25);
		Artista z2 = new Artista("D", 50);
		Artista z3 = new Artista("B", 30);
		Artista z4 = new Artista("Z", 60);
		
		
		
		A.adiFinal(z4);
		A.adiFinal(z3);
		A.adiFinal(z2);
		A.adiFinal(z1);
		A.mostrar();
		System.out.println("--------------------");
		System.out.println("a) llevar a los artistas de edad entre 20 y 35 al final de la lista");
		llevarArtistaFinal(A, 20,35);
		A.mostrar();
		
		//b
		System.out.println("b) mostrar el artista con mayor numero de canciones");
		MostrarArtistaConMasCanciones(C,A);
		//c)
		System.out.println("c) mostrar el genero muscial mas popular");
		MostrarGeneroMasPopular(C);
		
	}

	private static void MostrarArtistaConMasCanciones(LD_CircularCan c, LS_NormalArt a) {
	    LS_NormalArt auxA = new LS_NormalArt();
	    LD_CircularCan auxC = new LD_CircularCan();

	    int maxCanciones = 0;
	    LS_NormalArt LSArt = new LS_NormalArt();

	    while (!a.esVacia()) {
	        NodoArt S = a.eliPrincipio();
	        Artista x = S.getQ();

	        int cnt = 0;
	        NodoCan R = c.getP();
	        NodoCan T = R;

	        while (true) {
	            if (R.getZ().getNomArt().equals(x.getNom())) {
	                cnt++;
	            }
	            R = R.getSig();
	            if (R == T) {
	                break;
	            }
	        }

	        if (cnt > maxCanciones) {
	            maxCanciones = cnt;
	            LSArt = new LS_NormalArt();
	            LSArt.adiFinal(x);
	        } else if (cnt == maxCanciones && cnt > 0) {
	            LSArt.adiFinal(x);
	        }

	        auxA.adiFinal(x);
	    }

	    while (!auxA.esVacia()) {
	        a.adiFinal(auxA.eliPrincipio().getQ());
	    }

	    if (maxCanciones > 0) {
	        System.out.println("Los artistas con el mayor número de canciones son:");
	        while (!LSArt.esVacia()) {
	            Artista art = LSArt.eliPrincipio().getQ();
	            System.out.println(art.getNom());
	        }
	    } else {
	        System.out.println("No hay canciones registradas para los artistas.");
	    }
	}

	private static void llevarArtistaFinal(LS_NormalArt A, int min, int max) {
		// TODO Auto-generated method stub
		LS_NormalArt aux = new  LS_NormalArt();
		LS_NormalArt aux2 = new  LS_NormalArt();
		while(!A.esVacia())
		{
			NodoArt x = A.eliPrincipio();
			Artista z = x.getQ();
			if (z.getEdad() >= min && z.getEdad() <= max ) {
				aux.adiFinal(z);
			}else
			{
				aux2.adiFinal(z);
			}
		}
		NodoArt R = aux2.getP();
		while(R.getSig() != null){
			R = R.getSig();
		}
		A.setP(aux2.getP());
		R.setSig(aux.getP());
	
	}

	static void MostrarGeneroMasPopular(LD_CircularCan a) {
	    LD_CircularCan aux = new LD_CircularCan();
	    NodoCan R = a.getP();
	    String generoPopular = "";
	    int maxCanciones = 0;
	    
	    while (!a.esVacia()) {
	        NodoCan T = a.eliPrimero();
	        String genero = T.getZ().getGenero();
	        int c = 1;
	  
	        NodoCan S = a.getP();
	        if (S != null) {
	            S = S.getSig();
	            while (S != a.getP()) {
	                if (S.getZ().getGenero().equals(genero)) {
	                    c++;
	                }
	                S = S.getSig();
	            }
	        }

	        aux.adiFinal(T.getZ());
	        if (c > maxCanciones) {
	            maxCanciones = c;
	            generoPopular = genero;
	        } else 
	        	{if (c == maxCanciones && !generoPopular.contains(genero)) {
	        			generoPopular += ", " + genero;
	        	}
	        }
	    }
	    while (!aux.esVacia()) {
	        a.adiFinal(aux.eliPrimero().getZ());
	    }
	    System.out.println("\nGenero musical mas popular: " + generoPopular);
	    System.out.println("Numero de canciones: " + maxCanciones);
	}

}