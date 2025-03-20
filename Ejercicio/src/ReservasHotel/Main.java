package ReservasHotel;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Perez", "1234-5678-9012-3456");
        Hotel hotel = new Hotel();
        hotel.hacerReserva(cliente);
    }
}