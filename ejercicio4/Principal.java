import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		Conductor c1 = new Conductor("saul", 19);
		Conductor c2 = new Conductor("adrian", 20);
		Conductor c3 = new Conductor("joel", 18);
		Conductor c4 = new Conductor("fernando", 20);
		LS_NormalC lc1 = new LS_NormalC();
		lc1.adiFinal(c1);
		lc1.adiFinal(c2);
		lc1.adiFinal(c3);
		lc1.adiFinal(c4);
		lc1.mostrar();
		
		
		Conductor c5 = new Conductor("josue", 22);
		Conductor c6 = new Conductor("daner", 21);
		LS_NormalC lc2 = new LS_NormalC();
		
		lc2.adiFinal(c5);
		lc2.adiFinal(c6);
		
		Vehiculo v1 = new Vehiculo("d", "sdf", "df", c1);
		Vehiculo v2 = new Vehiculo("dfg", "dfg", "dfg", c1);
		Vehiculo v3 = new Vehiculo("dfg", "dg", "dfg", c3);
		Vehiculo v4 = new Vehiculo("dfg", "dfgd", "dfgd", c4);
		LS_NormalV lv1 = new LS_NormalV();
		lv1.adiFinal(v1);
		lv1.adiFinal(v2);
		lv1.adiFinal(v3);
		lv1.adiFinal(v4);
		
		lv1.mostrar();
		System.out.println();
		System.out.println("Mostrar el Conductor con mayor número de Vehículos");
		mostrarConductorConMasVehiculos(lc1,lv1);
	}
	public static void mostrarConductorConMasVehiculos(LS_NormalC lc, LS_NormalV lv) {
		NodoC R = lc.getP();
	    Conductor mayorConductor = null;
	    int maxV = 0;
	    while (R != null) {
	        Conductor x = R.getConductor();
	        int cntV = 0;
	        NodoV S = lv.getP(); 
	        while (S != null) {
	            Vehiculo y = S.getVehiculo();
	            if (y.getNombreCon() == x) {
	                cntV++;
	            }
	            S = S.getSig(); 
	        }
	        if (cntV > maxV) {
	            maxV = cntV;
	            mayorConductor = x;
	        }
	        R = R.getSig(); 
	    }
	    if (mayorConductor != null) {
		        System.out.println("Nombre: " + mayorConductor.getNombre());
		        System.out.println("Edad: " + mayorConductor.getEdad());
	    } else {
	        System.out.println("No hay conductores o vehículos en la lista");
	    }
	}

}