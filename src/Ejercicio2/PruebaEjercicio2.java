package Ejercicio2;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        Documento documento = new Documento("Este es el contenido del documento");

        //PDF
        Exportador exportadorPDF = new ExportadorPDF();
        documento.exportar(exportadorPDF);

        //WORD
        Exportador exportadorWord = new ExportadorWord();
        documento.exportar(exportadorWord);

        //EXCEL
        Exportador exportadorExcel = new ExportadorExcel();
        documento.exportar(exportadorExcel);



    }
}
