// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165
package phonebooklru;
import java.util.HashMap;
class Contact {
    String name;
    String phoneNumber;
    Contact prev;
    Contact next;
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
class LRUCache {
    private final int capacity;
    private HashMap<String, Contact> cache;
    private Contact head;
    private Contact tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
    }
    public void addContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        if (cache.size() >= capacity) {
            cache.remove(head.name);
            removeContact(head);
        }
        cache.put(name, newContact);
        moveToTail(newContact);
    }
    public void deleteContact(String name) {
        if (cache.containsKey(name)) {
            Contact contactToDelete = cache.get(name);
            cache.remove(name);
            removeContact(contactToDelete);
        }
    }
    public void displayContactsLRU() {
        Contact current = tail;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Phone: " 
                    + current.phoneNumber);
            current = current.prev;
        }
    }
    private void moveToTail(Contact contact) {
        if (tail == null) {
            head = tail = contact;
        } else {
            tail.next = contact;
            contact.prev = tail;
            tail = contact;
        }
    }
    private void removeContact(Contact contact) {
        if (contact.prev != null) {
            contact.prev.next = contact.next;
        } else {
            head = contact.next;
        }
        if (contact.next != null) {
            contact.next.prev = contact.prev;
        } else {
            tail = contact.prev;
        }
    }
}
public class PhoneBookLRU {
    public static void main(String[] args) {
        LRUCache phoneBook = new LRUCache(5);
        phoneBook.addContact("Ali", "03002387468");
        phoneBook.addContact("Kashan", "03358445689");
        phoneBook.addContact("Faizan", "03337845207");
        System.out.println("Contacts in LRU order:");
        phoneBook.displayContactsLRU();
        phoneBook.deleteContact("Kashan");
        phoneBook.addContact("Hashir", "03004115782");
        phoneBook.addContact("Talha", "03349923370");
        System.out.println("\nUpdated contacts in LRU order:");
        phoneBook.displayContactsLRU();
    }
}
