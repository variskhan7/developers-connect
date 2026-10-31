class A{
    String name;
    
    public void Name(String n)
    {
        this.name=n;

        System.out.println("my name is "+name );
    }
}

class B extends A{
    int age;

   
    public void Age( int a)
    {
        this.age=a;

        System.out.println("my age is "+age );  
    }

}

class C extends B{
    int rollno;

    public void rollNumber(int Rn)
    {
        this.rollno=Rn;
        System.out.println("my roll number  is "+rollno );
    }
}

public class Multilevel{
    public static void main(String[] args) {
    C obj3 =new C();
    obj3.Name("prince bhai");
    obj3.Age( 19);
    obj3.rollNumber(1243455677);

     
    }
}