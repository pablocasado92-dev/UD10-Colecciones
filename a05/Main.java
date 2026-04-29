package a05;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        final int TOTAL_NUMS = 100;
        Collection <Integer> listaInts = generarNums(TOTAL_NUMS);

        System.out.println(listaInts+" Size: "+listaInts.size());

        Collection <Integer> lista2 = new ArrayList<>();
        Integer numExtra = 5;
        lista2.add(numExtra);
        listaInts.removeAll(lista2);
        System.out.println("Lista1 modificada: "+ listaInts + "Size: " + listaInts.size());
        
    }

    public static Collection<Integer> generarNums(int veces){
        Collection <Integer> listaInts = new ArrayList<>();
        for(int i=1;i<=veces;i++){
            Integer n = (int) (Math.random() * 10) + 1;
            listaInts.add(n);
        }
        return listaInts;
    }

}
