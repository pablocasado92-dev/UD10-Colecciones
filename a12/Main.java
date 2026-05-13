package a12;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Integer> premios = new ArrayList<>(Arrays.asList(1000,50,500,50,200));
        System.out.println("Lista inicial: "+ premios);

        //Cantidad de premios de 50
        System.out.println("Hay "+Collections.frequency(premios, 50)+" premios de 50€ en la lista");

        System.out.println("Premio máximo: " + Collections.max(premios));
        System.out.println("Premio mínimo: " + Collections.min(premios));

        Collections.shuffle(premios);

        System.out.println("Lista barajada: " + premios);

        Collections.sort(premios);
        System.out.println("Lista ordenada: " + premios );

        System.out.println("El índice del 500 es: " + Collections.binarySearch(premios, 500));

    }

}
