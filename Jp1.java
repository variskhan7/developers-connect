import java.util.Scanner;
public class Jp1 {
    public static void main(String[] args) {
        int h,e,m,s,d,sst; 
        float sum=0, per;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter Hindi subject number");
        h=sc.nextInt();
        System.out.println("enter english marks");
        e=sc.nextInt();
        System.out.println("enter maths marks");
        m=sc.nextInt();
        System.out.println("enter your science marks");
        s=sc.nextInt();
        System.out.println("enter your Drawing marks");
        d=sc.nextInt();
        System.out.println("enter your social science marks");
        sst=sc.nextInt();
        sum=h+e+m+s+d+sst;
        per=sum/6;
        System.out.println("your toatl marks = "+(sum)+"\nAnd your percentage is= "+(per));
        if(per>=90){
            System.out.println("Grade A");
        }
        else if(per>=80){
            System.out.println("Grade B");
        }
        else if(per>=70){
            System.out.println("Grade C");
        }
        else if(per>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade FAil");
        }

      
    }
    
}
