package Ejemplos.EjemploPagoConExtension;

// Clase PayPal
public class PayPal extends Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }
}