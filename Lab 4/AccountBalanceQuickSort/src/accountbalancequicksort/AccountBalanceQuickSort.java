// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package accountbalancequicksort;
public class AccountBalanceQuickSort {
    public static void main(String[] args) {
        int n = 5; 
        int[] accountNumbers = new int[n];
        int[] balances = new int[n];
        //Initialize account balances with random values
        for (int i = 0; i < n; i++) {
            accountNumbers[i] = i + 1; 
        //Assuming account numbers start from 1
            balances[i] = (int) (Math.random() * 100001); 
        //Random balance between 0 and 100000
        }
        //Print the unsorted array
        System.out.println("Unsorted Accounts:");
        printAccounts(accountNumbers, balances);
        //Sort the array using QuickSort
        quickSort(accountNumbers, balances, 0, n - 1);
        //Print the sorted array
        System.out.println("\nSorted Accounts (by balance):");
        printAccounts(accountNumbers, balances);
    }
    private static void quickSort(int[] accountNumbers, 
            int[] balances, int low, int high) {
        if (low < high) {
            int pi = partition(accountNumbers, balances, low, high);

            quickSort(accountNumbers, balances, low, pi - 1);
            quickSort(accountNumbers, balances, pi + 1, high);
        }
    }
    private static int partition(int[] accountNumbers, 
            int[] balances, int low, int high) {
        int pivot = balances[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (balances[j] > pivot) {
                i++;
                //Swap accountNumbers[i] and accountNumbers[j]
                int tempAccNo = accountNumbers[i];
                accountNumbers[i] = accountNumbers[j];
                accountNumbers[j] = tempAccNo;
                //Swap balances[i] and balances[j]
                int tempBalance = balances[i];
                balances[i] = balances[j];
                balances[j] = tempBalance;
            }
        }
        //Swap accountNumbers[i+1] and accountNumbers[high]
        int tempAccNo = accountNumbers[i + 1];
        accountNumbers[i + 1] = accountNumbers[high];
        accountNumbers[high] = tempAccNo;
        //Swap balances[i+1] and balances[high]
        int tempBalance = balances[i + 1];
        balances[i + 1] = balances[high];
        balances[high] = tempBalance;

        return i + 1;
    }
    private static void printAccounts(int[] accountNumbers, int[] balances) {
        for (int i = 0; i < accountNumbers.length; i++) {
            System.out.println("Account No. " + accountNumbers[i] 
                    + " Balance " + balances[i]);
        }
    }
}
