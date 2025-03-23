package ReservasHotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hotel hotel = new Hotel();

        while(true){
            System.out.println("Menú de Reservas de Hotel:");
            System.out.println("1. Hacer una reserva");
            System.out.println("2. Salir");
            System.out.println("Seleccione una opción: ");
            int opcion = scan.nextInt();

            if(opcion == 1){
                pagos(hotel,scan);
            }
            if(opcion == 2){
                System.out.println("Saliendo Adios :P");
                break;
            }
        }
        scan.close();
    }

    private static void pagos(Hotel hotel, Scanner scan) {
        System.out.print("Ingrese su nombre: ");
        scan.nextLine();
        String nombre = scan.nextLine();

        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta de Crédito");
        System.out.println("2. Tarjeta de Débito");
        System.out.println("3. Efectivo");
        System.out.print("Opción: ");

        int metodo = scan.nextInt();
        scan.nextLine();

        Pago metodoPago = null;
        String tarjeta = null;
        Cliente cliente = null;
        double monto = 0;

        switch (metodo) {
            case 1:
                System.out.println("Ingrese el numero de la tarjeta: ");
                tarjeta = scan.nextLine();
                System.out.println("Ingrese el monto de la reserva: ");
                monto = scan.nextDouble();
                scan.nextLine();
                cliente = new Cliente(nombre, tarjeta);
                metodoPago = new Credito();
                break;
            case 2:
                System.out.println("Ingrese el numero de la tarjeta: ");
                tarjeta = scan.nextLine();
                System.out.println("Ingrese el monto de la reserva: ");
                monto = scan.nextDouble();
                scan.nextLine(); // Limpiar buffer
                cliente = new Cliente(nombre, tarjeta);
                metodoPago = new Debito();
                break;
            case 3:
                System.out.println("Ingrese el monto de la reserva: ");
                monto = scan.nextDouble();
                cliente = new Cliente(nombre, tarjeta);
                metodoPago = new Efectivo();
                break;
            default:
                System.out.println("Opción no válida. Se canceló la operación.");
                return;
        }
        hotel.hacerReserva(cliente, monto, metodoPago);
    }
}