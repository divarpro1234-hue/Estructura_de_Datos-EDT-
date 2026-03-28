
import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		System.out.println("-----------------------");
		ColaCircularActividad  A = new ColaCircularActividad();
		EspacioDep z1 = new EspacioDep("Espacio1","miraflores");
		EspacioDep z2 = new EspacioDep("Espacio2","sopocachi");
		EspacioDep z3 = new EspacioDep("Espacio3","calacoto");
		EspacioDep z4 = new EspacioDep("Espacio4","irpavi");
		
		A.adi(z1);
		A.adi(z2);
		A.adi(z3);
		A.adi(z4);
		System.out.println("\t*****DATOS DE LOS ESPACIOS DEP*****");
		A.mostrar();
		
		MC_CircularActividad B = new MC_CircularActividad(2);
		
		Actividad t1 = new Actividad("Espacio1","lunes","sdfsdf");
		Actividad t2 = new Actividad("Espacio2","martes","sdfsdf");
		Actividad t3 = new Actividad("Espacio3","Jueves","sfssf");
		Actividad t4 = new Actividad("z4","Miercoles","sdfsdf");

		
		Actividad t9 = new Actividad("z1","sabado","sdfsf");
		Actividad t10 = new Actividad("z2","martes","sdfsdf");
		Actividad t11 = new Actividad("z3","02/02/2024","sdfsdf");
		Actividad t12 = new Actividad("z4","02/02/2024","sgf");


		
		Actividad t17 = new Actividad("z1","02/03/2024","sdfdg");
		Actividad t18 = new Actividad("z2","06/03/2024","dfgdg");
		Actividad t19= new Actividad("z3","14/03/2024","dfgd");
		Actividad t20= new Actividad("z4","11/03/2024","dfgdfg");

	
		B.adicionar(0, t1);
		B.adicionar(0, t2);
		B.adicionar(0, t3);
		B.adicionar(0, t4);
	
		
		B.adicionar(1, t9);
		B.adicionar(1, t10);
		B.adicionar(1, t11);
		B.adicionar(1, t12);
	
		
		B.adicionar(2, t17);
		B.adicionar(2, t18);
		B.adicionar(2, t19);
		B.adicionar(2, t20);

		B.mostrar();

		//B.setNp(3);
//		System.out.println("\n\t*****DATOS DE LAS TEMPERTURAS DE LAS ZONAS*****");
//		B.mostrar();
////		a) Mostrar si en la zona X se presentaron temperaturas bajo 0
//		System.out.println("\t**********Inciso A**********");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingrrese la ZONA x : ");
//		String zonaX = sc.next();
//		temperaturas_bajo_0(A,B,zonaX);
//		System.out.println("\t**********Inciso B**********");
////		b) Contar y mostrar cuantas zonas tienen temperaturas 
////		mayores o igual a 10
//		int tempX = 10;
//		int nroZonasTemp = zona_tempertura_mayor_a_cero(A,B,tempX);
//		System.out.println("nro de zonas con temperatura mayores a " + tempX +" => " + nroZonasTemp);
//		System.out.println("\t**********Inciso C**********");
////		c) Mostrar las zonas que tuvieron un registro de 
////		temperatura bajo 0 en fecha Y.
//		System.out.println("Introduce la fecha a buscar: ");
//		String fecha=sc.next();
//		//String fecha="02/02/2024";
//		mostrar_Fechas_temperturas_bajo0(A,B,fecha);
//		//d) Mostrar por cada zona la cantidad de temperaturas registradas 
//		//por cada mes.
//		
//		System.out.println("\t**********Inciso D**********");
//		mostrar_cada_zona_cantidad_temperatura(A,B);
////		e) Eliminar las temperaturas bajo 0 de la zona de nombre x 
//		System.out.println("\t**********Inciso E**********");
//		System.out.println("Introduce la zona X a eliminar temperturas vajo 0: ");
//		String zonX = sc.next();
//		//String zonX = "calacoto";
//		eliminar_temperaturas_bajo_0(A,B,zonX);
//		B.mostrar();
////		f) Adicionar en el mes de abril las siguientes temperaturas: 
////			(z2,"21/03/2024", -5), (z4,"15/02/2024", 40)
//		System.out.println("\t**********Inciso F**********");
//		System.out.println("introduce el numero de pila de mes a agregar:");
//		int numMes=sc.nextInt();
//		System.out.println("Introduce la cantidad de temperaturas a agregar: : ");
//		int numTem=sc.nextInt();
//		Adcionar_temperaturas(B,numMes,numTem);
//		B.mostrar();
	}
	//f)
//	private static void Adcionar_temperaturas(MC_CircularActividad b, int fecha, int elementos) {
//		int nroP = b.Nropilas();
//		for (int i = 0; i < nroP; i++) {
//			if (i==fecha) {
//				for (int j = 1; j <= elementos; j++) {
//					System.out.println("\tAGREGANDO TEMPRRATURA ["+j+"]");
//					Actividad elem = new Actividad();
//					elem.leer();
//					b.adicionar(i,elem);
//				}
//				
//			}
//		}
//		
//	}
//	//e)
//	private static void eliminar_temperaturas_bajo_0(ColaCircularActividad a, MC_CircularActividad b, String zonaX) {
//		int nroP = b.Nropilas();
//		PilaTemperatura aux = new PilaTemperatura();
//		String idZona = idZona(a,zonaX);
//		for (int i = 0; i < nroP; i++) {
//			while (!b.esvacia(i)) {
//				Actividad temp = b.eliminar(i);
//				if (temp.getIdZona().equals(idZona)) {
//					if (!(temp.getTemperatura()<=0)) {
//						aux.adi(temp);
//					}else {
//						System.out.println("Se elimino"+temp);
//					}
//				}
//				else {
//					aux.adi(temp);
//				}
//				
//			}
//			b.vaciar(i, aux);
//		}
//		
//	}
//	private static String idZona(ColaCircularActividad a, String zonaX) {
//		int nro = a.nroElem();
//		String id = "";
//		for (int i = 0; i < nro; i++) {
//			EspacioDep zona = a.eli();
//			if (zona.getNom().equals(zonaX)) {
//				id = zona.getIDZona();
//			}
//			a.adi(zona);
//		}
//		return id;
//	}
//	//d)
//	private static void mostrar_cada_zona_cantidad_temperatura(ColaCircularActividad a, MC_CircularActividad b) {
//		int nroZonas = a.nroElem();
//		for (int i = 0; i < nroZonas; i++) {
//			EspacioDep zona = a.eli();
//			String idZona = zona.getIDZona();
//			String nomZona = zona.getNom();
//			temperaturas_registradas(idZona,b,nomZona);
//			a.adi(zona);
//		}
//		
//	}
//	private static void temperaturas_registradas(String idZona, MC_CircularActividad b, String nomZona) {
//		PilaTemperatura aux = new PilaTemperatura();
//		int norP = b.Nropilas();
//		System.out.println("------EN LA ZONA DE "+nomZona+"----");
//		
//		for (int i = 0; i < norP; i++) {
//			int cont = 0;
//			while (!b.esvacia(i)) {
//				Actividad elem = b.eliminar(i);
//				if (elem.getIdZona().equals(idZona)) {
//					cont++;
//				}
//				aux.adi(elem);
//			}
//			String mes = segun_mes(i);
//			System.out.println("La catidad de tempertauras rgitradas en  "+mes+" tiene "+cont);
//			b.vaciar(i, aux);
//		}
//		
//	}
//	//c)
//	private static void mostrar_Fechas_temperturas_bajo0(ColaCircularActividad a, MC_CircularActividad b, 
//			String fecha) {
//		int nroZonas = a.nroElem();
//		ColaCircularActividad aux = new ColaCircularActividad();
//		for (int i = 0; i < nroZonas; i++) {
//			EspacioDep zona = a.eli();
//			String idZona = zona.getIDZona();
//			if (Fecha_y_Temp_cero(b,idZona,fecha)) {
//				System.out.println("La zona de "+zona.getNom()+" en la fecha "+fecha+" se tuvo "
//						+ "una temperatura bajo 0");
//			}
//			a.adi(zona);
//			
//		}
//		
//	}
//
//	private static boolean Fecha_y_Temp_cero(MC_CircularActividad b, String idZona, String fecha) {
//		PilaTemperatura aux = new PilaTemperatura();
//		boolean sw = false;
//		int n = b.Nropilas();
//		for (int i = 0; i < n; i++) {
//			while (!b.esvacia(i)) {
//				Actividad temp = b.eliminar(i);
//				if (temp.getIdZona().equals(idZona)) {
//					if (temp.getFecha().equals(fecha)) {
//						if (temp.getTemperatura()<0) {
//							sw=true;
//						}
//					}
//				}
//				aux.adi(temp);
//			}
//			b.vaciar(i, aux);
//			if (sw) {
//				return true;
//			}
//			
//		}
//		return sw;
//	}
//	//b)
//	private static int zona_tempertura_mayor_a_cero(ColaCircularActividad a, MC_CircularActividad b,int tempX) {
//		int nrZonas = a.nroElem();
//		int cntZona = 0;
//		for (int i = 1; i <= nrZonas; i++) {
//			EspacioDep zonax = a.eli();
//			String idZona = zonax.getIDZona();
//			
//			if(buscarTemp(b,tempX,idZona)) { 
//				cntZona ++;  				  
//			}
//			a.adi(zonax);
//		}
//		return cntZona;
//	}
//	private static boolean buscarTemp(MC_CircularActividad b, int tempX, String idZona) {
//		PilaTemperatura auxTem = new PilaTemperatura();
//		boolean sw = false;
//		int n = b.Nropilas();
//		for (int i = 0; i < n; i++) {
//			while(!b.esvacia(i) && sw == false) {
//				Actividad t = b.eliminar(i);
//				if(t.getIdZona().equals(idZona)) {
//					if(t.getTemperatura() >= tempX)
//						sw = true;
//				}
//				auxTem.adi(t);
//			}
//			b.vaciar(i,auxTem);
//			if(sw) {
//				return true;
//			}
//		}
//		return sw;
//	}
//
//	//a)
//	private static void temperaturas_bajo_0(ColaCircularActividad a, MC_CircularActividad b, String zonaX) {
//		String idZona = buscarIDZonaNom(a,zonaX);
//		PilaTemperatura aux = new PilaTemperatura();
//		int nP = b.Nropilas();
//		boolean sw= false,swmes=false;
//		for (int i = 0; i < nP; i++) {
//			String mes = segun_mes(i);
//			System.out.println("\t*****En el mes de "+mes+"****");
//			while (!b.esvacia(i)) {
//				Actividad elem = b.eliminar(i);
//				
//				if (elem.getIdZona().equals(idZona)) {
//					
//					int temZona = elem.getTemperatura();
//					if (temZona < 0) {
//						System.out.println("De la Zona "+zonaX+" la temperatura = "+temZona);
//						sw=true;
//					}
//				}
//				aux.adi(elem);
//			}
//			b.vaciar(i, aux);
//		}
//		if (sw==false) {
//			System.out.println("NO SE ENCONTRARON TEMPERATURAS BAJO 0 GRADOS :");
//		}
//		
//		
//	}
//
//	private static String segun_mes(int i) {
//	    String mes = "";
//	    switch(i) {
//	        case 0:
//	            mes = "Enero";
//	            break;
//	        case 1:
//	            mes = "Febrero";
//	            break;
//	        case 2:
//	            mes = "Marzo";
//	            break;
//	        case 3:
//	            mes = "Abril";
//	            break;
//	        case 4:
//	            mes = "Mayo";
//	            break;
//	        case 5:
//	            mes = "Junio";
//	            break;
//	        case 6:
//	            mes = "Julio";
//	            break;
//	        case 7:
//	            mes = "Agosto";
//	            break;
//	        case 8:
//	            mes = "Septiembre";
//	            break;
//	        case 9:
//	            mes = "Octubre";
//	            break;
//	        case 10:
//	            mes = "Noviembre";
//	            break;
//	        case 11:
//	            mes = "Diciembre";
//	            break;
//	    }
//	    return mes;
//	}
//
//	private static String buscarIDZonaNom(ColaCircularActividad a,String zonaX) {
//		ColaCircularActividad aux = new ColaCircularActividad();
//		String idZonaX="";
//		while (!a.esVacia()) {
//			EspacioDep elem = a.eli();
//			if (elem.getNom().equals(zonaX)) {
//				idZonaX=elem.getIDZona();
//			}
//			aux.adi(elem);
//		}
//		a.vaciar(aux);
//		return idZonaX;
//	}

}
