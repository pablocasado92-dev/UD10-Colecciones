package a03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int TOTAL_NUMS = 20;
        Collection <Integer> listaInts = generarNums(TOTAL_NUMS);
        Collection <Integer> listaInts2 = new ArrayList<>();

        for (Integer numero : listaInts) {
            if(!listaInts2.contains(numero))
                listaInts2.add(numero); 
        }

        System.out.println("Lista1: "+ listaInts +" Size: "+ listaInts.size());
        System.out.println("Lista2: "+ listaInts2+" Size: "+ listaInts2.size());
        
    }

    public static Collection<Integer> generarNums(int veces){
        Collection <Integer> listaInts = new ArrayList<>();
        for(int i=0;i<veces;i++){
            Integer n = (int) (Math.random() * 10) + 1;
            listaInts.add(n);
        }
        return listaInts;
    }

}
