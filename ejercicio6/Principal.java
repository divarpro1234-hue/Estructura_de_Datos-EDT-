import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
			Idioma i1 = new Idioma("espaniol", 12323);
			Idioma i2 = new Idioma("ingles", 190010);
			Idioma i3 = new Idioma("chino", 1922200);
			LS_NormalI li1 = new LS_NormalI();
			li1.adiFinal(i1);
			li1.adiFinal(i2);
			li1.adiFinal(i3);
			
			li1.mostrar();
			
			Idioma i4 = new Idioma("frances", 19668);
			Idioma i5 = new Idioma("aymara", 199665);
			Idioma i6 = new Idioma("portugues", 1978854);
			LS_NormalI li2 = new LS_NormalI();
			li2.adiFinal(i4);
			li2.adiFinal(i5);
			li2.adiFinal(i6);
			
			Pais p1 = new Pais("bracil", i1);
			Pais p2 = new Pais("peru", i3);
			Pais p3 = new Pais("eeuu", i3);
			Pais p4 = new Pais("china", i4);
			Pais p5 = new Pais("francia", i5);
			LS_CircularP lp1 = new LS_CircularP();
			lp1.adiFinal(p1);
			lp1.adiFinal(p2);
			lp1.adiFinal(p3);
			lp1.adiFinal(p4);
			lp1.adiFinal(p5);
			lp1.mostrar();	
		System.out.println();
		System.out.println("Mostrar los países que tienen como "
				+ "idioma oficial la lengua i-ésima de la lista.");
		mostrarPaisesConIdioma(li1,lp1,2);
	}
	static void mostrarPaisesConIdioma(LS_NormalI li1, LS_CircularP lp1, int i) {
	    
	    NodoI R = li1.getP();
	    int p = 0;
	    Idioma z = null;
	    while (R != null) {
	        if (p == i) {
	            z = R.getIdioma();
	            break;
	        }
	        R = R.getSig();
	        p++;
	    }
	    if (z == null) {
	        System.out.println("no se encotro idioma");
	        return;
	    }
	    NodoP S = lp1.getP();
	    boolean sw = false;
	    do {
	        Pais y = S.getPais();
	        if (y.getIdiomaOf().equals(z)) {
	            System.out.println(y.getPais());
	            sw = true;
	        }
	        S = S.getSig();
	    } while (S != lp1.getP());
	}

}