package Ejemplos.EjemploPagoConExtension;

public class TarjetaCredito extends Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito: $" + monto);
    }
}