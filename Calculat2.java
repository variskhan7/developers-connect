import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Calculat2 {
    public static void main(String[] args) throws IOException
     {
        int option,num1,num2;
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the Simple Calculator");
        System.out.println("select your option =>");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");
        System.out.println("Choose your option:");
        option=Integer.parseInt(br.readLine());
        System.out.println("enter your Number");
        num1=Integer.parseInt(br.readLine());
        System.out.println("enter your second number");
        num2=Integer.parseInt(br.readLine());

        switch(option){
            case 1: System.out.println("addition is"+(num1+num2));
            break;
            case 2: System.out.println("Diffrence is"+(num1-num2));
            break;
            case 3: System.out.println("multiplication is"+(num1*num2));
            break;
            case 4:
                if (num2!=0) 
                 System.out.println("Division is"+(num1/num2));

                else
                    System.out.println("number can't be divide by zero");   
            break;

            case 5:
                System.exit(0);
            default:
                System.out.println("invalid value");
        }      
        
    }
}
