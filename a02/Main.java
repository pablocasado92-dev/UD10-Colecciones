package a02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Collection<Integer> listaEnteros = new ArrayList<>();
        Integer num;
        
        do{
            num = pideInt(sc);
            if(num == -1)
                System.out.println("Terminado de recibir numeros"); 
            else if(num<-1)
                System.out.println("No se pueden introducir numeros negativos");
            else
                listaEnteros.add(num);
        }while (num != -1);

        System.out.println("Coleccion: "+ listaEnteros);
        System.out.print("Pares de la Coleccion: ");
        pintaPares(listaEnteros);
        Iterator<Integer> it = listaEnteros.iterator();
        while (it.hasNext()) {
            num = it.next();
            if(num%3==0){
                it.remove();
            } 
        }
        System.out.println("Coleccion sin multiplos de 3: "+ listaEnteros);

        sc.close();
    }

    public static int pideInt(Scanner sc) {
        int n = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print("Introduce un número entero(-1 para terminar): ");
                n = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                sc.next(); // Limpiar el buffer
            }
        }
        return n;
    }

    public static void pintaPares(Collection<Integer> numeros) {
        boolean primero = true;
        System.out.print("[");
        for (Integer e : numeros) {
            if (e % 2 == 0) {
                if (!primero) {
                    System.out.print(", ");
                }
                System.out.print(e);
                primero = false;
            }
        }
        System.out.println("]");
    }
}


