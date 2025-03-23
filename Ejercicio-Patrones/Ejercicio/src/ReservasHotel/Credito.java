package ReservasHotel;

public class Credito implements Pago {

    @Override
    public void metodoPago(String tarjeta, double monto) {
        System.out.println("Procesando pago con crédito de " + monto + " en cuenta: " + tarjeta);
    }
}
