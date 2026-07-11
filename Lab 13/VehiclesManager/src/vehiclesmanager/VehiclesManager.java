// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165
package vehiclesmanager;
import java.util.HashMap;
import java.util.Map;
public class VehiclesManager {
    private Map<String, String> vehicles;
    public VehiclesManager() {
        vehicles = new HashMap<>();
    }
    public void addVehicle(String key, String value) {
        vehicles.put(key, value);
        System.out.println("Vehicle added: " + key + " - " 
                + value);
    }
    public void removeVehicle(String key) {
        if (vehicles.containsKey(key)) {
            vehicles.remove(key);
            System.out.println("Vehicle removed: " + key);
        } else {
            System.out.println("Vehicle not found: " + key);
        }
    }
    public void searchVehicle(String key) {
        if (vehicles.containsKey(key)) {
            System.out.println("Vehicle found: " + key + " - " 
                    + vehicles.get(key));
        } else {
            System.out.println("Vehicle not found: " + key);
        }
    }
    public static void main(String[] args) {
        VehiclesManager vehiclesManager = new VehiclesManager();
        vehiclesManager.addVehicle("Car", "Toyota");
        vehiclesManager.addVehicle("Motorcycle", "Honda");
        vehiclesManager.addVehicle("Truck", "Truck");
        vehiclesManager.searchVehicle("Car");
        vehiclesManager.removeVehicle("Motorcycle");
        vehiclesManager.searchVehicle("Motorcycle");
    }
}
