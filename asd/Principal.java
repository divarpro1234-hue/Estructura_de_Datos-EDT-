
public class Principal {
    public static void main(String[] args) {
    	LD_NormalCC lc=new LD_NormalCC();
        lc.llenar();
        //lc.mostrar();
        
        //PROBLEMAS A RESOLVER
        //PROBELMA 1
        
        System.out.println();
        System.out.println("PROBELMA 1");
        System.out.println("\nSea el Centro de convenciones X, mostrar el total de "
        		+ "asistentes que asistirán a los eventos de ese centro");
        SumarTotalAsist(lc, "ParaInfo");
        
        //PROBLEMA 2
        
        System.out.println();
        System.out.println("PROBELMA 2");
        System.out.println("\nBuscar en los centros convencionales el eventoX, si es "
        		+ "del tipoEventoY, y mostrar los datos del evento");
        String eventox = "CiberSeguridad";
        String tipoEventoY = "Conferencia CiberSeguridad";
        buscarEventoXTipoEventoY(lc, eventox, tipoEventoY);
        
      //PROBLEMA 3
        System.out.println();
        System.out.println("PROBELMA 3");
        //enunciado
        System.out.println("Implementar una funcionalidad en un sistema de gestión de eventos que permita "
        		+ "modificar los detalles de un evento específico en un centro convencional dado. Actualizar "
        		+ "su fecha, horario y estado, y validar que el nuevo estado sea 'Activo' o 'Cancelado'. "
        		+ "Si el evento no se encuentra, el sistema deberá notificar al usuario.");
        
        modificarEvento(lc, "enero", "ParaInfo", "Otaku Fest", "25/10/2024", "09:00", "12:00", "Activo" );
        modificarEvento(lc, "enero", "ParaInfo", "Fantasma En El sistema", "24/12/2025", "08:00", "10:00", "Cancelado" );
        System.out.println("\n*** Datos después de la modificación: ****");
        lc.mostrar();
        
      //PROBLEMA 4
        System.out.println();
        System.out.println("PROBELMA 4");
        System.out.println("--------------------------------------------------------");
	    System.out.println("\nBuscar el nombre del organizador Z y "
	            + "mostrar el evento y el centro de convenciones en la que se encuentra.");

	    String nomOrg = "Kevin"; 
	    BuscarOrganizadorDelEvento(lc, nomOrg);
        
      //PROBLEMA 5
        System.out.println();
        System.out.println("PROBELMA 5");
        
        
    }
    //problema 4
    static void BuscarOrganizadorDelEvento(LD_NormalCC lc, String nomOrg) {
        boolean encontrado = false;

        NodoCC NC = lc.getP();
        while (NC != null) {
            CentroConvencional cen = NC.getCenCon();
            NodoE NE = cen.getLe().getP();

            while (NE != null) {
                Evento evento = NE.getEvento();

                if (evento.getOrganizador().contains(nomOrg)) {
                    encontrado = true;
                    System.out.println("\nOrganizador encontrado:");
                    System.out.println("Centro de Convenciones: " + cen.getNomCentro());
                    System.out.println("Detalles del Evento:");
                    evento.mostrar();
                }

                NE = NE.getSig();
            }

            NC = NC.getSig();
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún evento con el organizador: " + nomOrg);
        }
    }
    //problema 3
    public static void modificarEvento(
            LD_NormalCC listaCentros,
            String mesx,
            String centrox,
            String nombreEvento,
            String nuevaFecha,
            String nuevaHoraInicio,
            String nuevaHoraFin,
            String nuevoEstado
        ) {
            NodoCC nodoCentro = listaCentros.getP();
            while (nodoCentro != null) {
                CentroConvencional centro = nodoCentro.getCenCon();
                if (centro.getNomCentro().equalsIgnoreCase(centrox)) {
                    LS_NormalE listaEventos = centro.getLe();
                    NodoE nodoEvento = listaEventos.getP();
                    while (nodoEvento != null) {
                        Evento evento = nodoEvento.getEvento();
                        if (evento.getNombre().equalsIgnoreCase(nombreEvento)) {
                            evento.setFecha(nuevaFecha);
                            evento.setHoraInicio(nuevaHoraInicio);
                            evento.setHoraFin(nuevaHoraFin);
                            if (nuevoEstado.equals("Activo") || nuevoEstado.equals("Cancelado")) {
                                evento.setEstado(nuevoEstado);
                            } else {
                                System.out.println("\nEstado no válido. Debe ser 'Activo' o 'Cancelado'.");
                                return;
                            }
                            System.out.println("\n**** Evento a modificar: *****");
                            evento.mostrar();
                            return;
                        }
                        nodoEvento = nodoEvento.getSig();
                    }
                }
                nodoCentro = nodoCentro.getSig();
            }
            System.out.println("\n*** No se encontró el evento especificado ***");
        }
    
  //problema 2
	private static void buscarEventoXTipoEventoY(LD_NormalCC lc, String eventox, String tipoEventoY) {
		// TODO Auto-generated method stub
		NodoCC R = lc.getP();
		while (R != null) {
			LS_NormalE le = R.getCenCon().getLe();
			NodoE S = le.getP();
			while (S != null ) {
				Evento x = S.getEvento();
				if(x.getNombre().equalsIgnoreCase(eventox))
					if(x.getTipoEvento().equalsIgnoreCase(tipoEventoY))
						x.mostrar();
				S = S.getSig();
			}
			R = R.getSig();
		}
	}
	
	
	//problema 1
	private static void SumarTotalAsist(LD_NormalCC A, String centrox) {
		NodoCC R = A.getP();
		int c = 0;
		while(R != null) {
			if(R.getCenCon().getNomCentro().equals(centrox)) {
				LS_NormalE B = R.getCenCon().getLe();
				NodoE T = B.getP();
				while(T != null) {
					c = c + T.getEvento().getNroAsistentes();
					T = T.getSig();
				}
			}
			R = R.getSig();
		}
		System.out.println("El numero total de asistentes de todos los eventos de" + centrox + " es: "+ c);
	}
}
