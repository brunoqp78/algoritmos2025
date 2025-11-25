
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exemplo02Map {
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
        System.out.println("Digite uma sigla de estado:");
        String siglaEstado = s.nextLine();
        System.out.println("O estado é " + estados.get(siglaEstado));
        System.out.println("O estado é " + estados.getOrDefault(siglaEstado, "Não Definido"));
        s.close();
    }
}
