package ReservasHotel;

public class Hotel {

    public void hacerReserva(Cliente cliente, double monto, Pago pago) {
        Reserva reserva = new Reserva(cliente,monto);
        pago.metodoPago(cliente.getTarjetaCredito(),monto);
        System.out.println("Reserva realizada para " + cliente.getNombre());
    }
}
