import java.util.Scanner;

public class MatrixProduct{
    int[][] array1 = new int[3][3];
    long product = 1;

    Scanner sc = new Scanner(System.in);
    
    
    void getData(){
        System.out.println("enter element of matrix");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                array1 [i][j]=sc.nextInt();
            }
        }

    }


    void Caclculate(){
        product=1;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                product=product*array1[i][j];
            }
        }

    }

    void display(){
        System.out.println("Matrix ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("product= " + product);

    }
    public static void main(String []args){
        MatrixProduct obj=new MatrixProduct();

        obj.getData();
        obj.Caclculate();
        obj.display();

    }
}
