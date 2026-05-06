package a09;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        final int TOTAL_NUMS = 30;
        List <Integer> listaOriginal = generarNums(TOTAL_NUMS);

        System.out.println("Lista original: "+ listaOriginal);

        Set <Integer> set1 = new HashSet<>(listaOriginal);
        System.out.println("HashSet: "+ set1);//No garantiza el orden

        Set <Integer> tree1 = new TreeSet<>(listaOriginal);
        System.out.println("TreeSet: "+ tree1);//Se ordena de menor a mayor

        Set <Integer> linkedSet = new LinkedHashSet<>(listaOriginal);
        System.out.println("LinkedHashSet: "+ linkedSet);//Se mantiene el orden original de la lista
    }

    public static List<Integer> generarNums(int veces){
        final int RANGO = 100;
        List <Integer> listaInts = new ArrayList<>();
        for(int i=1;i<=veces;i++){
            Integer n = (int) (Math.random() * RANGO) + 1;
            listaInts.add(n);
        }
        return listaInts;
    }

}
