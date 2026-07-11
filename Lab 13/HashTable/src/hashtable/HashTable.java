// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165
package hashtable;
import java.util.Hashtable;
import java.util.Scanner;
class HashTable {
    private static final int TEAM_SIZE = 11;
    private Hashtable<Integer, Integer> playerRuns;
    public HashTable() {
        playerRuns = new Hashtable<>();
    }
    public void addPlayerRuns(int playerNumber, int runs) {
        int rank = (runs % TEAM_SIZE) ; 
        playerRuns.put(playerNumber, rank);
    }
    public int getPlayerRank(int playerNumber) {
        return playerRuns.get(playerNumber);
    }
    public static void main(String[] args) {
        HashTable cricketTeam = new HashTable();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= TEAM_SIZE; i++) {
            System.out.print("Enter runs scored by player " + i + ": ");
            int runs = scanner.nextInt();
            cricketTeam.addPlayerRuns(i, runs);
        }
        for (int i = 1; i <= TEAM_SIZE; i++) {
            System.out.println("Player " + i + "'s rank: " 
                    + cricketTeam.getPlayerRank(i));
        }
        scanner.close();
    }
}
