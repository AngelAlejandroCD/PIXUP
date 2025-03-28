package org.angeldoc.vista;

import org.angeldoc.control.MenuEstatus;
import org.angeldoc.control.MenuProcesoCompra;
import org.angeldoc.control.RegistroDatos;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner = new Scanner(System.in);
    private RegistroDatos registro = new RegistroDatos();
    private MenuProcesoCompra menuProcesoCompra = new MenuProcesoCompra(registro);
    private MenuEstatus menuEstatus = new MenuEstatus(registro);

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Consola");
            System.out.println("2. Ventana");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenuConsola();
                    break;
                case 2:
                    mostrarMenuVentana();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    private void mostrarMenuConsola() {
        System.out.println("\n--- Modo Consola ---");
        menuProcesoCompra.mostrarMenu();
    }

    private void mostrarMenuVentana() {
        System.out.println("\n--- Modo Ventana ---");
        menuEstatus.mostrarMenu();
    }
}