
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exemplo01Map {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Mapas - HashMap
        System.out.println("Mapas:");
        Map<String,String> estados = new HashMap<>();
        estados.put("SP", "São Paulo"); // método que permite adicionar um elemento no dicionário
        estados.put("MG", "Minas Gerais");

        for(Map.Entry<String, String> estado: estados.entrySet()){
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }
        s.close();
    }
}
