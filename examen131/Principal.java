	public class Principal {
	    public static void main(String[] args) {
	        ListaDobleSala salas = new ListaDobleSala();
	        Sala s1 = new Sala("Titanic", 1);
	        Sala s2 = new Sala("Avengers", 2);
	
	        s1.getPeliculas().adiFinal(new Pelicula("Titanic", "romance", 20, 50, "15:00"));
	        s1.getPeliculas().adiFinal(new Pelicula("SpiderMan", "acción", 25, 40, "17:00"));
	        s1.getPeliculas().adiFinal(new Pelicula("Love Again", "comedia", 18, 20, "18:30"));
	
	        s2.getPeliculas().adiFinal(new Pelicula("Avengers Endgame", "acción", 30, 100, "14:00"));
	        s2.getPeliculas().adiFinal(new Pelicula("El Amor es Así", "romance", 22, 35, "19:00"));
	        s2.getPeliculas().adiFinal(new Pelicula("Risa Total", "comedia", 20, 10, "20:00"));
	
	        salas.adicionarSala(s1);
	        salas.adicionarSala(s2);
	
	        // a)
	        NodoSala x = salas.getInicio();
	        while (x != null) {
	            int total = 0;
	            NodoPelicula p = x.sala.getPeliculas().getP();
	            while (p != null) {
	                total += p.pelicula.calcularMonto();
	                p = p.sig;
	            }
	            System.out.println("Sala: " + x.sala.getNombre() + " Recaudado: " + total);
	            x = x.sig;
	        }
	
	        // b)
	        System.out.println("\nMonto por Película:");
	        x = salas.getInicio();
	        while (x != null) {
	            NodoPelicula p = x.sala.getPeliculas().getP();
	            while (p != null) {
	                System.out.println(p.pelicula.getNombre() + ": " + p.pelicula.calcularMonto());
	                p = p.sig;
	            }
	            x = x.sig;
	        }
	
	        // c)
	        System.out.println("\nPelículas de Acción entre 14:00 y 20:00:");
	        x = salas.getInicio();
	        while (x != null) {
	            NodoPelicula p = x.sala.getPeliculas().getP();
	            while (p != null) {
	                if (p.pelicula.getGenero().equalsIgnoreCase("acción")) {
	                    String h = p.pelicula.getHorario();
	                    if (h.compareTo("14:00") >= 0 && h.compareTo("20:00") <= 0) {
	                        System.out.println(p.pelicula.getNombre() + " (" + h + ")");
	                    }
	                }
	                p = p.sig;
	            }
	            x = x.sig;
	        }
	
	        // d)
	        String mejorSala = "";
	        int max = -1;
	        x = salas.getInicio();
	        while (x != null) {
	            int cnt = 0;
	            NodoPelicula p = x.sala.getPeliculas().getP();
	            while (p != null) {
	                if (p.pelicula.getGenero().equalsIgnoreCase("comedia"))
	                    cnt++;
	                p = p.sig;
	            }
	            if (cnt > max) {
	                max = cnt;
	                mejorSala = x.sala.getNombre();
	            }
	            x = x.sig;
	        }
	        System.out.println("\nSala con más comedias: " + mejorSala);
	
	        // e)
	        x = salas.getInicio();
	        while (x != null) {
	            if (x.sala.getNombre().equalsIgnoreCase("Titanic")) {
	                x.sala.getPeliculas().adiPrincipio(new Pelicula("NuevaPeli", "romance", 21, 10, "13:00"));
	                break;
	            }
	            x = x.sig;
	        }
	
	        // f)
	        ColaSimplePelicula cola = new ColaSimplePelicula();
	        x = salas.getInicio();
	        while (x != null) {
	            NodoPelicula p = x.sala.getPeliculas().getP();
	            while (p != null) {
	                if (p.pelicula.getGenero().equalsIgnoreCase("romance")) {
	                    cola.insertar(p.pelicula);
	                }
	                p = p.sig;
	            }
	            x = x.sig;
	        }
	
	        System.out.println("\nCola de Romance:");
	        cola.mostrar();
	    }
	}