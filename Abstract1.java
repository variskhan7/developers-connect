abstract class Account{
    public abstract void deposite( double amount);
    public abstract void withdraw(double amount);
    public Account(double initialBalance)
    {
        double initialBalance=10501;
    }

    public double getBalance()
    {
        return balance;
    }
} 


class SavingsAccount extends Account{
    public double interestRate;
    public SavingsAccount(double initialBalance, double interestRate)
    {
        System.out.println("Saving Account Initial Balance is: "+initialBalance);
    }
    public void deposite(double amount)
    {
        System.out.println("Deposit Amount in Saving Account is: "amount);
    }
    public void withdraw(double amount)
    {
        System.out.println("Withdraw Amount from Saving Account is: "amount);
    }
    public void addinteret()
    {
        
    }
}

Class CheckingAccount extends Account{
    public CheckingAccount(double initialBalance)
    {

    }

    public void deposit(double amount)
    {

    }

    public void withdraw(double amount)
    {

    }
}

class Abstract1 extends SavingsAccount,CheckingAccount{
    public static void main(String []args){
        Abstract1 obj1=new Abstract1();


    }
}