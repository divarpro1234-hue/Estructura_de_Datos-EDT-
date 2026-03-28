/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author inafh
 */
public class ColaInfPed {
    private int max=50;
    private InfPedCli v[]=new InfPedCli[max+1];
    private int ini,fin;
    
    ColaInfPed(){
        ini=fin=0;
    }
    int nroelem ()
    {
	return ((max + fin - ini) % max);
    }


    boolean esvacia ()
    {
	if (nroelem () == 0)
	    return (true);
	return (false);
    }


    boolean esllena ()
    {
	if (nroelem () == max - 1)
	    return (true);
	return (false);
    }


    void adicionar(InfPedCli elem)
    {
	if (!esllena ())
	{

	    fin = (fin + 1) % max;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }


    InfPedCli eliminar ()
    {
	InfPedCli elem=null;
	if (!esvacia ())
	{
	    ini = (ini + 1) % max;
	    elem = v [ini];
	    if (nroelem () == 0)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola circular vacia");
	return (elem);
    }


    void mostrar ()
    {
	InfPedCli elem;
	if (esvacia ())
	    System.out.println ("Cola vacia xxx");
	else
	{
	    System.out.println ("\n Datos de la Cola ");
	    ColaInfPed aux = new ColaInfPed ();
	    while (!esvacia ())
	    {
		elem = eliminar();
		aux.adicionar (elem);
		elem.mostrar();
                System.out.println("");
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar();

		adicionar (elem);
	    }
	}
        System.out.println("");
    }


    void vaciar (ColaInfPed a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}
