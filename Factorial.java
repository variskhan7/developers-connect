import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, fact=1;
        System.out.println("enter a number to find factorial");
        n=sc.nextInt();
        for(int i=1 ;i<=n;i++){
        fact=fact*i;}
        System.out.println(fact);
    }
    
}
