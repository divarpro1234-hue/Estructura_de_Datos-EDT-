import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		//datos de la pila tratamiento
//		System.out.println("\n\testructura de datos pila");
		Paciente p1 = new Paciente("pepe", 18, 41, 1);
		Paciente p2 = new Paciente("pepe", 18, 41, 1);
		Paciente p3 = new Paciente("pepe", 18, 41, 1);
//		Paciente p4 = new Paciente();
//		p4.leer();
//		Tratamiento t1 = new Tratamiento("12/10/12", "medicamentos", p1);
//		Tratamiento t2 = new Tratamiento("12/10/12", "medicamentos", p2);
//		Tratamiento t3 = new Tratamiento("12/10/12", "medicamentos", p4);
//		PilaTratamiento pt1 = new PilaTratamiento();
//		pt1.adi(t1);
//		pt1.adi(t2);
//		pt1.adi(t3);
//		pt1.mostrar();
//		
//		//datos de la cola Prioridad
//		System.out.println("\n\testructura de datos cola Simple");
//		System.out.println("\ndatos de la cola Prioridad");
//		ColaSimplePrioridad c1 = new ColaSimplePrioridad();
//		c1.adi(p1);
//		c1.adi(p2);
//		c1.adi(p3);
//		c1.mostrar();
//		
//		//datos de la lista medico
//		System.out.println("\n\testructura de datos lista simple normal medico");
//		Medico m1 = new Medico("auxi lucho", "cardiologo", "ocupado", p1);
//		Medico m2 = new Medico("auxi lucho", "urologo", "libre", p2);
//		Medico m3 = new Medico("auxi lucho", "enfermero", "ocupado", p3);
//		LS_NormalM lm1 = new LS_NormalM();
//		lm1.adiFinal(m1);
//		lm1.adiFinal(m2);
//		lm1.adiFinal(m3);
//		lm1.mostrar();
//		
//		//datos de la lista registro salud
//		System.out.println("\n\testructura de datos lista simple normal Registro salud");
//		RegistroSalud rs1 = new RegistroSalud(p1, "12/06/24", "6 grados", "270 rpm","80%");
//		RegistroSalud rs2 = new RegistroSalud(p2, "12/06/24", "8 grados", "200 rpm","120%");
//		RegistroSalud rs3 = new RegistroSalud(p3, "12/06/24", "9 grados", "300 rpm","20%");
//		LS_NormalRS lrs1 = new LS_NormalRS();
//		lrs1.adiFinal(rs1);
//		lrs1.adiFinal(rs2);
//		lrs1.adiFinal(rs3);
//		lrs1.mostrar();
//		
//		
//		//datos de la lista recurso Medico
//		System.out.println("\n\testructura de datos lista doble normal Recurso Medico");
//		RecursoMedico rm1 = new RecursoMedico("tanke de oxigeno", p1, 12);
//		RecursoMedico rm2 = new RecursoMedico("tanke de oxigeno", p2, 12);
//		RecursoMedico rm3 = new RecursoMedico("tanke de oxigeno", p3, 12);
//		LD_NormalRM lrm1 = new LD_NormalRM();
//		lrm1.adiFinal(rm1);
//		lrm1.adiFinal(rm2);
//		lrm1.adiFinal(rm3);
//		lrm1.mostrar();
//		
//		
		//PROBLEMA 5 - ASIGNAR PACIENTE Y MEDICOS DISPONIBLES	
		
				//lista medico
				Medico me1 = new Medico("Dr. Roberto", "Cardiologo", "Libre", null);
		        Medico me2 = new Medico("Dr. Lucho", "Urologo", "Libre", null);
		        Medico me3 = new Medico("Dr. Miguel", "Cirujano", "Libre", null);
				
		        LS_NormalM lm = new LS_NormalM();
		        lm.adiFinal(me1);
		        lm.adiFinal(me2);
		        lm.adiFinal(me3);

		        System.out.println("----------ASIGNACIONES DE PACIENTES----------");
		        me1.asignarPaciente(p1); // Dr Roberto toma a Juan
		        me3.asignarPaciente(p2); // Dr Miguel toma a Marcela
		        
		        System.out.println("\n----------REGISTRO MEDICO----------");
		        lm.mostrar();

		        System.out.println("\n----------MEDICOS DISPONIBLES----------");
		        lm.verificarDisponibilidad();
	
	}
}