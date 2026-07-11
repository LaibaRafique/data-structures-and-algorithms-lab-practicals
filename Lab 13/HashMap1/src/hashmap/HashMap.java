// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165
package hashmap;
class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] buckets;
    private int capacity;
    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }
    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new Entry[capacity];
    }
    public void put(K key, V value) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new Entry<>(key, value);
        } else {
            Entry<K, V> current = buckets[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Entry<>(key, value);
        }
    }
    public V get(K key) {
        int index = getIndex(key);

        Entry<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    public void remove(K key) {
        int index = getIndex(key);
        Entry<K, V> current = buckets[index];
        Entry<K, V> prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    private int getIndex(K key) {
        return key.hashCode() % capacity;
    }
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
public class HashMap {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Eight", 8);
        myHashMap.put("Four", 4);
        myHashMap.put("One", 1);
        System.out.println("Value for key 'Four': " + myHashMap.get("Four"));
        myHashMap.remove("One");
        System.out.println("Value for key 'One': " + myHashMap.get("One"));
    }
}
