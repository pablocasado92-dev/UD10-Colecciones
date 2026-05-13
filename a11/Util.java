package a11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

    public static void pintaMenu() {
        System.out.println("\n╔════════════════════════════╗");
        System.out.println("║        MENÚ PRINCIPAL      ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║  0 - Salir                 ║");
        System.out.println("║  1 - Alta producto         ║");
        System.out.println("║  2 - Baja producto         ║");
        System.out.println("║  3 - Actualizar stock      ║");
        System.out.println("║  4 - Listar existencias    ║");
        System.out.println("╚════════════════════════════╝");
    }

    public static int pideNumMenu(Scanner sc) {
        int numero = -1;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Introduce una opción: ");
                numero = sc.nextInt();

                if (numero >= 0 && numero <= 4) {
                    entradaValida = true;
                    sc.nextLine();
                } else {
                    System.out.println("Error: El número debe estar entre 0 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe introducir un número entero");
                sc.next();
            }
        } while (!entradaValida);

        return numero;
    }

    public static int pideNumStock(Scanner sc) {
        int numero = -1;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Introduce stock: ");
                numero = sc.nextInt();

                if (numero >= 0) {
                    entradaValida = true;
                    sc.nextLine();
                } else {
                    System.out.println("Error: El stock no puede ser negativo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe introducir un número entero");
                sc.next();
            }
        } while (!entradaValida);

        return numero;
    }

    // Pide y devuelve un código de producto
    public static String pideCodigoProducto(Scanner sc) {
        System.out.print("Introduce código de producto: ");
        return sc.nextLine();
    } 
}