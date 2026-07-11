// Name: Laiba Rafiq, Roll No:2022F-BSE-064
package accountbalances;
public class AccountBalances {
    public static void main(String[] args) {
        int[] accountBalances = new int[10];
        for (int i=0;i<accountBalances.length;i++) {
            accountBalances[i]=i*100000;
        }
        System.out.println("Account Balances:");
        for (int i=0;i<accountBalances.length;i++) {
            System.out.println("Account No. "+i+ ": "+accountBalances[i]);
        }
        System.out.println("\nAccounts with Low Balance:");
        for (int i=0;i<accountBalances.length;i++) {
            if (accountBalances[i]<10000) {
                System.out.println("Account No. "+i+": Low Balance");
            }
        }
    }
}

