/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiples.colas.pilas.restaurante;

/**
 *
 * @author inafh
 */
public class PilaP {
    private int max=50;
    private Pedido v[]=new Pedido[max+1];
    private int tope;
    
    PilaP(){
        tope=0;
    }
    boolean esvacia()
    {
        if(tope==0)
            return true;
        return false;
    }
    boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }
    int nroelem ()
    {
	return (tope);
    }
    void adicionar (Pedido elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v [tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }
    Pedido eliminar ()
    {
	Pedido elem = null;
	if (!esvacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }
    void mostrar ()
    {
	Pedido elem;
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    System.out.println ("\n Pedidos de la Pila ");
	    PilaP aux = new PilaP ();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar ();
		adicionar (elem);
	    }
	}
    }
    void vaciar (PilaP a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
	
    }       
}
