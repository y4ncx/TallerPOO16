package Ejemplos.EjemploNotificacionDiferentesCanales;

// Clase NotificacionEmail
public class NotificacionEmail extends Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}