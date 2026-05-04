package a08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaA = new ArrayList<>(Arrays.asList("Ana","Luis","Marta","Luis")); 
        List<String> listaB = new ArrayList<>(Arrays.asList("Ana","Luis","Marta","Luis"));  
 
        System.out.println("Las listas son iguales: " + listaA.equals(listaB));
        System.out.println("El primer y ultimo indice de Luis son: "+ listaA.indexOf("Luis")+ " y "+ listaA.lastIndexOf("Luis"));
        listaA.sort(null);
        System.out.println("listaA ordenada: "+ listaA);
        System.out.println("Las listas son iguales: " + listaA.equals(listaB));
        listaB.sort(Comparator.reverseOrder());
        System.out.println("listaB ordenada: "+listaB);
    }

}
