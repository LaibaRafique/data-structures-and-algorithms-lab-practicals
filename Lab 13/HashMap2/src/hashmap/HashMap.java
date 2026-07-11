// Name: Laiba Rafiq, Roll No: 2022F-BSE-064
package hashmap;
class MyHashMap {
    private static final int SIZE = 10; 
    private Entry[] table;
    static class Entry {
        int key;
        int value;
        Entry next;
        Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    MyHashMap() {
        table = new Entry[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = null;
        }
    }
    private int hash(int key) {
        return key % SIZE;
    }
    public void put(int key, int value) {
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
    public int get(int key) {
        int index = hash(key);
        Entry current = table[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return -1; 
    }
}
public class HashMap {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(8, 12);
        myHashMap.put(9, 4);
        myHashMap.put(10, 23);
        System.out.println("Value for key 8: " + myHashMap.get(8));
        System.out.println("Value for key 9: " + myHashMap.get(9));
        System.out.println("Value for key 10: " + myHashMap.get(10));
        System.out.println("Value for key 1: " + myHashMap.get(1));
    }
}
