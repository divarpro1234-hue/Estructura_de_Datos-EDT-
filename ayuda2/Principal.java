

public class Principal {
	public static void main(String[] args) {
		//datos de la pila tratamiento
		System.out.println("datos pila");
        //problema 1 prioridad
                System.out.println("****------------CLASIFICACION DE PRIORIDAD-----------************");
        System.out.println("ATENCION INMEDIATA= 1");
        System.out.println("ATENCION INTERMEDIA= 2");
        System.out.println("ATENCION MENOR= 3");       
         ListaPaciente listaPaciente = new ListaPaciente();             
        // Agregar pacientes
        
        System.out.println("--- AGREGAR PACIENTES ---");
        Paciente.agregarPacientes(listaPaciente);
     
        System.out.println("****------------Lista de los pacientes:-----------************");
		Paciente p1 = new Paciente("Juan", 18, 41, 1);
		Paciente p2 = new Paciente("Danis", 28, 41, 1);
		Paciente p3 = new Paciente("Marcela", 23, 41, 1);
        Paciente p4 = new Paciente();
        p4.leer();
        listaPaciente.mostrar();
                    p1.mostrar();
                    p2.mostrar();
                    p3.mostrar();
                    p4.mostrar();
          System.out.println("****------------PROBLEMA 1 DESIGNAR PRIORIDAD A LOS PACIENTES-----------************");      
/// FIN DEL PROBLEMA 1        
//PROBLEMA 2 REGISTRO DE SALUD

            LS_NormalRS listaRegistros = new LS_NormalRS();

        // Agregar registros iniciales
        listaRegistros.adiFinal(new RegistroSalud(p1, "12/06/2024", "36", "72", "98%"));
        listaRegistros.adiFinal(new RegistroSalud(p2, "13/06/2024", "37", "75", "97%"));
        listaRegistros.adiFinal(new RegistroSalud(p3, "14/06/2024", "38", "80", "96%"));
         
        
        // Agregar un registro manual ingresado por el usuario
        System.out.println("****------------AGREGAR REGISTRO DE SALUD MANUALMENTE-----------************");
        RegistroSalud registroManual = new RegistroSalud(p1 ,"", "", "", "");
        registroManual.leer();  // Leer datos del usuario
        
        listaRegistros.adiFinal(registroManual);

        // Mostrar todos los registros de salud
        System.out.println("\n****------------Lista de Registros de Salud de los Pacientes:-----------************");
        listaRegistros.mostrar();
       listaPaciente.mostrar();

//// FIN DEL PROBLEMA 2 
///problema 3 asignar recurso
		//datos de la lista recurso Medico
		System.out.println("PROBLEMA 3 ASIGNAR RECURSOS A LOS PACIENTES");
		RecursoMedico rm1 = new RecursoMedico("cama hospitalaria", p1, 12);
		RecursoMedico rm2 = new RecursoMedico("tanquee de oxigeno", p2, 12);
		RecursoMedico rm3 = new RecursoMedico("suero ", p3, 12);
        RecursoMedico rm4 = new RecursoMedico("ventilador electrico ", p4, 12);
                
		LD_NormalRM lrm1 = new LD_NormalRM();
		lrm1.adiFinal(rm1);
		lrm1.adiFinal(rm2);
		lrm1.adiFinal(rm3);
                lrm1.adiFinal(rm4);
		lrm1.mostrar();
                      listaPaciente.mostrar();
 
                
		Tratamiento t1 = new Tratamiento("12/10/12", "medicamentos", p1);
		Tratamiento t2 = new Tratamiento("12/10/12", "quirurgico", p2);
		Tratamiento t3 = new Tratamiento("12/10/12", "fisiterapia", p3);
		PilaTratamiento pt1 = new PilaTratamiento();
		pt1.adi(t1);
		pt1.adi(t2);
		pt1.adi(t3);
		pt1.mostrar();
		
		//datos de la cola Prioridad
		System.out.println("\n\testructura de datos cola Simple");
		System.out.println("\ndatos de la cola Prioridad");
		ColaSimplePrioridad c1 = new ColaSimplePrioridad();
		c1.adi(p1);
		c1.adi(p2);
		c1.adi(p3);
		c1.mostrar();
		
		//datos de la lista medico
		System.out.println("\n\testructura de datos lista simple normal medico");
		Medico m1 = new Medico("Dr Roberto", "cardiologo", "ocupado", p1);
		Medico m2 = new Medico("Dr lucho", "urologo", "libre", p2);
		Medico m3 = new Medico("Dr lucho", "enfermero", "ocupado", p3);
		LS_NormalM lm1 = new LS_NormalM();
		lm1.adiFinal(m1);
		lm1.adiFinal(m2);
		lm1.adiFinal(m3);
		lm1.mostrar();
		
		//datos de la lista registro salud
		//System.out.println("\n\testructura de datos lista simple normal Registro salud");
		//RegistroSalud rs1 = new RegistroSalud(p1, "12/06/24", "6 grados", "270 rpm","80%");
		//RegistroSalud rs2 = new RegistroSalud(p2, "12/06/24", "8 grados", "200 rpm","120%");
		//RegistroSalud rs3 = new RegistroSalud(p3, "12/06/24", "9 grados", "300 rpm","20%");
		//LS_NormalRS lrs1 = new LS_NormalRS();
		//lrs1.adiFinal(rs1);
		//lrs1.adiFinal(rs2);
		//lrs1.adiFinal(rs3);
		//lrs1.mostrar();
	}
	
	
}