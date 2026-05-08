package a11;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//import java.util.Map.Entry;
//import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> almacen = new TreeMap<>();
        int opcion, stock;
        String codProducto;

        do {
            Util.pintaMenu();
            opcion = Util.pideNumMenu(sc);
            switch (opcion) {
                case 0 -> System.out.println("Saliendo del programa...");
                
                case 1 -> {
                    // Alta producto
                    System.out.println("Añadiendo un producto...");
                    codProducto = Util.pideCodigoProducto(sc);
                    
                    if (!Util.existeKey(almacen, codProducto)) {
                        stock = Util.pideNumStock(sc);
                        almacen.put(codProducto, stock);
                    } else {
                        System.out.println("No se puede añadir, ya existe el código");
                    }
                }
                
                case 2 -> {
                    // Baja producto
                    System.out.println("Borrando un producto...");
                    codProducto = Util.pideCodigoProducto(sc);
                    
                    if (Util.existeKey(almacen, codProducto)) {
                        almacen.remove(codProducto);
                    } else {
                        System.out.println("No existe un producto con ese código");
                    }
                }
                
                case 3 -> {
                    // Actualizar stock
                    System.out.println("Actualizando stock...");
                    codProducto = Util.pideCodigoProducto(sc);
                    
                    if (Util.existeKey(almacen, codProducto)) {
                        stock = Util.pideNumStock(sc);
                        almacen.put(codProducto, stock);
                    } else {
                        System.out.println("No existe un producto con ese código");
                    }
                }
                
                case 4 -> {
                    // Listar existencias
                    System.out.println("\n=== LISTA DE EXISTENCIAS ===");
                    
                    if (almacen.isEmpty()) {
                        System.out.println("No hay productos en el almacén");
                    } else {
                        // Opción 1: forEach de Java 8+
                        almacen.forEach((clave, valor) -> 
                            System.out.println(clave + " | " + valor + " unidades"));
                        /* Opción 2: con entrySet
                        Set<Map.Entry<String, Integer>> productos = almacen.entrySet();
                        for (Map.Entry<String, Integer> producto : productos) {
                            System.out.println(producto.getKey() + " | " + producto.getValue() + " unidades");
                        }
                        */
                    }
                }
            }
        } while (opcion != 0);

        sc.close();
    }
}