////run time polymorphism

class A{
    void display()
    {
        System.out.println("My name is khan");
    }

}

class B extends A{
    void print()
    {
        System.out.println(" i am from mathura");
    }

}

class Polymorphism extends B{
    void display()
    {
        System.out.println("my name is not khan");
    }

    public static void main(String[] args) {
        Polymorphism obj1=new Polymorphism();
        obj1.display();
        
    }

}