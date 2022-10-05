import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) {
        
    // Treemap

    Map <String, String> map = new TreeMap<>();

    map.put("Chave_C","Letra C");
    map.put("Chave_A","Letra A");
    map.put("Chave_D","Letra D");
    map.put("Chave_B","Letra B");

    for ( Map.Entry<String, String> entry : map.entrySet()){
        System.out.println("chave: "+entry.getKey()+", valor: "
        + entry.getValue() ); // Iteração com o TreeMap
    }


/*
        // HashMap
        Map<String,String> hashmap = new HashMap<>();
        hashmap.put("Chave_C","Letra C");
        hashmap.put("Chave_A","Letra A");
        hashmap.put("Chave_D","Letra D");
        hashmap.put("Chave_B","Letra B");
        
        for (Map.Entry<String, String> entry : hashmap.entrySet()){
            System.out.println("CHAVE: "+ entry.getKey()+", VALOR: " 
            + entry.getValue());
        }
        */

    }
}
