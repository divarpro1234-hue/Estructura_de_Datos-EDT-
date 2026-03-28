
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaSimpleEstudiante a = new ColaSimpleEstudiante();
		
		Estudiante a1 = new Estudiante("marca", "info");
		a.adi(a1);
		
		ColaSimpleEstudiante b = new ColaSimpleEstudiante();
		
		Estudiante b1 = new Estudiante("sonia", "info");
		Estudiante b2 = new Estudiante("lucia", "fis");
		Estudiante b3 = new Estudiante("juan", "info");
		Estudiante b4 = new Estudiante("marco", "est");
		b.adi(b1);
		b.adi(b2);
		b.adi(b3);
		b.adi(b4);
		
		ColaSimpleEstudiante c =  new ColaSimpleEstudiante();
		
		Estudiante c1 = new Estudiante("juan", "info");
		Estudiante c2 = new Estudiante("rodrigo", "info");
		Estudiante c3 = new Estudiante("ana", "info");
		
		c.adi(c1);
		c.adi(c2);
		c.adi(c3);
		
		ColaSimpleEstudiante d = new ColaSimpleEstudiante();
		
		Estudiante d1 = new Estudiante("diego", "info");
		d.adi(d1);
		
		
		ColaSimpleEstudiante e = new ColaSimpleEstudiante();
		Estudiante e1 = new Estudiante("ruben", "info");
		Estudiante e2 = new Estudiante("alvaro", "est");
		
		e.adi(e1);
		e.adi(e2);
		
		//multicola simple de objetos estudiante
		Mp_ColaSimpleEstudiante z = new Mp_ColaSimpleEstudiante(5);
		System.out.println("\tMulticola simple de objetos estudiante:");
		z.vaciar(0, a);
		z.vaciar(1, b);
		z.vaciar(2, c);
		z.vaciar(3, d);
		z.vaciar(4, e);
		z.mostrar();
		
	}

}
