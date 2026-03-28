package Clases;
//Lic Aruquipa Marcelo

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Clinica c1 = new Clinica();
        System.out.println("\n\tCLINICA DE PACIENTES");
        c1.llenar();
        //c1.mostrar();

        System.out.println("--------------------------------------");
        System.out.println("\n\tLISTA DE PROBLEMAS A RESOLVER");
        /*
		System.out.println("1. Verificar si el paciente con idX tiene en su historial más de un diagnostico");
		
		String idx = "000012";
		verificaPacienteXHistorialDiagnostico(c1.getLh(),idx);
		
		System.out.println("2 De los pacientes con sintomasX modificar el tratamiento a “Fisioterapia”");
		
		String SintomaX = "dolor de muñeca";
		modificarTratamiento(c1.getLh(), SintomaX);
		
		System.out.println("3 Mostrar el nombre y especialidad de los doctores que atendieron al paciente con ciX");
		String ciX = "6645215";
		mostrarDoctorPacienteX(c1.getPm(),c1.getLp(),c1.getLh(),ciX);
		*/
		System.out.println("\n4 El paciente con idX que esta en la cola de espera del "
				+ "consultorio con idY tiene que ser atendido de emergencia, llevarlo al "
				+ "principio de la cola de espera");
		
		String idPacienteEnEsperaX = "00053";
		String idConsultorioY = "0042";
                c1.getCc().mostrar();
                System.out.println("----------------------------------------------------------");
		pacienteEmergenciaMover(c1.getCc(), idPacienteEnEsperaX, idConsultorioY);
		c1.getCc().mostrar();
        /*
        System.out.println("\n5 Sea el consultorio con especialidadX, si su cola Ingreso tiene mas de 5 pacientes\r"
                + "llevar al resto a otro consultorio con la misma especialidad si no lo hay mostrar\r"
                + "'Solo existe un consultorio con la especialiadaX");
        String especialidadX = "traumatologo";
        RedirigirExcesoDePacientes(c1.getCc(), especialidadX, c1.getPm()); */
    }

    private static void RedirigirExcesoDePacientes(ColaCircularC cc, String especialidadX, PilaM pilaM) {
        ColaCircularC aux1 = new ColaCircularC();
        ColaSimpleIn pacientesExtra = new ColaSimpleIn();
        String idDelConsultorioLleno = "";
        boolean sw = true;

        while (!cc.esVacia()) {
            Consultorio consultorio = cc.eli();
            String idMedico = consultorio.getId_medico();
            PilaM aux2 = new PilaM();
            while (!pilaM.esVacia()) {
                Medico medico = pilaM.eli();
                if (medico.getEspecialidad().equals(especialidadX)
                        && medico.getId_medico().equals(idMedico)) {
                    ColaSimpleIn colaPacientes = consultorio.getCin();
                    ColaSimpleIn aux3 = new ColaSimpleIn();
                    int nroPacientes = colaPacientes.nroElem();
                    if (nroPacientes > 5) {
                        for (int i = 0; i < nroPacientes - 1; i++) {
                            PacienteEnEspera x = colaPacientes.eli();
                            aux3.adi(x);
                        }
                        pacientesExtra.vaciar(colaPacientes);
                        colaPacientes.vaciar(aux3);
                        idDelConsultorioLleno = consultorio.getId_consultorio();

                    }
                }
                aux2.adi(medico);
            }
            pilaM.vaciar(aux2);
            aux1.adi(consultorio);
        }
        cc.vaciar(aux1);

        while (!cc.esVacia()) {
            Consultorio consultorio = cc.eli();

            String idMedico = consultorio.getId_medico();
            if (consultorio.getId_consultorio() != idDelConsultorioLleno) {
                PilaM aux5 = new PilaM();
                while (!pilaM.esVacia()) {
                    Medico medico = pilaM.eli();
                    if (idMedico == medico.getId_medico() && medico.getEspecialidad().equals(especialidadX)) {
                        consultorio.getCin().vaciar(pacientesExtra);
                        sw = false;
                    }
                    aux5.adi(medico);
                }
                pilaM.vaciar(aux5);
            }
            aux1.adi(consultorio);
        }
        cc.vaciar(aux1);

        if (sw) {
            System.out.println("\rSolo existe un consultorio con la especialidad " + especialidadX);
            while (!cc.esVacia()) {
                Consultorio consultorio = cc.eli();
                if (consultorio.getId_consultorio().equals(idDelConsultorioLleno)) {
                    consultorio.getCin().vaciar(pacientesExtra);
                }
            }
        }
        
        //---------------------------------------
        while (!cc.esVacia()) {
            Consultorio cons = cc.eli();
            System.out.println("consul====>" + cons.getId_consultorio());
            PilaM auxi = new PilaM();
            while (!pilaM.esVacia()) {
                Medico medico = pilaM.eli();
                if (cons.getId_medico().equals(medico.getId_medico())) {
                    if (medico.getEspecialidad().equals(especialidadX)) {
                        System.out.println("Medi " + medico.getNombre() + " " + medico.getEspecialidad());
                    }
                }
                auxi.adi(medico);
            }
            pilaM.vaciar(auxi);
            aux1.adi(cons);
        }
        cc.vaciar(aux1);
        //---------------------------------------

    }

    private static void pacienteEmergenciaMover(ColaCircularC cc, String idPacienteEnEsperaX, String idConsultorioY) {
        ColaCircularC aux1 = new ColaCircularC();

        while (!cc.esVacia()) {
            Consultorio cst = cc.eli();
            if (cst.getId_consultorio().equals(idConsultorioY)) {
                ColaSimpleIn colap = cst.getCin();
                ColaSimpleIn aux2 = new ColaSimpleIn();
                ColaSimpleIn aux3 = new ColaSimpleIn();
                while (!colap.esVacia()) {
                    PacienteEnEspera x = colap.eli();
                    if (x.getId_paciente().equals(idPacienteEnEsperaX)) {
                        aux3.adi(x);
                    } else {
                        aux2.adi(x);
                    }
                }
                colap.vaciar(aux3);
                colap.vaciar(aux2);
            }
            aux1.adi(cst);
        }
        cc.vaciar(aux1);
    }

    private static void mostrarDoctorPacienteX(PilaM pm, LD_NormalP lp, LD_NormalH lh, String ciX) {
        NodoP R = lp.getP();
        String idpacientebuscado = "";
        LD_NormalD x = new LD_NormalD();
        System.out.println("Medicos que atendieron la paciente con ci: " + ciX);
        while (R != null) {
            if (R.getP().getCi().equals(ciX)) {
                idpacientebuscado = R.getP().getId_paciente();
            }
            R = R.getSig();
        }

        NodoH S = lh.getP();
        while (S != null) {
            if (S.getH().getId_paciente().equals(idpacientebuscado)) {
                x = S.getH().getLd();
            }
            S = S.getSig();
        }

        NodoD T = x.getP();
        while (T != null) {
            String idMedico = T.getD().getId_medico();
            PilaM aux1 = new PilaM();
            while (!pm.esVacia()) {
                Medico z = pm.eli();
                if (z.getId_medico().equals(idMedico)) {
                    System.out.println("----------------");
                    System.out.println("nombre del medico: " + z.getNombre());
                    System.out.println("especialidad: " + z.getEspecialidad());
                }
                aux1.adi(z);
            }
            pm.vaciar(aux1);
            T = T.getSig();
        }
    }

    private static void modificarTratamiento(LD_NormalH a, String SintomaX) {
        // TODO Auto-generated method stub
        NodoH R = a.getP();
        while (R != null) {
            LD_NormalD ld = R.getH().getLd();
            NodoD S = ld.getP();
            while (S != null) {
                if (S.getD().getSintomas() == SintomaX) {
                    S.getD().setTratamiento("Fisioterapia");
                    System.out.println("modificacion");
                    System.out.println("id_medico: " + S.getD().getId_medico());
                    System.out.println("sintomas: " + S.getD().getSintomas());
                    System.out.println("tratamieno: " + S.getD().getTratamiento());
                }
                S = S.getSig();
            }
            R = R.getSig();
        }

    }

    private static void verificaPacienteXHistorialDiagnostico(LD_NormalH a, String idx) {
        // TODO Auto-generated method stub
        NodoH R = a.getP();
        boolean sw = false;
        while (R != null) {
            Historial x = R.getH();
            LD_NormalD ld = x.getLd();
            ld.mostrar();
            System.out.println("-----------------------------");
            if (x.getId_paciente() == idx) {
                if (ld.nroNodos() > 1) {
                    System.out.println("paciente con id " + idx + " tiene mas de un diagnostico");

                    sw = true;
                    break;
                }
            }
            R = R.getSig();
        }
        if (!sw) {
            System.out.println("paciente con id  " + idx + " no encontrado");
        }

    }

}
