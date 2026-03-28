//Lic. Marcelo Aruquipa
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB_Buqueda abb = new AB_Buqueda();
		abb.crear1();
		System.out.println(abb.buscar(60));
		System.out.println(abb.buscar(14));
		
		
		System.out.println("a) Muestra al menor número del árbol");
		abb.mostrarMenor();
		
		System.out.println("b) Verifica si existe el numero X en el árbol.\r\n"
				+ "");
		abb.verificaExisteNum(abb.getRaiz(), 6);
		
		System.out.println("c) Cuenta cuantos números menores al número de la raíz hay");
		abb.contarCuantosNumeros(abb.getRaiz());
		
		System.out.println("d) Calcular el promedio de los números.");
		abb.calcularPromedio();
	}

}
