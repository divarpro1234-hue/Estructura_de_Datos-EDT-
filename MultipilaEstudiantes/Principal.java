
public class Principal {

	public static void main(String[] args) {
		
		PilaEstudiante z = new PilaEstudiante();
		Estudiante t1 = new Estudiante("sonia", "info");
		Estudiante t2 = new Estudiante("lucia", "fis");
		Estudiante t3 = new Estudiante("juan", "info");
		Estudiante t4 = new Estudiante("marco", "est");
		z.adi(t2);
		z.adi(t1);
		z.adi(t3);
		z.adi(t4);
		
		//z.mostrar();
		
		PilaEstudiante w =  new PilaEstudiante();
		Estudiante x1 = new Estudiante("alan", "mate");
//		Estudiante x1 = new Estudiante("orlando", "inf-111");
//		Estudiante x2 = new Estudiante("luis", "inf-121");
//		Estudiante x3 = new Estudiante("elba", "inf-131");
		
		w.adi(x1);
//		w.adi(x2);
//		w.adi(x3);
//			
//		w.mostrar();
		
		PilaEstudiante x = new PilaEstudiante();
		Estudiante a2 = new Estudiante("juan", "info");
		Estudiante a3 = new Estudiante("rodrigo", "info");
		Estudiante a4 = new Estudiante("ana", "info");
		
		x.adi(a2);
		x.adi(a3);
		x.adi(a4);
		
		PilaEstudiante y = new PilaEstudiante();
		Estudiante b1 = new Estudiante("diego", "info");
		
		y.adi(b1);
		
		
		PilaEstudiante v = new PilaEstudiante();
		Estudiante c1 = new Estudiante("ruben", "info");
		Estudiante c2 = new Estudiante("alvaro", "est");
		
		v.adi(c1);
		v.adi(c2);
		Mp_PilaEstudiante b = new Mp_PilaEstudiante(5);
		System.out.println("\tMultipila de objetos estudiante:");
		b.vaciar(0, w);
		b.vaciar(1, z);
		b.vaciar(2, x);
		b.vaciar(3, y);
		b.vaciar(4, v);
		//mostrar datos de la multipila
		b.mostrar();
 		
		
		//EJEMPLOS
		//1. dado una multipila de objetps estudiante con n pilas, determinar
		//el nro de estudiantes que llevan la materia de info
//		String materiax = "fis";
		
//		int nroEstMat = nroEstMatera(b, materiax);  //se ha usado una funcion!!
//		System.out.println("nro de estudiantes que llevar la materia " +materiax+ " = " + nroEstMat);
		
		//2. llevar al principio de cada pila a los estudiantes de la materiax
		
//		System.out.println("\nllevar al principio de cada pila los estudiantes que llevan la materia "+ materiax);
//		llevarPrincipioMateria(b, materiax);
	//	b.mostrar();
		
		
		
//		Mp_PilaEstudiante A = new Mp_PilaEstudiante();
//		A.llenar(2);
//		A.mostrar();
		
		// eliminar un elemento de la pila que ocupa la 
		//posicion 1
//		Estudiante x = A.eliminar(1);
//		x.mostrar();
//		A.mostrar(1);
//		System.out.println();
//		A.mostrar();
		
		//tarea 10:  
		//a. crear una multipila de objetos estudiante con pilas predefinidas
		//b. mostrar la multipla
		
		//TAREA:
		
		
		//implementar una multicola de colas simples de objetos estudiantes
		
		
		//implementar una multicola de colas circulares de objetos estudiantes
		
		//el sabado 16 a hrs 23:59
		
		
		
	}

	static void llevarPrincipioMateria(Mp_PilaEstudiante mp, String materiax) {
		// TODO Auto-generated method stub
		PilaEstudiante aux1 = new PilaEstudiante();
		PilaEstudiante aux2 = new PilaEstudiante();
		
		for (int i = 0; i < mp.getN(); i++) {
			while(!mp.esVacia(i)) {
				Estudiante x = mp.eliminar(i);
				if(x.getMateria().equals(materiax))
					aux1.adi(x);
				else
					aux2.adi(x);
			}
			mp.vaciar(i, aux1);
			mp.vaciar(i, aux2);
		}
	}

	static int nroEstMatera(Mp_PilaEstudiante mp, String materiax) {
		// TODO Auto-generated method stub
		PilaEstudiante aux = new PilaEstudiante();
		int cnt = 0;
		for (int i = 0; i < mp.getN(); i++) {
			while(!mp.esVacia(i)) 
			{
				Estudiante x = mp.eliminar(i);
				aux.adi(x);
				
				if(x.getMateria().equals(materiax))
					cnt++;
			}
			mp.vaciar(i, aux);
		}
		return cnt;
	}
	
}
