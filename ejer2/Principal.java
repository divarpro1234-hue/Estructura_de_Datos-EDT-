
public class Principal {

	public static void main(String[] args) {
		Especialidad e1 = new Especialidad("uro", 2);
		Doctor d1 = new Doctor("davo", e1, 12);
		PilaPaciente z = new PilaPaciente();
		Paciente t1 = new Paciente("sonia", 9789, d1, e1);
		
		z.adi(t1);
		z.mostrar();
	}
}
