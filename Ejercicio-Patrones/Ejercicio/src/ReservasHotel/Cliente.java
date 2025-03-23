package ReservasHotel;

public class Cliente {
    private String nombre, tarjetaCredito;

    public Cliente(String nombre, String tarjetaCredito) {
        this.nombre = nombre;
        this.tarjetaCredito = tarjetaCredito;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTarjetaCredito() {
        return tarjetaCredito;
    }
}
