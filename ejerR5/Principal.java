import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		

		LS_NormalE A = new LS_NormalE();
		A.adiFinal(new Estudiante("flores", "reynoso", "will",20));
		A.adiFinal(new Estudiante("mamani", "quispe", "joel",15));
		A.adiFinal(new Estudiante("peredo", "ticona", "edwin",26));
		A.adiFinal(new Estudiante("callisaya", "chambi", "elias",25));
		
		System.out.println("datos de la lista");
		A.mostrar();
		
		
		System.out.println("\nb) Mostrar el nombre y nota de los estudiantes con apellido paterno X");
		String apx = "mamani";
		System.out.println("\nEstudiantes con apellido paterno " + apx + ":");
        mostrarEstudiantesPorApellido(A.getP(), apx);
	}
	public static void mostrarEstudiantesPorApellido(NodoE R, String apx) {
        if (R == null) {
            return;
        }
        Estudiante x = R.getEstudiante();
        if (x.getPat().equals(apx))	{
            System.out.println("nombre: " + x.getNombre() + ", nota: " + x.getNota());
        }
        mostrarEstudiantesPorApellido(R.getSig(), apx);
    }
	
	
}