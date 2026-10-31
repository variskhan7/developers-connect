class SecoundClass{
    private  int age;
    public String name;


    void gitData( int a, String n)
    {
        this.age=a;
        this.name=n;
    }

    void modifyData(int a)
    {
        this.age=this.age+a;
    } 
    
    void displayData()
    {
        System.out.println("name"+ this.name);
        System.out.println("age"+ this.age);
    }
}


class FirstClass{
    public static void main(String [] args){
        SecoundClass obj = new SecoundClass();
        obj.name="varis khan";
        obj.age=20;
        obj.gitData(20,"varis khan");
        obj.modifyData(25);
    }
}