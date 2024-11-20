package Ejercicio3;

public class SistemaMensajes {
    public static void main(String[] args) {
        Mensajero mensajero = new Mensajero(new EnvioCorreo());
        mensajero.enviarMensaje("Hola, este es un correo electronico");


        mensajero.setCanalEnvio(new EnvioSMS());
        mensajero.enviarMensaje("Hola, este es un SMS");


        mensajero.setCanalEnvio(new EnvioPush());
        mensajero.enviarMensaje("Hola, este es una notificacion push");
    }



}