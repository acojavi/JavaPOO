/*/
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
 */
public class DiscountCalculator {
    public double calcularDescuento(double precioOriginal, double porcentajeDescuento){
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100){
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100.");
        }
        double montoDescuento = precioOriginal * (porcentajeDescuento /100);
        return precioOriginal - montoDescuento;
    }
}
