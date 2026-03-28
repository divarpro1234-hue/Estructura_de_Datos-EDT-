

public class LD_NormalCC extends ListaDobleCC{
	public LD_NormalCC() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoCC R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(CentroConvencional z){
		NodoCC nuevo = new NodoCC();
		nuevo.setCenCon(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoCC R = P;
		while(R != null) {
			R.getCenCon().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(CentroConvencional z) {
		NodoCC nuevo =  new NodoCC();
		nuevo.setCenCon(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoCC R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoCC eliPrimero() {
		NodoCC x = new NodoCC();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoCC eliFinal() {
		NodoCC x = new NodoCC();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoCC R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoCC aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		
		for (int i = 1; i <= n; i++) {
			CentroConvencional z = new CentroConvencional();

			z.leer();
			
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		
		for (int i = 1; i <= n; i++) {
			CentroConvencional z = new CentroConvencional();
			z.leer();
			adiFinal(z);
		}
	}
        public void llenar(){
            Evento e1=new Evento("Otaku Fest","21/08/2024","10:00","12:00","Jorge Mendez","Evento Anime",30,"Activo");
            Evento e2=new Evento("CiberSeguridad","10/02/2024","14:00","16:00","Arturo Medina","Conferencia CiberSeguridad",50,"Activo");
            Evento e3=new Evento("Fantasma En El Sistema","24/12/2025","08:00","10:00","Kevin Mitnick","Venta de Libro Kevin Mitnick",25,"Activo");
            Evento e4=new Evento("Gamers En Proceso","03/05/2025","22:00","00:00","","Evento Gamer",15,"Cancelado");
            Evento e5=new Evento("Festival Futbol","09/06/2024","10:00","12:00","Roberto Mamani","Evento de Furbol",35,"Cancelado");
            Evento e6=new Evento("Voleybol Conferencia","16/08/2024","12:00","14:00","Martin Rodriguez","Evento Voleybol",65,"Activo");
            Evento e7=new Evento("Autos Ultimos Modelos","12/03/2024","08:00","12:00","Jaime Martines","Conferencia Venta de Autos",90,"Activo");
            Evento e8=new Evento("Musicas Y Mejores Temas","18/10/2025","18:00","20:00","Marcel Jonas","Evento Musical Mejores Musicas",40,"Cancelado");
            Evento e9=new Evento("Extraterrestres en el Mar","22/07/2024","20:00","00:00","Jaime Mausan","Evento Ovnis y Mas",36,"Activo");
        
            LS_NormalE l1=new LS_NormalE();
            l1.adiFinal(e1);
            l1.adiFinal(e2);
            l1.adiFinal(e3);
            LS_NormalE l2=new LS_NormalE();
            l2.adiFinal(e4);
            l2.adiFinal(e5);
            l2.adiFinal(e6);
            LS_NormalE l3=new LS_NormalE();
            l3.adiFinal(e7);
            l3.adiFinal(e8);
            l3.adiFinal(e9);
            
            CentroConvencional cc1=new CentroConvencional("ParaInfo",l1);
            CentroConvencional cc2=new CentroConvencional("Auditorio Informatica",l2);
            CentroConvencional cc3=new CentroConvencional("Auditorio Matematicas",l3);
           
            adiFinal(cc1);
            adiFinal(cc2);
            adiFinal(cc3);
        }
}
