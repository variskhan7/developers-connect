import java.util.Scanner;
class RectangleWithMethod{
     /// variable declaration yaha hota hai 
     float length, breath, area; 
     Scanner sc=new Scanner(System.in);

     ///method declaration yaha hota 
     /*access-modifier return-type method-name(argumentlist (data-type variable-name, nextdata-type...))
     {
        body of the method

        return value;
     }
     */
    void getData()
    {
       System.out.println("Enterl length ");
       length=sc.nextFloat();
       System.out.println("Enterl breath ");
       breath=sc.nextFloat();
    }

    void calculateArea()
    {
        area= length*breath;
    
    }

    void displayData()
    {
        System.out.println("lenth is" + length);
        System.out.println("lenth is" +breath);
        System.out.println("Rectagle Area is" + area);
    }

    public static void main (String [] args)
    {
        Rectangle obj1=new Rectangle();
        obj1.getData();
        obj1.calculateArea();
        obj1.displayData();
    }
}

/*
this program defines a student class with attributes like student id, name,age, and grade
it also provides method to set and get these attribute,
aslog with a method to 
display the students details
 */