package Ejercicio2;

public class ExportadorPDF implements Exportador{

    @Override
    public void exportar(String contenido){
        System.out.println("Exportando el contenido a PDF = " + contenido);
    }
}
