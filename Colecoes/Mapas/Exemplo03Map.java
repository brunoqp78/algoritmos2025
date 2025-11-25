
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exemplo03Map {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada= s.nextLine();
        // Mapas - HashMap
        Map<Character,Integer> contador = new HashMap<>();
        for (Character letra : entrada.toCharArray()) {
            contador.putIfAbsent(letra, 0);
            contador.replace(letra, contador.get(letra)+1);
        }

        for(Map.Entry<Character, Integer> letra: contador.entrySet()){
            System.out.println(letra.getKey() + " ocorreu " + letra.getValue() + " vezes.");
        }

        s.close();
    }
}
