package org.angeldoc.control;
import java.util.Scanner;
import org.angeldoc.model.producto.Disco;

public class MenuProcesoCompra {
    private Scanner scanner = new Scanner(System.in);
    private RegistroDatos registro;

    public MenuProcesoCompra(RegistroDatos registro) {
        this.registro = registro;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== PROCESO DE COMPRA ===");
            System.out.println("1. Pendiente");
            System.out.println("2. Catálogo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarPendientes();
                    break;
                case 2:
                    mostrarCatalogoDetallado();
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    private void mostrarPendientes() {
        System.out.println("\n--- Órdenes Pendientes ---");
        registro.listarOrdenes();
    }

    private void mostrarCatalogoDetallado() {
        System.out.println("\n--- Catálogo de Discos ---");
        System.out.println("ID | Título | Precio | Existencia | Descuento");
        System.out.println("---------------------------------------------");

        for (Disco disco : registro.getDiscos()) {
            System.out.printf("%-3d | %-20s | $%-6.2f | %-9d | %-8.2f%%\n",
                    disco.getId(),
                    disco.getTitulo(),
                    disco.getPrecio(),
                    disco.getExistencia(),
                    disco.getDescuento());
        }
    }
}