
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaSimpleP A = new ColaSimpleP();
		A.adi(new Persona("juan", 21));
		A.adi(new Persona("pedro", 18));
		A.adi(new Persona("alan", 17));
		A.adi(new Persona("saul", 19));
		A.adi(new Persona("luis", 20));
		A.mostrar();
		
		System.out.println("\nmayor edad");
		System.out.println(mayorEdad(A));
	}

	private static int mayorEdad(ColaSimpleP a) {
		// TODO Auto-generated method stub
		if(!a.esVacia()) {
			Persona q = a.eli();
			int may = mayorEdad(a);
			if(may > q.getEdad()) {
				return may;
			}else {
				return q.getEdad();
			}
		}else {
			return 0;
		}
	}
}