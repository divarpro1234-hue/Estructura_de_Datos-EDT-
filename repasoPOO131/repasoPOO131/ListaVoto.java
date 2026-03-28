package repasoPOO131;

import java.util.Scanner;

public class ListaVoto {
	private int nroVoto;
	private String m[][];
	
	public ListaVoto(int n) {
		this.nroVoto=n;
		this.m = new String[n][3];
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese los datos: nombre ciudad candidato ");
		for (int i = 0; i < nroVoto; i++) {
			m[i][0] = sc.nextLine();
			m[i][1] = sc.nextLine();
			m[i][2] = sc.nextLine();
		}
	}
	public void mostrar() {
		for (int i = 0; i < nroVoto; i++) {
            System.out.println("votante " + (i + 1) + ": [" +
                    "nombre = " + m[i][0] + ", ciudad = " + m[i][1] + ", candidado = " + m[i][2]+"]");
        }
	}
	
	public int getNroVoto() {
		return nroVoto;
	}

	public void setNroVoto(int nroVoto) {
		this.nroVoto = nroVoto;
	}

	public String[][] getM() {
		return m;
	}

	public void setM(String[][] m) {
		this.m = m;
	}
	
	public void cadidatoGanador(String ciudadx) {
		int[] v =new int[10];
		for (int i = 0; i < nroVoto-1; i++) {
			if(m[i][1].equals(ciudadx)) {
				int nc = Integer.parseInt(m[i][2]);
				v[nc] = v[nc]+1;
			}
		}
		int may = 0;
		for (int i = 0; i < 9; i++) {
			if(v[i] > may) {
				may=v[i];
			}
		}
		int pc = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] == may) {
				pc = i;
			}
		}
		System.out.println("Ganador con numero de votos" + pc);
	}
	public int totalVotos(int nc) {
		int total = 0;
		for (int i = 0; i < m.length; i++) {
			if(Integer.parseInt(m[i][2]) == nc) {
				total++;
			}
		}
		return total;
	}
	
}
