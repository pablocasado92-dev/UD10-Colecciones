package a04;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        final int TOTAL_NUMS = 100;
        Collection <Integer> listaInts = generarNums(TOTAL_NUMS);
        Integer numQuitar=5;
        Iterator<Integer> it = listaInts.iterator();

        System.out.println("Lista Inicial: "+listaInts +" Size "+ listaInts.size());

        while (it.hasNext()) {
            if(it.next().equals(numQuitar))
                it.remove();  
        }
        System.out.println("Lista sin "+numQuitar+" "+ listaInts+" Size " + listaInts.size());
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
