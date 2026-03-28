/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author inafh
 */
public class MCC_Ped {
    private int N;
    private ColaInfPed A[]=new ColaInfPed[30];

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public ColaInfPed[] getA() {
        return A;
    }

    public void setA(ColaInfPed[] A) {
        this.A = A;
    }

    MCC_Ped(int N){
        this.N = N;
        for(int i=0;i<=this.N-1;i++)
            A[i]=new ColaInfPed();
    }
    
    boolean esvacia (int i)
    {
        return this.A[i].esvacia();
    }


    boolean esllena (int i)
    {
	return this.A[i].esllena();
    }


    void adicionar (int i, InfPedCli elem)
    {
	this.A[i].adicionar(elem);
    }
    InfPedCli eliminar (int i)
    {
    	return this.A[i].eliminar();
    }
    
    void mostrar (int i)
    {
	this.A[i].mostrar();
    }
    
    void mostrar ()
    {
        for (int i = 0; i < N; i++) {
            System.out.println("Datos de la cola "+i);
            this.A[i].mostrar();
        }
    }

    int nroElem (int i)
    {
	return this.A[i].nroelem();
    }
    
    void vaciar(int i, ColaInfPed Z)
    {
        this.A[i].vaciar(Z);
    }
    void vaciar(int i, int j)
    {
        this.A[i].vaciar(this.A[j]);
    }
}
