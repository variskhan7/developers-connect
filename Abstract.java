abstract class Parent{
    abstract void area(); 
}

class Circle extends Parent{
    void area()
    {
        System.out.println("circle formula= 2*pai*r2");
    }

}

class Square extends Circle {
    void area()
    {
        System.out.println("square area= sid*side");
    }
}

class Abstract extends Square{
    public static void main(String []args){
        Circle obj1=new Circle();
        Square obj2=new Square();
        obj1.area();
        obj2.area();
    }

}