public class NodoSala {
    Sala sala;
    NodoSala ant, sig;

    public NodoSala(Sala sala) {
        this.sala = sala;
        this.ant = this.sig = null;
    }
}