package Ejercicio3;

public class EnvioPush implements CanalEnvio{

    @Override
    public void enviar(String mensaje){
        System.out.println("Enviando push de notificación = " + mensaje);
    }
}
