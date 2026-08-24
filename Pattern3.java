import java.util.Scanner;
public class Pattern3 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n=sc.nextInt();
        int row =1;
        int sp =n-1;
        int st = 1;
        while(row<=n){
            int i = 1;
            while(sp>=i){
                System.out.print(" ");
                i++;
            }
            int j =1;
            while(st>=j){
                System.out.print("*");
                j++;
            }
            System.out.println();
            row++;
            sp--;
            st+=1;
        }


      
        
        
    }
}