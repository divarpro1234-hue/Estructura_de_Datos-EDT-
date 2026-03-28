/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author inafh
 */
public class MultiplesColasPilasRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CSimpleProd C1= new CSimpleProd();
        C1.adi("carne");
        C1.adi("pollo");
        C1.adi("papa");
        
        CSimpleProd C2= new CSimpleProd();
        C2.adi("carne");
        C2.adi("pollo");
        C2.adi("papa");
        
        CSimpleProd C3= new CSimpleProd();
        C3.adi("carne");
        C3.adi("pollo");
        C3.adi("papa");
        
        Combo c1=new Combo(1,"combo personal",20,C1);
        Combo c2=new Combo(2,"combo familiar",30,C2);
        Combo c3=new Combo(3,"combo turista",40,C3);
        
        CCircularCom CC=new CCircularCom();
        CC.adicionar(c1);
        CC.adicionar(c2);
        CC.adicionar(c3);
        CC.mostrar();
        
        PilaP p1=new PilaP();
        Pedido pp1=new Pedido(1,5);
        Pedido pp2=new Pedido(2,11);
        p1.adicionar(pp1);
        p1.adicionar(pp2);
        
        PilaP p2=new PilaP();
        Pedido pp3=new Pedido(1,5);
        Pedido pp4=new Pedido(3,11);
        p2.adicionar(pp3);
        p2.adicionar(pp4);
        
        PilaP p3=new PilaP();
        Pedido pp5=new Pedido(3,5);
        Pedido pp6=new Pedido(2,11);
        p3.adicionar(pp5);
        p3.adicionar(pp6);
       
        PilaP p4=new PilaP();
        Pedido pp7=new Pedido(1,5);
        Pedido pp8=new Pedido(2,11);
        p4.adicionar(pp7);
        p4.adicionar(pp8);
        
        InfPedCli i1=new InfPedCli("Juan","02-10-2025",p1);
        InfPedCli i2=new InfPedCli("Mateo","07-10-2025",p2);
        InfPedCli i3=new InfPedCli("Carlos","05-10-2025",p3);
        InfPedCli i4=new InfPedCli("Maria","20-10-2025",p4);
        
        ColaInfPed cp1=new ColaInfPed();
        cp1.adicionar(i1);
        cp1.adicionar(i2);
        
        ColaInfPed cp2=new ColaInfPed();
        cp2.adicionar(i3);
        cp2.adicionar(i4);
        
        MCC_Ped M=new MCC_Ped(3);
        M.adicionar(0, i1);
        M.adicionar(0, i2);
        M.adicionar(1, i3);
        M.adicionar(1, i4);
        //M.mostrar();
        //System.out.println(busca(CC,"combo personal",i1.getP()));
        //i1.getP().mostrar();
        //Los pedidos efectuados por el cliente X, que tengan al combo con 
        //descripcion Y, almacenarlos en una nueva Cola en la Multiple Cola Circular
        ejercicioA(M,CC,"Juan","combo personal");
        M.mostrar();
        
    }
    public static void ejercicioA(MCC_Ped A, CCircularCom C, String x, String y){
        boolean sw=false;
        for (int i = 0; i < A.getN(); i++) {
            int j=A.nroElem(i);
            for (int k = 0; k < j; k++) {
                InfPedCli xi = A.eliminar(i);
                if(xi.getNom().equals(x)){
                    if(busca(C, y, xi.getP())){
                        A.adicionar(A.getN()-1, xi);
                        sw=true;
                    }
                    else
                        A.adicionar(i, xi);
                }
                else
                    A.adicionar(i, xi);
            }
        }
        if(sw){
            A.setN(A.getN());
        }
    }
    public static boolean busca(CCircularCom C, String y, PilaP a){
        PilaP aux=new PilaP();
        while(!a.esvacia()){
            Pedido ped=a.eliminar();
            int n=ped.getNroCombo();
            for (int i = 0; i < C.nroelem(); i++) {
                Combo com=C.eliminar();
                if(com.getNro()==n){
                    
                    if(com.getDescripcion().equals(y)){
                        aux.adicionar(ped);
                        a.vaciar(aux);
                        return true;
                    }
                }
                C.adicionar(com);
            }
            aux.adicionar(ped);
        }
        a.vaciar(aux);
        return false;
    }
    
}
