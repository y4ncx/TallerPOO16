package Ejercicio3;

public class EnvioCorreo implements CanalEnvio{

    @Override
    public void enviar(String mensaje){
        System.out.println("Enviando correo electronico =" + mensaje);

    }
}
