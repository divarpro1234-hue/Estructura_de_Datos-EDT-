import java.util.Scanner;
//Lic. Marcelo Aruquipa
public class AB_Buqueda extends ArbolBinario {
	
    public Nodo getRaiz() {
        return raiz;
    }
//	public void crear(Nodo R) {
//		Scanner lee = new Scanner(System.in);
//		if(R != null) {
//			Persona x = new Persona();
//			x.leer();
//			R.setPer(x);
//			System.out.println("tendra izq? s/n");
//			String resp = lee.next();
//			if(resp.equals("s")) {
//				Nodo nuevo = new Nodo();
//				R.setIzq(nuevo);
//				crear(R.getIzq());
//			}
//			System.out.println("tendra der? s/n");
//			resp = lee.next();
//			if(resp.equals("s")) {
//				Nodo nuevo = new Nodo();
//				R.setDer(nuevo);
//				crear(R.getDer());
//			}
//		}
//	}
	public void preorden(Nodo R) {
		if(R != null) {
			System.out.println(R.getNum());
			preorden(R.getIzq());
			preorden(R.getDer());
		}
	}
	
	public void postOrden(Nodo R) {
		if(R != null) {
			postOrden(R.getIzq());
			postOrden(R.getDer());
			System.out.println(R.getNum());
		}
	}
	public void inorden(Nodo R) {
		if(R != null) {
			inorden(R.getIzq());
			System.out.println(R.getNum());
			inorden(R.getDer());
		}
	}
	
	public void crear1() {
        Scanner sc = new Scanner(System.in);
        int dato;
        String op;
        do {
            System.out.print("Ingrese num: ");
            dato = sc.nextInt();
            cargar(dato);
            System.out.print("Desea cont s/n: ");
            op = sc.next();
        } while (op.equalsIgnoreCase("s"));
    }
	
	public void cargar(int x) {
        boolean sw = true;
        Nodo q = raiz;

        if (raiz == null) {
            raiz = new Nodo();
            raiz.setNum(x);
        } else {
            while (sw) {
                if (x > q.getNum()) {
                    if (q.getDer() != null) {
                        q = q.getDer();
                    } else {
                        Nodo nuevo = new Nodo();
                        nuevo.setNum(x);
                        q.setDer(nuevo);
                        sw = false;
                    }
                } else if (x < q.getNum()) {
                    if (q.getIzq() != null) {
                        q = q.getIzq();
                    } else {
                        Nodo nuevo = new Nodo();
                        nuevo.setNum(x);
                        q.setIzq(nuevo);
                        sw = false;
                    }
                } else {
                    System.out.println("¡El elemento ya existe!");
                    sw = false;
                }
            }
        }
    }
	
	public boolean buscar(int x) {
		Nodo q = raiz;
		while(q != null) {
			if(x > q.getNum()) {
				q = q.getDer();
			}else {
				if(x < q.getNum()) {
					q = q.getIzq();
				}else {
					System.out.println("elemento econtrado");
					q = null;
					return true;
				}
			}
		}
		return false;
	}
	
	
}
