package Ejercicio3;

public class Mensajero {

    private CanalEnvio canalEnvio;

    public Mensajero(CanalEnvio canalEnvio){
        this.canalEnvio = canalEnvio;
    }

    public void setCanalEnvio(CanalEnvio canalEnvio){
        this.canalEnvio = canalEnvio;
    }


    public void enviarMensaje(String mensaje){
        canalEnvio.enviar(mensaje);
    }
}
