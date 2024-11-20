package Ejercicio2;

public class ExportadorExcel implements Exportador{

    @Override
    public void exportar (String contenido){
        System.out.println("Exportando contenido a excel = " + contenido);
    }
}
