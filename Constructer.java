
import java.util.Scanner;

class Book {
    String title;
    String author;
    float price;


    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0f;
    }

  
    public Book(String tit, String aut, float prc) {
        this.title = tit;
        this.author = aut;
        this.price = prc;
    }


    void display() {
        System.out.println("Title is: " + title);
        System.out.println("Author Name is: " + author);
        System.out.println("Book Price is: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Book b1 = new Book();
        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("\nEnter book title:");
        String tit = sc.nextLine();

        System.out.println("Enter author name:");
        String aut = sc.nextLine();

        System.out.println("Enter book price:");
        float prc = sc.nextFloat();

        Book b2 = new Book(tit, aut, prc);

        System.out.println("\nParameterized Constructor:");
        b2.display();

        sc.close();
    }
}
