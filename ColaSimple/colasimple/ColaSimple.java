/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasimple;

/**
 *
 * @author inafh
 */
public class ColaSimple {

    public static void main(String[] args) {
        ColaSimpleAli A = new ColaSimpleAli();
        
        A.adi(new Alienigena("Marco", 9, "Marte"));
        A.adi(new Alienigena("Zog", 5, "Jupiter"));
        A.adi(new Alienigena("Xyra", 12, "Marte"));
        A.adi(new Alienigena("Blorg", 7, "Saturno"));
        A.adi(new Alienigena("Trix", 15, "Saturno"));
        A.adi(new Alienigena("Vork", 3, "Jupiter"));
        A.adi(new Alienigena("Glip", 8, "Tierra"));
        A.adi(new Alienigena("Zyn", 11, "Tierra"));
        A.adi(new Alienigena("Mektar", 6, "Saturno"));
        A.adi(new Alienigena("Oplon", 10, "Tierra"));

        A.mostrar();
        
        System.out.println();// b)
        System.out.println("los asistentes del planeta "
        		+ "tierra son: "+contarAsistentesPlaneta(A,"tierra"));   
//        A.mostrar();
        
        System.out.println();// c)
        System.out.println("\neliminar a los que pidieron mas de 8 platillos");
        System.out.println();
        eliminarComelones(A);
        A.mostrar();
    }
    private static void eliminarComelones(ColaSimpleAli a) {
		// TODO Auto-generated method stub
		ColaSimpleAli aux1 = new ColaSimpleAli();
		ColaSimpleAli aux2 = new ColaSimpleAli();
		while(!a.esvacia()) {
			Alienigena z = a.eli();
			if(z.getCantPla() > 8) {
				aux1.adi(z);
			}else {
				aux2.adi(z);
			}
		}
		a.vaciar(aux2);
	}
	static int contarAsistentesPlaneta(ColaSimpleAli a, String string) {
		// TODO Auto-generated method stub
		ColaSimpleAli aux = new ColaSimpleAli();
		int cnt = 0;
		while(!a.esvacia()) {
			Alienigena z = a.eli();
			if(z.getPlaneta().equalsIgnoreCase(string)) {
				cnt++;
			}
			aux.adi(z);
		}
		a.vaciar(aux);
//		System.out.println("asistentes del planeta "+string+" son "+cnt);
		return cnt;
	}
//	public static void verifica(ColaSimpleAli A) {
//    	ColaSimpleAli aux = new ColaSimpleAli();
//    	boolean sw = false;
//    }
//    
}
