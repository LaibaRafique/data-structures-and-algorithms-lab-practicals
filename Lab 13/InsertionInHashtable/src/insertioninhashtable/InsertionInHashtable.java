// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165
package insertioninhashtable;
class MyHashTable {
    private static final int TABLE_SIZE = 5;
    private Entry[] table;
    static class Entry {
        String key;
        int value;
        Entry next;
        Entry(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    MyHashTable() {
        table = new Entry[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
    }
    private int hash(String key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % TABLE_SIZE);
    }
    public void put(String key, int value) {
        int index = hash(key);
        Entry newEntry = new Entry(key, value);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEntry;
        }
    }
    public void display() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            Entry current = table[i];
            while (current != null) {
                System.out.println("Key: " + current.key + 
                        ", Value: " + current.value);
                current = current.next;
            }
        }
    }
}
public class InsertionInHashtable {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable();
        myHashTable.put("Four", 4);
        myHashTable.put("Nine", 9);
        myHashTable.put("Eight", 8);
        myHashTable.put("One", 1);
        System.out.println("Hashtable after insertion:");
        myHashTable.display();
    }
}
