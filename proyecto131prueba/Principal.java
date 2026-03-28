//Lic Aruquipa Marcelo
public class Principal {

	public static void main(String[] args) {
		
	main{
		String idx = "8552101";
		verificaPacienteXHistorialDiagnostico(A, idx);
	}
	verificaPacienteXHistorialDiagnostico(LD_NormalH a, String idx){
		NodoH R = a.getP();
		boolean sw = false;
		while(R != null) {
			Historial x = R.getH();
			LD_NormalD ld = x.getLd();
			if(x.getId_paciente() == idx) {
				if(ld.nroNodos() > 1) {
					System.out.println("idx tiene mas de un diagnostico ");
					sw = true;
					break;
				}
					
			}
			R = R.getSig();
		}
		if(!sw) {
			System.out.println("idx no encontrado");
		}
		
	}
	
	
	
	main{
		String nomx = "saul";
		eliminarUltimoDiagnosticoPacienteX(A,B,nomx);
	}
	eliminarUltimoDiagnosticoPacienteX(LD_NormalP a, LD_NormalH b, String nomx){
		NodoP R = a.getP();
		String idP = "";
		while(R != null) {
			Paciente x = R.getP();
			if(x.getNombre() == nomx) {
				idP = x.getId_paciente();
			}
			R = R.getSig();
		}
		
		NodoH S = b.getP();
		while(R != null) {
			Historial y = R.getH();
			
			if(y.getId_paciente() == idP) {
				b.eliFinal();
			}
			R = R.getSig();
		}
	}
	
	
	main{
		String espeX = "cardiologia";
		consultorioEspXLlevarOtroConsultorio(A,espeX);
	}
	consultorioEspXLlevarOtroConsultorio(ColaSimpleC A,espeX){
		ColaSimpleC aux1 = new colaSimpleC();
		boolean sw = false;
		while(!A.esVacia()) {
			Consultorio x = A.eli();
			
			ColaSimpleIn cing = x.getCin();
			ColaSimpleIn aux2 = new colaSimpleIn();
			ColaSimpleIn aux3 = new colaSimpleIn();
			if(x.getEspecialidad() == espeX) {
				int cnt = 0;
				if(cing.nroElem() > 5) {
					for (int i = 1; i <= 5; i++) {
						PacienteEnEspera y = cing.eli();
						aux2.adi(y);
					}
					while(!cing.esVacia()) {
						PacienteEnEspera z = cing.eli();
						aux3.adi(z);
					}
					cing.vaciar(aux2);
				}
			}
			ColaSimpleC aux4 = new colaSimpleC();
			while(!A.esVacia()) {
				Consultorio d = A.eli();
				ColaSimpleIn ci = d.getCin();
				if(d.getEspecialidad() == espeX) {
					sw = true;
					ci.vaciar(aux3);
				}
				aux4.adi(d);
			}
			A.vaciar(aux4);
			aux1.adi(x);
	 	}
		A.vaciar(aux1);
		if(!sw) {
			System.out.println("no existe consultorioX");
		}
		
	}
	
}













