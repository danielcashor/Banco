import java.util.Scanner;

// Clase MainBanco
public class MainBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = null;

        boolean salir = false;
        while (!salir) {
            System.out.println("\n----- Menú de opciones -----");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Borrar cuenta");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Consultar cuenta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del titular de la cuenta: ");
                    scanner.nextLine();
                    String titular = scanner.nextLine();
                    System.out.print("Ingrese el saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    cuenta = new Cuenta(titular, saldoInicial);
                    System.out.println("¡Cuenta creada con éxito!");
                    break;
                case 2:
                    cuenta = null;
                    System.out.println("¡Cuenta borrada con éxito!");
                    break;
                case 3:
                    if (cuenta != null) {
                        System.out.print("Ingrese la cantidad a ingresar: ");
                        double cantidadIngreso = scanner.nextDouble();
                        cuenta.ingresar(cantidadIngreso);
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;
                case 4:
                    if (cuenta != null) {
                        System.out.print("Ingrese la cantidad a sacar: ");
                        double cantidadRetiro = scanner.nextDouble();
                        cuenta.sacar(cantidadRetiro);
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;
                case 5:
                    if (cuenta != null) {
                        cuenta.verCuenta();
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;
                case 6:
                    salir = true;
                    System.out.println("¡Gracias por utilizar nuestro banco!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
        scanner.close();
    }
}
