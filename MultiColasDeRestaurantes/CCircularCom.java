/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author inafh
 */
public class CCircularCom {
    private int max=50;
    private Combo v[]=new Combo[max+1];
    private int ini,fin;
    
    CCircularCom(){
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


    void adicionar(Combo elem)
    {
	if (!esllena ())
	{

	    fin = (fin + 1) % max;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }


    Combo eliminar ()
    {
	Combo elem=null;
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
	Combo elem;
	if (esvacia ())
	    System.out.println ("Cola vacia xxx");
	else
	{
	    
	    CCircularCom aux = new CCircularCom ();
	    while (!esvacia ())
	    {
		elem = eliminar();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar();

		adicionar (elem);
	    }
	}
    }


    void vaciar (CCircularCom a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar());

    }
}
