
public class ListaPaciente {
    private Nodo cabeza;
    private int size; 

    // Constructor 
    public ListaPaciente() {
        this.cabeza = null;
        this.size = 0;
    }

    
    public void adiFinal(Paciente paciente) {
        Nodo nuevoNodo = new Nodo(paciente); 
        if (cabeza == null) { 
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) { 
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo); 
        }
        size++; 
    }

    
    public Paciente getPaciente(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Índice fuera de rango.");
            return null; 
        }
        Nodo actual = cabeza;
        for (int i = 0; i < index; i++) {
            actual = actual.getSiguiente(); // Recorremos hasta el índice deseado
        }
        return actual.getPaciente(); // Retornamos el paciente en la posición indicada
    }

    // Método para mostrar todos los pacientes en la lista
    public void mostrar() {
        Nodo actual = cabeza;
        if (actual == null) {
            System.out.println("No hay pacientes en la lista.");
        }
        while (actual != null) {
            actual.getPaciente().mostrar(); // Llamamos a mostrar() de cada paciente
            actual = actual.getSiguiente(); // Avanzamos al siguiente nodo
        }
    }

    // Método para obtener el tamaño de la lista (número de pacientes)
    public int getSize() {
        return size;
    }

    // Clase Nodo (para uso interno en la lista)
    private class Nodo {
        private final Paciente paciente;
        private Nodo siguiente;

        public Nodo(Paciente paciente) {
            this.paciente = paciente;
            this.siguiente = null;
        }

        public Paciente getPaciente() {
            return paciente;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
}


    
