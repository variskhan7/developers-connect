import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Login System");
        int count =0, you, pass=4545;
       
        while(true){
            System.out.println("please Enter your password");
            you=sc.nextInt();
            if (you==pass){
                System.out.println("You're Welcome ! Login Successfull, ");
                break;}
            else{
                 count++;
                 int left =3- count;
                 if (count==3){
                    System.out.println("Your are Locked");
                    break;
                 }
                 System.out.println("Please enter Correct Password "+"You have " +left + " Attempts left");
                 }                 
        }
    }
    }
    

