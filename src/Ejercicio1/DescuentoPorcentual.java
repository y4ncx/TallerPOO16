package Ejercicio1;

class DescuentoPorcentual extends Descuento{
    private double porcentaje;

    public DescuentoPorcentual(double porcentaje){
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularDescuento(double monto){

        return monto * (porcentaje / 100);
    }

}
