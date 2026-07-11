// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package bankmanagementsystem;
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
        System.out.println("Account Holder: "+ accountHolder);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Balance: $" +balance);
    }
}
class Node {
    BankAccount account;
    Node next;
    Node(BankAccount account) {
        this.account=account;
        this.next=null;
    }
}
class BankManagementSystem {
    private static Node head=null;
    private static void insertNode(BankAccount account) {
        Node newNode=new Node(account);
        if (head==null || head.account.accountNumber>account.accountNumber) {
            newNode.next=head;
            head=newNode;
        } else {
            Node current=head;
            while (current.next != null && 
                    current.next.account.accountNumber<account.accountNumber) {
                current=current.next;
            }
            newNode.next=current.next;
            current.next=newNode;
        }
    }
    private static void displayAccounts(Node start) {
        Node current=start;
        while (current != null) {
            current.account.displayAccountInfo();
            current=current.next;
        }
    }
    private static Node sortAccounts(Node start) {
        if (start==null || start.next==null) {
            return start;
        }
        Node mid=findMiddle(start);
        Node midNext=mid.next;
        mid.next=null;

        Node left=sortAccounts(start);
        Node right=sortAccounts(midNext);

        return merge(left,right);
    }    
    private static Node findMiddle(Node start) {
        if (start==null) {
            return start;
        }
        Node slow=start;
        Node fast=start.next;

        while (fast != null) {
            fast=fast.next;
            if (fast != null) {
                slow=slow.next;
                fast=fast.next;
            }
        }
        return slow;
    }   
    private static Node merge(Node left, Node right) {
        Node result=null;
        if (left==null) {
            return right;
        }
        if (right==null) {
            return left;
        }
        if (left.account.accountNumber <= right.account.accountNumber) {
            result=left;
            result.next=merge(left.next, right);
        } else {
            result=right;
            result.next=merge(left, right.next);
        }
        return result;
    }
    public static void main(String[] args) {      
        BankAccount account1=new BankAccount("Ahmer",  658972, 1000.0);
        BankAccount account2=new BankAccount("Arsal",  123456, 500.0);
        BankAccount account3=new BankAccount("Sameer", 987654, 1500.0);
        
        insertNode(account1);
        insertNode(account2);
        insertNode(account3);
       
        System.out.println("All Accounts (Unsorted):");
        displayAccounts(head);
        
        head = sortAccounts(head);
        
        System.out.println("");
        System.out.println("All Accounts (Sorted by Account Number):");
        displayAccounts(head);
    }
}
