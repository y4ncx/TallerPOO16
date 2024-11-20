package Ejercicio2;

public class ExportadorWord implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando el contenido a Word: " + contenido);
    }
}
