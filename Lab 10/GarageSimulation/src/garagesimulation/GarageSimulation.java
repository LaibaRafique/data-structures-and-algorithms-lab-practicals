// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package garagesimulation;
import java.util.LinkedList;
import java.util.Queue;
class Car {
    String licensePlate;
    int moves;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.moves = 0;
    }
}
public class GarageSimulation {
    private static final int MAX_CAPACITY = 5;
    public static void processCars(String[] inputLines) {
        Queue<Car> garageQueue = new LinkedList<>();
        for (String input : inputLines) {
            char action = input.charAt(0);
            String licensePlate = input.substring(2);
            if (action == 'A') {
                processArrival(garageQueue, licensePlate);
            } else if (action == 'D') {
                processDeparture(garageQueue, licensePlate);
            }
        }
    }
    private static void processArrival(Queue<Car> garageQueue, 
            String licensePlate) {
        if (garageQueue.size() < MAX_CAPACITY) {
            Car newCar = new Car(licensePlate);
            garageQueue.offer(newCar);
            System.out.println("Car " + newCar.licensePlate + 
                    " arrived. Welcome!");
        } else {
            System.out.println("Car " + licensePlate + 
                    " arrived but there is no room. Sorry!");
        }
    }
    private static void processDeparture(Queue<Car> garageQueue, 
            String licensePlate) {
        int moves = 0;
        boolean carFound = false;
        while (!garageQueue.isEmpty()) {
            Car currentCar = garageQueue.poll();
            moves++;
            if (currentCar.licensePlate.equals(licensePlate)) {
                carFound = true;
                break;
            }
        }
        if (carFound) {
            System.out.println("Car " + licensePlate + 
                    " departed. Moved out " + (moves - 1) + " times.");
        } else {
            System.out.println("Car " + licensePlate + 
                    " not found in the garage.");
        }
    }
    public static void main(String[] args) {
        String[] inputLines = {"A DDX551", "A KKA994", "D DDX551", 
            "A ALW562", "D DDX551"};
        processCars(inputLines);
    }
}
