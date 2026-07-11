// Name: Laiba Rafiq, Roll No: 2022F-BSE-064
package ransomnote;
import java.util.HashMap;
import java.util.Map;
public class RansomNote {
    public static void main(String[] args) {
        String magazine = "send 1 million dollars";
        String note = "Send 1 million dollars";
        if (canReplicateRansomNote(magazine, note)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    private static boolean canReplicateRansomNote(String magazine, String note) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : magazine.split("\\s+")) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (String word : note.split("\\s+")) {
            if (!wordCountMap.containsKey(word) || wordCountMap.get(word) <= 0) {
                return false;
            }
            wordCountMap.put(word, wordCountMap.get(word) - 1);
        }
        return true;
    }
}
