class Bank{
    private final String name;
    private int pin;
    private int Account;

    public void DataAccess( String n, int p , int acc){
        this.name=n;
        this.pin=p;
        this.Account=acc;

    }

    public void GetData(){
        System.out.println(name);
    }
}
 


class AccessModifier2{
    public  static void main( String args[]){
        Bank obj1=new Bank();
        // System.out.println(obj1.name);
        obj1.DataAccess("varish", 1436, 989760);
        obj1.GetData();
    }

}