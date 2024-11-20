package Ejercicio3;

public class EnvioSMS implements CanalEnvio{

    public void enviar(String mensaje){
        System.out.println("Enviando Mensaje SMS = " + mensaje);
    }
}
