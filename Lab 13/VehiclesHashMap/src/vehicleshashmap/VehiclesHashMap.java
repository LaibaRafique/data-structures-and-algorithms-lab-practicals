// Name: Laiba Rafiq, Roll No: 2022F-BSE-064
package vehicleshashmap;
import java.util.HashMap;
import java.util.Map;
public class VehiclesHashMap {
    public static void main(String[] args) {
        Map<String, String> vehicles = new HashMap<>();
        add(vehicles, "Car", "BMW");
        add(vehicles, "Motorcycle", "Sport Bike");
        add(vehicles, "Truck", "Fire Truck");
        System.out.println("Vehicles HashMap: " + vehicles);
        search(vehicles, "Car");
        remove(vehicles, "Motorcycle");
        System.out.println("Vehicles HashMap after removal: " + vehicles);
    }
    private static void add(Map<String, String> map, String key, String value) {
        map.put(key, value);
        System.out.println("Added: " + key + " - " + value);
    }
    private static void remove(Map<String, String> map, String key) {
        if (map.containsKey(key)) {
            String removedValue = map.remove(key);
            System.out.println("Removed: " + key + " - " + removedValue);
        } else {
            System.out.println("Key not found: " + key);
        }
    }
    private static void search(Map<String, String> map, String key) {
        if (map.containsKey(key)) {
            String value = map.get(key);
            System.out.println("Found: " + key + " - " + value);
        } else {
            System.out.println("Key not found: " + key);
        }
    }
}
