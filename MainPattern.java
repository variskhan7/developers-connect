import java.util.*;
class MainPattern{

Scanner sc= new Scanner(System.in);
public  int row;
public  char ch1, ch2;
//get data
    void getData(){
   System.out.print("Enter rows: ");
        row = sc.nextInt();

        System.out.print("Enter second char: ");
        ch2 = sc.next().charAt(0);
        }
//pattern - 1
    void Pattern1(int n) {
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print("$");
            }
           
            for(int j=i; j<=n; j++){
                System.out.print("#");
            }
            System.out.println();
        }
            // System.out.println();
        }
    
//pattern - 2
    void Pattern2(int n , char s1,char s2){
        
        
    }
    public class PatternImp {
    public static void main(String[] args){
        MainPattern obj = new MainPattern();
        obj.getData();
        obj.Pattern1(obj.row);

    }
}
}



/*
##### 
$####
$$###
$$$##
$$$$#*/