package Ejemplos.EjemploNotificacionDiferentesCanales;

// Clase NotificacionSMS
public class NotificacionSMS extends Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}