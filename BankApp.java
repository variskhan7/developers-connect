import java.util.Scanner;
class BankApp{
    String custName;
    int accNum;
    float balance;
    Scanner sc=new Scanner(System.in);

    BankApp()  ///constructer without parameter
    {
          this.custName="";
          this.accNum=0;
          this.balance=0.0f;

    }

    BankApp(String name, int accNum, float bal)   ///// constructure 2nd  with prameter
    {
          this.custName=name;
          this.accNum=accNo;
          this.balance=bal; ///// aap direct value user se bhi ;e sakte ho

    }

    }
    void depositAmount(int accNum, float amt)
    {

    }
    void withdrawAmount(int accNum, float amt)
    {

    }
    float checkBalance()
    {
        return balance;
    }

    void displayDetails()
    {
        
    }

    public static void main()
    {
         
        BankAccount obj=new BankAccount();
        BankAccount obj1=new BankAccount("varis", 123456789, 500.50f);
        //dusra method value pass ke liye (direcct)
        BankAccount obj2=new BankAccount();
        obj2.custName="GLA";
        obj2.balance=1447.67f;

        String name;
          System.out.println("enter bank holder name");
          name=sc.next();
        St  name;
          System.out.println("enter bank holder name");
          name=sc.next();

        obj.deposit();
        obj.withdrawAmount();
        System.out.println(+obj.checkBalance());


    }
}