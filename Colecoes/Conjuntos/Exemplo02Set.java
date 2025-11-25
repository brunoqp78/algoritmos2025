
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Exemplo02Set {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Lista - ArrayList
        List<String> lista = new ArrayList<>();
        System.out.println("Lista:");
        for (int i=0; i< 10; i++) {
            lista.add("a");
        }
        for(String texto : lista){
            System.out.println(texto);
        }
        /*
        for(int i=0; i< lista.size(); i++){
            String texto = lista.get(i);
            System.out.println(texto);
        }*/


        // Conjunto - HashSet
        System.out.println("Conjunto:");
        Set<String> conjunto = new HashSet<>();
        for (int i=0; i< 10; i++) {
            conjunto.add("a");
        }
        for (String texto : conjunto) {
            System.out.println(texto);
        }

        s.close();
    }
}
