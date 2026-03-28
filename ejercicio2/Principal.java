import java.util.Iterator;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		

		LS_NormalP A = new LS_NormalP();
		A.adiFinal(new Pelicula("orgullo y prejuicio", "jane austen", 1.36));
		A.adiFinal(new Pelicula("ted", "pablo", 1.46));
		A.adiFinal(new Pelicula("sherk", "jhamil", 1.42));
		A.adiFinal(new Pelicula("coco", "pablo", 1.46));
		A.adiFinal(new Pelicula("la la land", "damien", 1.50));
		
		A.mostrar();
		
		//c)
		System.out.println();
		System.out.println("c) peliculas con duracion mayor a 1.20 min");
		System.out.println("las peliculas con duracion mayor a 1.20 min son: "+contarPeliculas(A));
	}

	static int contarPeliculas(LS_NormalP a) {
		// TODO Auto-generated method stub
		NodoP R = a.getP();
		int c = 0;
		while(R!=null) {
			if(R.getPelicula().getDuracion() > 1.20) {
				c++;
			}
			R = R.getSig();
		}
		return c;
	}
	
}