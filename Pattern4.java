import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int currentValue = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(currentValue + " ");
                currentValue = currentValue * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}