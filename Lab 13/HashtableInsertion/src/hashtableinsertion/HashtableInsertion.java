// Name: Laiba Rafiq, Roll No: 2022F-BSE-064
package hashtableinsertion;
import java.util.Hashtable;
import java.util.Map;
public class HashtableInsertion {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Java", 4);
        hashtable.put("Hi", 5);
        hashtable.put("Python", 6);
        hashtable.put("Laiba", 7);
        System.out.println("Hashtable after insertion:");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
