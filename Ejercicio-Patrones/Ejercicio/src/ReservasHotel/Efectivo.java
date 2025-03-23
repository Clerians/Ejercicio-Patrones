package ReservasHotel;

public class Efectivo implements Pago {
    @Override
    public void metodoPago(String tarjeta, double monto) {
        System.out.println("Pago en efectivo recibido por " + monto);
    }
}
