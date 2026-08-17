import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        char operator;

        System.out.println("Enter first value:");
        a = sc.nextInt();

        System.out.println("Enter second value:");
        b = sc.nextInt();

        System.out.println("Enter operator (+, -, /, *):");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Sum is = " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction is = " + (a - b));
                break;

            case '/':
                System.out.println("Division is = " + (a / b));
                break;

            case '*':
                System.out.println("Multiplication is = " + (a * b));
                break;

            default:
                System.out.println("Invalid operator");
        }


    }
}