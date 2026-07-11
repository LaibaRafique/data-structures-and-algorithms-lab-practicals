// Name: Laiba Rafiq, Roll No: 2022F-BSE-064
package inventoryprogram;
import java.util.Scanner;
class InventoryItem {
    String itemName;
    int quantity;
    InventoryItem(String name, int quantity) {
        this.itemName = name;
        this.quantity = quantity;
    }
}
class DoublyLinkedListNode {
    InventoryItem data;
    DoublyLinkedListNode prev, next;
    DoublyLinkedListNode(InventoryItem item) {
        this.data = item;
        this.prev = null;
        this.next = null;
    }
}
class InventoryManagementSystem {
    private DoublyLinkedListNode head, tail;
    InventoryManagementSystem() {
        this.head = null;
        this.tail = null;
    }
    void addItem(InventoryItem item) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Item added to inventory: " + item.itemName);
    }
    void removeItem(String itemName) {
        DoublyLinkedListNode current = head;
        while (current != null) {
            if (current.data.itemName.equals(itemName)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                System.out.println("Item removed from inventory: " + itemName);
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found in inventory: " + itemName);
    }
    void displayInventory() {
        System.out.println("Current Inventory:");
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data.itemName + ": " 
                    + current.data.quantity);
            current = current.next;
        }
    }
}
public class InventoryProgram {
    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = 
                new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Display Inventory");
        System.out.println("4. Exit");
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.next();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    InventoryItem newItem = new InventoryItem(itemName, 
                            quantity);
                    inventorySystem.addItem(newItem);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = scanner.next();
                    inventorySystem.removeItem(itemToRemove);
                    System.out.println("");
                    break;
                case 3:
                    inventorySystem.displayInventory();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. "
                            + "Please enter a valid option.");
            }
        }
    }
}
