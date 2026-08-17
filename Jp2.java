import java.util.Scanner;
public class Jp2 {
    public static void main(String[] args) { 
        int a,b,c; 
        Scanner sc=new Scanner (System.in);
        System.out.println("enter A number");
        a=sc.nextInt();
        System.out.println("enter B number");
        b=sc.nextInt();
        System.out.println("enter C number");
        c=sc.nextInt();

        if(a>c && a>b){
            System.out.println("A is largest number");
        }
        else if(b>c && b>a){
            System.out.println("B is largest Number");
        }
        else{
            System.out.println("C is largst Number");
        }

}
}
