class Animal{
    String name;

    void eat(){
        System.out.println(name+ " ");

    }

    void sleep(){
        System.out.println(name +"sleeping");
    }

}

class Dog extends Animal{
    void bark(){
        System.out.println(name +"says woof");
    }
}

public class Inheritance{
    public static void main(String []args){
        Dog d = new Dog();
        d.name = "Buddy of varis khan";
        d.bark();
        d.eat();
        d.sleep();
    }
}