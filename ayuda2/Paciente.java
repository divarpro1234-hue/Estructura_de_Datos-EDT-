
import java.util.Scanner;


public class Paciente {
    private String nombre;
    private int edad;
    private double peso;
    private int nivelPrioridad;

    public Paciente(String nombre, int edad, double peso, int nivelPrioridad) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.nivelPrioridad = nivelPrioridad;
    }

    public Paciente() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
        this.nivelPrioridad = 0;
    }

    // Método leer() corregido, sólo uno
    public void leer() {
        Scanner lee = new Scanner(System.in);

        System.out.print("Ingrese el nombre del paciente: ");
        this.nombre = lee.nextLine();

        System.out.print("Ingrese su edad: ");
        this.edad = lee.nextInt();

        System.out.print("Ingrese su peso: ");
        this.peso = lee.nextDouble();

        boolean valido;
        do {
            System.out.print("Ingrese su nivel de prioridad (1 al 3): ");
            this.nivelPrioridad = lee.nextInt();
            valido = validarPrioridad(this.nivelPrioridad);
            if (!valido) {
                System.out.println("Nivel de prioridad no válido. Intente nuevamente.");
            }
        } while (!valido);
    }

    private boolean validarPrioridad(int prioridad) {
        return prioridad >= 1 && prioridad <= 3;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad + " ");
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Nivel de prioridad: " + this.nivelPrioridad);

        switch (this.nivelPrioridad) {
            case 1:
                System.out.println("ATENCION INMEDIATA (espera: 0 minutos).");
                break;
            case 2:
                System.out.println("ATENCION INTERMEDIA (espera: 60 minutos).");
                break;
            case 3:
                System.out.println("ATENCION MENOR (espera: 2 horas).");
                break;
        }
    }

    public static void agregarPacientes(ListaPaciente lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de pacientes que desea agregar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos del paciente " + (i + 1) + ":");
            Paciente paciente = new Paciente();
            paciente.leer(); // Leer datos del paciente
            lista.adiFinal(paciente); // Agregar a la lista
        }
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }
}

