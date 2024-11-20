package Ejercicio1;

class DescuentoFijo extends Descuento{
    private double descuentoFijo;

    public DescuentoFijo(double descuentoFijo){
        this.descuentoFijo = descuentoFijo;
    }

    @Override

    public double calcularDescuento(double monto){
        return descuentoFijo;
    }

}
