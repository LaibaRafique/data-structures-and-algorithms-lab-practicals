// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package bankmanagement;
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolder,int accountNumber,double balance) {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
class BankManagement {
    private static BankAccount[] accounts = new BankAccount[10];
    private static int size=0;

    private static void insertAccount(BankAccount account) {
        if (size == accounts.length) {
            BankAccount[] newArray=new BankAccount[2 * size];
            System.arraycopy(accounts, 0, newArray, 0, size);
            accounts=newArray;
        }
        int index=0;
        while (index < size && accounts[index].accountNumber 
                < account.accountNumber) {
            index++;
        }
        System.arraycopy(accounts, index, accounts, index + 1, size - index);
        accounts[index]=account;
        size++;
    }
    private static void displayAccounts() {
        for (int i = 0; i < size; i++) {
            accounts[i].displayAccountInfo();
        }
    }
    private static BankAccount searchAccount(int accountNumber) {
        for (int i = 0; i < size; i++) {
            if (accounts[i].accountNumber==accountNumber) {
                return accounts[i];
            }
        }
        return null; 
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ahmer", 658972, 1000.0);
        BankAccount account2 = new BankAccount("Arsal", 123456, 500.0);
        BankAccount account3 = new BankAccount("Sameer", 987654, 1500.0);
        insertAccount(account1);
        insertAccount(account2);
        insertAccount(account3);
        System.out.println("All Accounts (Unsorted):");
        displayAccounts();
        System.out.println("");
        int searchAccountNumber = 123456;
        BankAccount foundAccount = searchAccount(searchAccountNumber);
        if (foundAccount != null) {
            System.out.println("Account Found:");
            foundAccount.displayAccountInfo();
        } else {
            System.out.println("Account not found.");
        }
        System.out.println("");
        System.out.println("All Accounts (Sorted by Account Number):");
        displayAccounts();
    }
}
