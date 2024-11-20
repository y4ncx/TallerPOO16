package Ejemplos.EjemploNotificacionDiferentesCanales;

// Clase GestorNotificacion
public class GestorNotificacion {
    public void notificar(Notificacion notificacion, String mensaje) {
        notificacion.enviar(mensaje);
    }
}