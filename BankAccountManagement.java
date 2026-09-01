import java.util.Scanner;

class BankAccountManagement {

    String Username;
    Long Ac_no;
    String IFSC;
    int dep;
    int withdrawal;
    short PIN;
    double amount = 0L;
    String Address;
    BankAccountManagement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        Username = sc.nextLine();
        System.out.println("Enter your Account Number: ");
        Ac_no = sc.nextLong();
        System.out.println("Enter your IFSC code: ");
        sc.next();
        IFSC = sc.nextLine();
        System.out.println("Enter your Opening Amount: ");
        amount = sc.nextInt();
        System.out.println("Enter your PIN: ");
        PIN = sc.nextShort();
        System.out.println("Enter your Address: ");
        sc.next();
        Address = sc.nextLine();
    }
    public void changePIN() {
        System.out.println("Enter old PIN: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == PIN) {
            System.out.println("Enter new PIN: ");
            PIN = sc.nextShort();
        }
        else {
            System.out.println("Incorrect PIN");
        }
    }
    public void deposit() {
        System.out.println("Enter amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        dep = sc.nextInt();
        if (dep > 0) {
            amount = amount + dep;
            System.out.println("Current Amount is: " + amount);
            System.out.println("Transaction complete!");
        }
        else {
            System.out.println("Transaction declined!");
        }
    }
    public void withdraw() {
        System.out.println("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        withdrawal = sc.nextInt();
        if (withdrawal > 0) {
            amount = amount - withdrawal;
            System.out.println("New Amount is: " + amount);
        }
        else {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BankAccountManagement obj = new BankAccountManagement();
        obj.deposit();
        obj.changePIN();
        obj.withdraw();
    }
}
