class Person{
    String name;
    int age;


    void Person(String n, int a)
    {
        this.name=n;
        this.age=a;
    }

    void Display()
    {
        System.out.println("Your name is"+ name);
        System.out.println("Your age is"+ age);
    }
}

class Student extends Person{
    int rollNo;
    String course;

    void Student(String n, int a, int rn, String c)
    {
        super(name,age);
        this.rollNo=rn;
        this.course=c;
    }

    void Display()
    {
        super.Display();
        System.out.println("Your roll number is"+ rollNo);
        System.out.println("Your course is"+ course);
    }
}

class Research extends Student{
    String topic;
    String guide;
    
    void ResearchScholar(String n, int na, int rn, String c, String t, String guide)
    {
        super( name,age,rollNo,course);
        this.topic=t;
        this.guide=g;
    }

    void Display()
    {
        super.display();
        System.out.println("Your topic is"+ topic);
        System.out.println("Your guide is"+ guide);
    }

    public static void main(String a[]){
        Research obj1 =new Research ();
        obj1.name="varis khan";
        obj1.age=27;
        obj1.rollNo=10411;
        obj1.cource="BCA";
        obj1.topic="How to learn java";
        obj1.guide="please make your attendance ubove 75%";
    }
}
