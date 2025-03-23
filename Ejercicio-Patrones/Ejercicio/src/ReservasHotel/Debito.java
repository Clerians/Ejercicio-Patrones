package ReservasHotel;

public class Debito implements Pago {
    @Override
    public void metodoPago(String tarjeta, double monto) {
        System.out.println("Procesando pago con débito de " + monto + " en cuenta: " + tarjeta);
    }
}
