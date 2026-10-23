public class Reference{
    int a,b;
    public Reference(int x,int y){
        this.a=x;
        this.b=y;
    }

    public Reference(){
        this.a=0;
        this.b=0;
    }

    void callbyVal(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    void callbyRef(Reference obj){
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
        System.out.println(" "+obj.a+" "+obj.b);
    }

    public static void main(String arg[]){
        Reference obj1=new Reference();
        int a=10,b=20;
        System.out.println(" "+a+" "+b);
        obj1.callbyVal(a,b);
        System.out.println(" "+a+" "+b);

        Reference obj2=new Reference(a,b);
        System.out.println(" "+a+" "+b);
        obj2.callbyRef(obj2);
        System.out.println(" "+a+" "+b);

    }

}