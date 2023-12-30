package task3;

import pack.ClearScreen;

import java.util.Scanner;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}


class ATM {
    ClearScreen clrscr=new ClearScreen();
    private BankAccount userAccount;
    Scanner scanner;

    public ATM(BankAccount account) {
        this.userAccount = account;
        this.scanner = new Scanner(System.in);
    }


    void displayMenu() {
        clrscr.cls();
        System.out.println("\n********************************** ATM INTERFACE **********************************");
        System.out.print("\t\t\t1. Withdraw          ");
        System.out.println("2. Deposit");
        System.out.print("\t\t\t3. Check Balance     ");
        System.out.println("4. Exit");
        System.out.println("***********************************************************************************");
        System.out.print("Enter your choice: ");
    }


    void withdraw() {
        System.out.print("Enter the withdrawal amount: ");
        double amount = scanner.nextDouble();

        if (userAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: " + userAccount.getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }


    void deposit() {
        System.out.print("Enter the deposit amount: ");
        double amount = scanner.nextDouble();
        userAccount.deposit(amount);
        System.out.println("Deposit successful. Updated balance: " + userAccount.getBalance());
    }


    void checkBalance() {
        System.out.println("Current balance: " + userAccount.getBalance());
    }

}

    public class ATMinterface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Initial balance
        ATM atm = new ATM(userAccount);

        int choice;
        do {

            atm.displayMenu();
            choice = atm.scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.withdraw();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if(choice!=4) {
                System.out.println("Press any number and enter key to continue.....");
                atm.scanner.nextInt();
            }
        } while (choice != 4);
        atm.scanner.close();
    }
}
