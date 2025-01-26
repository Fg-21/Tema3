package boletincollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        // Objeto scanner
        Scanner scanner = new Scanner(System.in);
        
        // HashMap para productos y precios
        HashMap<String, Double> productos = new HashMap<>();
        
        // Variable para la opción del usuario
        int opcion;

        //Seguimos iterando mientras que la opcion no sea 0
        do {
            // Mostrams el menú de opciones para el usuario
            System.out.println("\n--- MENÚ DE PRODUCTOS ---");
            System.out.println("1. Alta de producto");
            System.out.println("2. Baja de producto");
            System.out.println("4. Listar existencias");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            
            // Limpiamos el buffer
            scanner.nextLine(); 

            //Segun la opcion del menu...
            switch (opcion) {
                case 1 -> {
                    // Pedimos al usuario el nombre del producto
                    System.out.print("Introduce el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();

                    // Pedimos al usuario el precio del producto
                    System.out.print("Introduce el precio del producto: ");
                    double precioProducto = scanner.nextDouble();
                    
                    // Limpiamos el buffer nuevamente
                    scanner.nextLine(); 

                    // Añadimos el producto y su precio al HashMap
                    // Si el producto ya existe, se actualizará su precio
                    productos.put(nombreProducto, precioProducto);
                    System.out.println("Producto añadido correctamente.");
                }

                case 2 -> {
                    // Pedimos el nombre del producto a eliminar
                    System.out.print("Introduce el nombre del producto a eliminar: ");
                    String productoEliminar = scanner.nextLine();

                    // Comprobamos si el producto existe en el HashMap
                    if (productos.containsKey(productoEliminar)) {
                        // Si existe, lo eliminamos
                        productos.remove(productoEliminar);
                        System.out.println("Producto eliminado correctamente.");
                    } else {
                        // Si no existe, mostramos un mensaje de error
                        System.out.println("El producto no existe.");
                    }
                }

                case 4 -> {
                    // Si no hay productos en el HashMap, mostramos un mensaje
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        // Si hay productos, los listamos con un ciclo for-each
                        System.out.println("\n--- LISTADO DE PRODUCTOS ---");
                        // Iteramos sobre cada entrada del HashMap (producto y su precio)
                        for (Map.Entry<String, Double> entry : productos.entrySet()) {
                            // Mostramos el nombre y el precio de cada producto
                            System.out.println("Producto: " + entry.getKey() + " | Precio: " + entry.getValue());
                        }
                    }
                }

                case 0 -> {
                   
                    //mostramos un mensaje de despedida y salimos del bucle
                    System.out.println("Saliendo del programa.");
                }

                default -> {
                    // Si el usuario elige una opción no válida, le avisamos
                    System.out.println("Opción no válida. Intenta nuevamente.");
                }
            }
        // El bucle continuará hasta que el usuario seleccione la opción 0 (Salir)
        } while (opcion != 0);

        // Cerramos scanner
        scanner.close();
    }
}
