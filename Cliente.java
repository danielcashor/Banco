package banco;

import java.util.Scanner;

public class Cliente {
	//ATRIBUTOS
	private String nombre;
	private String codigoCliente;
	
	//CONSTRUCTOR
	public Cliente(String nombre, String codigoCliente) {
		this.nombre = nombre;
		this.codigoCliente = codigoCliente;
		
	}
	
	//METODOS
	public void verCliente() {
        System.out.println("Información del Cliente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigoCliente);
}
	public Cliente crearCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el codigo del cliente: ");
        String codigoCliente = scanner.nextLine();

        return new Cliente(nombre, codigoCliente);
	}
}
