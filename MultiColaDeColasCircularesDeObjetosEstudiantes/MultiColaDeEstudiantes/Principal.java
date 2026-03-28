package MultiColaDeEstudiantes;

public class Principal {

	public static void main(String[] args) {
		ColaCircularEstudiante a = new ColaCircularEstudiante();
		
		Estudiante a1 = new Estudiante("marca", "info");
		a.adi(a1);
		
		ColaCircularEstudiante b = new ColaCircularEstudiante();
		
		Estudiante b1 = new Estudiante("sonia", "info");
		Estudiante b2 = new Estudiante("lucia", "fis");
		Estudiante b3 = new Estudiante("juan", "info");
		Estudiante b4 = new Estudiante("marco", "est");
		b.adi(b1);
		b.adi(b2);
		b.adi(b3);
		b.adi(b4);
		
		ColaCircularEstudiante c =  new ColaCircularEstudiante();
		
		Estudiante c1 = new Estudiante("juan", "info");
		Estudiante c2 = new Estudiante("rodrigo", "info");
		Estudiante c3 = new Estudiante("ana", "info");
		
		c.adi(c1);
		c.adi(c2);
		c.adi(c3);
		
		ColaCircularEstudiante d = new ColaCircularEstudiante();
		
		Estudiante d1 = new Estudiante("diego", "info");
		d.adi(d1);
		
		
		ColaCircularEstudiante e = new ColaCircularEstudiante();
		Estudiante e1 = new Estudiante("ruben", "info");
		Estudiante e2 = new Estudiante("alvaro", "est");
		
		e.adi(e1);
		e.adi(e2);
		
		//multicola simple de objetos estudiante
		Mp_ColaCircularEstudiante z = new Mp_ColaCircularEstudiante(5);
		System.out.println("\tMulticola circular de objetos estudiante:");
		z.vaciar(0, a);
		z.vaciar(1, b);
		z.vaciar(2, c);
		z.vaciar(3, d);
		z.vaciar(4, e);
		z.mostrar();
	}
}
