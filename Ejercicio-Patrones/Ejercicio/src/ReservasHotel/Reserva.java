package ReservasHotel;

public class Reserva {
    private Cliente cliente;
    private double monto;
    private boolean activa;

    public Reserva(Cliente cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
        this.activa = true;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void cancelar() {
        if (activa) {
            activa = false;
            System.out.println("Reserva cancelada");
        }
    }
}
