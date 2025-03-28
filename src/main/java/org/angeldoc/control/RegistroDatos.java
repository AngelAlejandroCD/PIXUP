package org.angeldoc.control;

import org.angeldoc.model.*;
import org.angeldoc.model.pedido.*;
import org.angeldoc.model.producto.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroDatos {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Disco> discos = new ArrayList<>();
    private List<Orden> ordenes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Métodos para registrar datos
    public void registrarUsuario() {
        System.out.println("\n--- Registrar Usuario ---");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Segundo Apellido: ");
        String segundoApellido = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("RFC: ");
        String rfc = scanner.nextLine();

        Usuario usuario = new Usuario(id, nombre, apellido, segundoApellido, contraseña, email, rfc);
        usuarios.add(usuario);
        System.out.println("Usuario registrado exitosamente!");
    }

    public void registrarDisco() {
        System.out.println("\n--- Registrar Disco ---");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Precio: ");
        float precio = scanner.nextFloat();

        System.out.print("Existencia: ");
        int existencia = scanner.nextInt();

        System.out.print("Descuento: ");
        float descuento = scanner.nextFloat();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Fecha de Lanzamiento: ");
        String fechaLanzamiento = scanner.nextLine();

        System.out.print("Imagen: ");
        String imagen = scanner.nextLine();

        // Aquí deberías implementar la lógica para seleccionar disquera, artista y género musical
        Disco disco = new Disco(id, titulo, precio, existencia, descuento, fechaLanzamiento, imagen, null, null, null);
        discos.add(disco);
        System.out.println("Disco registrado exitosamente!");
    }

    public void registrarOrden() {
        System.out.println("\n--- Registrar Orden ---");
        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.print("Costo Total: ");
        float costoTotal = scanner.nextFloat();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Fecha: ");
        String fecha = scanner.nextLine();

        System.out.print("Cantidad Total: ");
        int cantidadTotal = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Estatus Envío: ");
        String estatusEnvio = scanner.nextLine();

        System.out.print("Costo Envío: ");
        float costoEnvio = scanner.nextFloat();

        // Aquí deberías implementar la lógica para seleccionar usuario
        Orden orden = new Orden(id, costoTotal, fecha, cantidadTotal, estatusEnvio, costoEnvio, null, null);
        ordenes.add(orden);
        System.out.println("Orden registrada exitosamente!");
    }

    // Métodos para listar datos
    public void listarUsuarios() {
        System.out.println("\n--- Lista de Usuarios ---");
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + " | Nombre: " + usuario.getNombre() + " " + usuario.getApellido());
        }
    }

    public void listarDiscos() {
        System.out.println("\n--- Lista de Discos ---");
        for (Disco disco : discos) {
            System.out.println("ID: " + disco.getId() + " | Título: " + disco.getTitulo() + " | Precio: $" + disco.getPrecio());
        }
    }

    public void listarOrdenes() {
        System.out.println("\n--- Lista de Órdenes ---");
        for (Orden orden : ordenes) {
            System.out.println("ID: " + orden.getId() + " | Total: $" + orden.getCostoTotal() + " | Fecha: " + orden.getFecha());
        }
    }

    // Getters para las listas
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void registrarDiscoDePrueba() {
    }
}