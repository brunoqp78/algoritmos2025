
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Exemplo01Set {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Lista - ArrayList
        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("a");
        System.out.println("Lista:");
        for (int i=0; i< lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Conjunto - HashSet
        System.out.println("Conjunto:");
        Set<String> conjunto = new HashSet<>();
        conjunto.add("a");
        conjunto.add("a");        
        for (String texto : conjunto) {
            System.out.println(texto);
        }

        s.close();
    }
}
