package Ejemplos.EjemploViolacionOCP1;

// Clase GestorNotificacion
public class GestorNotificacion {
    public void notificar(Notificacion notificacion, String mensaje) {
        notificacion.enviar(mensaje);
    }
}