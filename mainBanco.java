package bank;

import java.util.Scanner;

public class Main {
	private static String numeroCuenta;
    private static double saldo;
    private static Cliente cliente;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido al banco");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Borrar cuenta");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Ingresar dinero");
            System.out.println("5. Consultar cuenta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cliente.crearCliente();
                    crearCuenta();
                    break;
                case 2:
                    borrarCuenta();
                    break;
                case 3:
                    sacarDinero();
                    break;
                case 4:
                    ingresarDinero();
                    break;
                case 5:
                    consultarCuenta();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }

        System.out.println("Gracias por utilizar nuestro servicio bancario.");
        scanner.close();
    }

    private static void crearCuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        saldo = scanner.nextDouble();
    }

    private static void borrarCuenta() {
        numeroCuenta = null;
        saldo = 0;
        cliente = null;
        System.out.println("Cuenta borrada exitosamente.");
    }

    private static void sacarDinero() {
        if (cliente != null && numeroCuenta != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad a sacar: ");
            double cantidad = scanner.nextDouble();

            if (saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("Se retiraron " + cantidad + " unidades monetarias. Saldo actual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("No hay cuenta asociada.");
        }
    }

    private static void ingresarDinero() {
        if (cliente != null && numeroCuenta != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad a ingresar: ");
            double cantidad = scanner.nextDouble();

            saldo += cantidad;
            System.out.println("Se ingresaron " + cantidad + " unidades monetarias. Saldo actual: " + saldo);
        } else {
            System.out.println("No hay cuenta asociada.");
        }
    }

    private static void consultarCuenta() {
        if (cliente != null && numeroCuenta != null) {
            cliente.verCliente();
            System.out.println("Número de cuenta: " + numeroCuenta);
            System.out.println("Saldo actual: " + saldo);
        } else {
            System.out.println("No hay cuenta asociada.");
        }
    }
}

