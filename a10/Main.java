package a10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        Set <Socio> socios = new HashSet<>();
        socios.add(new Socio("111", "Raul"));
        socios.add(new Socio("333", "Marta"));
        socios.add(new Socio("111", "Pepe"));
        socios.add(new Socio("222", "Sandra"));

        System.out.println(socios);

        Set <Socio> arbolSocios = new TreeSet<>(socios);
        System.out.println(arbolSocios);

        List <Socio> listaSocios = new ArrayList<>(arbolSocios);
        System.out.println("El ganador del premio es: "+ listaSocios.get(1));
    }

}
