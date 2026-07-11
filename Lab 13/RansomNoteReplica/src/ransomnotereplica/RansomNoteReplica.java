// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165
package ransomnotereplica;
import java.util.HashMap;
import java.util.Map;
public class RansomNoteReplica {
    public static void main(String[] args) {
        String magazine = "attack at dawn";
        String note = "Attack at dawn";
        if (canReplicateRansomNote(magazine, note)) {
            System.out.println("Yes, Harold can replicate his ransom "
                    + "note exactly.");
        } else {
            System.out.println("No, the magazine has all the right words, "
                    + "but there is a case mismatch.");
        }
    }
    private static boolean canReplicateRansomNote(String magazine, String note) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] magazineWords = magazine.split("\\s");
        for (String word : magazineWords) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        String[] noteWords = note.split("\\s");
        for (String word : noteWords) {
            if (!wordCountMap.containsKey(word) || wordCountMap.get(word)==0) {
                return false; 
            }
            wordCountMap.put(word, wordCountMap.get(word) - 1);
        }
        return true; 
    }
}
