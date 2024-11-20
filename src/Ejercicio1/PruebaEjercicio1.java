package Ejercicio1;

public class PruebaEjercicio1 {
    public static void main(String[] args) {

        double monto = 1000;


        //descuento porcentual
        Descuento descuentoPorcentual = new DescuentoPorcentual(10);
        System.out.println("Descuento porcentual del = " + descuentoPorcentual.calcularDescuento(monto));

        //Descuento Fijo
        Descuento descuentoFijo = new DescuentoFijo(10);
        System.out.println("Descuento fijo del = " + descuentoFijo.calcularDescuento(monto));

        Descuento descuentoCombinado = new DescuentoCombinado(descuentoPorcentual, descuentoFijo);
        System.out.println("Descuento combinado aplicado: $" + descuentoCombinado.calcularDescuento(monto));





    }
}
