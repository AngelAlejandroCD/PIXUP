package org.angeldoc.control;

    import java.util.Scanner;

    public class MenuEstatus {
        private Scanner scanner = new Scanner(System.in);
        private RegistroDatos registro;

        public MenuEstatus(RegistroDatos registro) {
            this.registro = registro;
        }

        public void mostrarMenu() {
            int opcion;
            do {
                System.out.println("\n=== MENÚ DE ESTATUS ===");
                System.out.println("1. Alta");
                System.out.println("2. Baja");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        procesoAlta();
                        break;
                    case 2:
                        procesoBaja();
                        break;
                    case 3:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 3);
        }

        private void procesoAlta() {
            System.out.println("\n--- Proceso de Alta ---");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Registrar Disco");
            System.out.println("3. Registrar Orden");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registro.registrarUsuario();
                    break;
                case 2:
                    registro.registrarDisco();
                    break;
                case 3:
                    registro.registrarOrden();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        private void procesoBaja() {
            System.out.println("\n--- Proceso de Baja ---");
            // Aquí implementarías la lógica para eliminar registros
            System.out.println("Funcionalidad de baja aún no implementada.");
        }
}
