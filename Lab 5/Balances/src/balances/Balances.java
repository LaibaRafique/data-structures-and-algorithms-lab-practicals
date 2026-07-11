// Name: Muhammad Ahmer, Roll No:2022F-BSE-165
package balances;
public class Balances {
    public static void main(String[] args) {
        int[] accountBalances=new int[10];
        for (int i=0;i<accountBalances.length;i++) {
            accountBalances[i]=i*100000;
        }
        System.out.println("Accounts with Low Balance:");
        for (int i=0;i<accountBalances.length;i++) {
            if (accountBalances[i] < 10000) {
                System.out.println("Account No. "+i+": Low Balance");
            }
        }
    }
}
