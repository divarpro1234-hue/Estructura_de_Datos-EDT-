
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
        // Definir el PIN correcto
        String pinCorrecto = "1234"; // Puedes cambiar el PIN aquí
        // Saldo inicial
        double saldo = 4000.0;
        
        // Solicitar al usuario que ingrese el PIN
        String pinIngreso = JOptionPane.showInputDialog(null, "Ingrese su PIN (4 o 5 dígitos):");
        
        // Verificar el PIN
        if (pinIngreso.equals(pinCorrecto)) {
            // Si el PIN es correcto, mostrar el menú
            boolean continuar = true;
            while (continuar) {
                String menu = "Seleccione una opción:\n"
                            + "1. Ver saldo\n"
                            + "2. Retirar dinero\n"
                            + "3. Depositar dinero\n"
                            + "4. Salir";
                // Mostrar el menú y obtener la opción seleccionada
                String opcionStr = JOptionPane.showInputDialog(null, menu);
                int opcion = Integer.parseInt(opcionStr);
                
                switch (opcion) {
                    case 1: 
                        // Ver saldo
                        JOptionPane.showMessageDialog(null, "Saldo disponible: " + saldo + " Bs.");
                        break;
                    case 2: 
                        // Retirar dinero
                        String montoRetiroStr = JOptionPane.showInputDialog(null, "Ingrese el monto a retirar:");
                        double montoRetiro = Double.parseDouble(montoRetiroStr);
                        if (montoRetiro <= saldo) {
                            saldo -= montoRetiro;
                            JOptionPane.showMessageDialog(null, "Has retirado: " + montoRetiro + " Bs.\nSaldo restante: " + saldo + " Bs.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente para retirar esa cantidad.");
                        }
                        break;
                    case 3:
                        // Depositar dinero
                        String montoDepositoStr = JOptionPane.showInputDialog(null, "Ingrese el monto a depositar:");
                        double montoDeposito = Double.parseDouble(montoDepositoStr);
                        saldo += montoDeposito;
                        JOptionPane.showMessageDialog(null, "Has depositado: " + montoDeposito + " Bs.\nSaldo actual: " + saldo + " Bs.");
                        break;
                    case 4:
                        // Salir
                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro cajero.");
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                        break;
                }
            }
        } else {
            // Si el PIN es incorrecto
            JOptionPane.showMessageDialog(null, "PIN incorrecto. Acceso denegado.");
        }
    }
}