import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,table;
        System.out.println("enter a number to print table");
        n=sc.nextInt();
        for(int i=1; i<=10; i++){
            table=n*i;
            System.out.println(n + " x " + i + " = " +table);
        }     
    }
    
}
