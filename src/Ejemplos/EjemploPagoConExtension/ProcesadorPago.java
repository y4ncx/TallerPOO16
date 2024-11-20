package Ejemplos.EjemploPagoConExtension;

// Clase ProcesadorPago
public class ProcesadorPago {
    public void realizarPago(Pago metodoPago, double monto) {
        metodoPago.procesarPago(monto);
    }
}