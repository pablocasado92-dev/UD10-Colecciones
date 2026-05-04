package a07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));       
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(99, 99));

        System.out.println("=== INICIO ===");
        System.out.println("lista1: " + lista1);
        System.out.println("lista2: " + lista2);
        System.out.println();

        lista1.add(0, 5);
        System.out.println("1. Insertado 5 en índice 0: " + lista1);

        lista1.addAll(2, lista2);
        System.out.println("2. Insertada lista2 en índice 2: " + lista1);

        System.out.println("3. El elemento en el índice 4 es: " + lista1.get(4));

        Integer numAux = lista1.set(lista1.size()-1,500);
        System.out.println("4. Sustituido último elemento  por 500: " + lista1);
        System.out.println("El numero que habia en la ultima posicion era: "+ numAux);

        lista1.remove(1);
        System.out.println("5. Eliminado elemento en índice 1: " + lista1);

        lista1.removeAll(lista2);
        System.out.println("6. Eliminados todos los 99 de la lista: " + lista1);
        System.out.println();

        System.out.println("=== ESTADO FINAL ===\nlista1: "+lista1);
    }
}
