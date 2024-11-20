package Ejercicio1;

class DescuentoCombinado extends Descuento{

    private Descuento descuento1;
    private Descuento descuento2;

    public DescuentoCombinado(Descuento descuento1, Descuento descuento2){
        this.descuento1 = descuento1;
        this.descuento2 = descuento2;

    }

    @Override

    public double calcularDescuento(double monto){
        return descuento1.calcularDescuento(monto) + descuento2.calcularDescuento(monto);
    }


}
