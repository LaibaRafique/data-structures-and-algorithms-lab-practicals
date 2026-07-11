// Name: Laiba Rafiq, Roll No: 2022F-BSE-064
package cricketteamranking;
import java.util.Hashtable;
import java.util.Scanner;
public class CricketTeamRanking {
    public static void main(String[] args) {
        HashTable<String, Integer> playerRuns = new HashTable<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 11; i++) {
            System.out.print("Enter runs for Player " + i + ": ");
            int runs = scanner.nextInt();
            String playerName = "Player" + i;
            playerRuns.put(playerName, runs);
        }
        System.out.println("\nPlayer Runs:");
        for (String playerName : playerRuns.keys()) {
            int runs = playerRuns.get(playerName);
            System.out.println(playerName + ": " + runs);
        }
        System.out.println("\nPlayer Ranks:");
        for (String playerName : playerRuns.keys()) {
            int runs = playerRuns.get(playerName);
            int rank = runs % 11;
            System.out.println(playerName + ": Rank#" + rank);
        }
    }
}
class HashTable<K, V> {
    private static final int SIZE = 11; 
    private Entry<K, V>[] table;

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    HashTable() {
        table = new Entry[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = null;
        }
    }
    private int hash(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % SIZE);
    }
    public void put(K key, V value) {
        int index = hash(key);
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEntry;
        }
    }
    public V get(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null; 
    }
    public Iterable<K> keys() {
        java.util.List<K> keysList = new java.util.ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            Entry<K, V> current = table[i];
            while (current != null) {
                keysList.add(current.key);
                current = current.next;
            }
        }
        return keysList;
    }
}
