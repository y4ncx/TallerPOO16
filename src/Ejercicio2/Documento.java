package Ejercicio2;

public class Documento {

    private String contenido;

    public Documento (String contenido){
        this.contenido = contenido;

    }

    public void exportar(Exportador exportador){
        exportador.exportar(contenido);
    }
}

