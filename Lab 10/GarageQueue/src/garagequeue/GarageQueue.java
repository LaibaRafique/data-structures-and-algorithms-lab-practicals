// Name: Laiba Rafiq, Roll Number: 2022F-BSE-064
package garagequeue;
import java.util.LinkedList;
import java.util.Queue;
public class GarageQueue {
    public static void main(String[] args) {
        Queue<String> garageQueue = new LinkedList<>();
        int movesCount = 0;
        String[] inputLines = {"A NGR921", "D SGI329", "A FCQ581", 
            "A LMB560", "D YYN222", "A GZF323"};
        for (String inputLine : inputLines) {
            char action = inputLine.charAt(0);
            String licensePlate = inputLine.substring(2);
            if (action == 'A') {
                if (garageQueue.size() < 3) {
                    garageQueue.offer(licensePlate);
                    System.out.println("Car " + licensePlate + 
                            " has arrived. Welcome!");
                } else {
                    System.out.println("Car " + licensePlate + 
                            " cannot enter. Garage is full.");
                }
            } else if (action == 'D') {
                if (garageQueue.contains(licensePlate)) {
                    while (!garageQueue.peek().equals(licensePlate)) {
                        String movedCar = garageQueue.poll();
                        movesCount++;
                        System.out.println("Car " + movedCar + 
                                " moved to allow departure of Car " 
                                + licensePlate);
                        garageQueue.offer(movedCar);
                    }
                    garageQueue.poll();
                    System.out.println("Car " + licensePlate + 
                            " has departed. Moved out " + movesCount + 
                            " times.");
                    movesCount = 0;
                } else {
                    System.out.println("Car " + licensePlate + 
                            " is not in the garage. Departure canceled.");
                }
            }
        }
    }
}
