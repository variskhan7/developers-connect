
import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;


    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year= 0;
    }

  
    public Car(String brd, String mod, int yr) {
        this.brand = brd;
        this.model = mod;
        this.year = yr;
    }


    void display() {
        System.out.println("Brand is: " + brand);
        System.out.println("Model Name is: " + model);
        System.out.println("Year is: " + year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Car c1 = new Car();
        System.out.println("Default Constructor:");
        c1.display();

        System.out.println("\nEnter brand name:");
        String brand = sc.nextLine();

        System.out.println("Enter model name:");
        String model = sc.nextLine();

        System.out.println("Enter year:");
        int year = sc.nextInt();

        Car C2 = new Car(brand, model, year);

        System.out.println("\nParameterized Constructor:");
        C2.display();


    }
}
