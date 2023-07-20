public class Main {
    public static void main(String[] args) {
        double precioOriginal = 100;
        double porcentajeDescuento = 10;

        DiscountCalculator dc = new DiscountCalculator();
        double precioConDescuento = dc.calcularDescuento(precioOriginal, porcentajeDescuento);

        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.println("Precio con descuento: $" + precioConDescuento);

    }
}