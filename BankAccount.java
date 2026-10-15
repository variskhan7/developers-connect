import java.util.Scanner;

class BankAccount {
    String name;
    int accountNumber;
    double balance;

   
    void openAccount(String n, int accNo) {
        name = n;
        accountNumber = accNo;
        balance = 0;
        System.out.println("Account created successfully!");
    }

   
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }


    void checkBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs. " + balance);
    }

    void displayDetails()
    {

    }

    public static void main()
    {
        BankAccount obj=new BankAccount();
        openAccount();
        deposit();
        withdrawAmount();
        checkBalance();


    }
 }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        account.openAccount(name, accountNumber);

        int choice;

        do {
            System.out.println("Welcome");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our banking application.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
