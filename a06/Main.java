package a06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        final int TOTAL_NUMS = 20;
        Collection <Integer> listaInts = generarNums(TOTAL_NUMS);
        Integer[] arrayInts = listaInts.toArray(new Integer[0]);
        Arrays.sort(arrayInts);
        Collection<Integer> listaOrdenada = new ArrayList<>(Arrays.asList(arrayInts)); 
        Collection <Integer> listaInversa = invertirTabla(arrayInts);

        System.out.println("Lista original: " + listaInts);
        System.out.println("Lista ordenada: " + listaOrdenada);
        System.out.println("Lista Inversa: " + listaInversa);

    }

    public static Collection<Integer> generarNums(int veces){
        Collection <Integer> listaInts = new ArrayList<>();
        for(int i=1;i<=veces;i++){
            Integer n = (int) (Math.random() * 100) + 1;
            listaInts.add(n);
        }
        return listaInts;
    }

    public static Collection<Integer> invertirTabla(Integer[] array){
        Integer[] array2 = new Integer[array.length];
        int j=0;
        for (int i = array.length-1;i>=0;i--){
            array2[j]=array[i];
            j++;
        }
        Collection<Integer> listaInversa = new ArrayList<>(Arrays.asList(array2));
        return listaInversa;

    }
}
