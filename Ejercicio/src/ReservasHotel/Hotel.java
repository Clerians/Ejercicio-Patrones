package ReservasHotel;

public class Hotel {

    Reserva reserva;

    public void hacerReserva(Cliente cliente) {
        System.out.println("Reserva autorizada para " + cliente.getNombre());
        System.out.println("Procesando pago con tarjeta: " + cliente.getTarjetaCredito());
    }
}
