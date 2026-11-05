
class Counter {
    static int count = 0;
    String name;

    Counter(String name1,String name2,String name3) {
        this.name = name1;
        this.name = name2;
        this.name = name3;
        count++;
    }

    static void ShowCount() {
        System.out.println("Total: " + count);
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter("Varis", "prince bhai", "sateesh");
        obj1.ShowCount();
        obj1.ShowCount();
        obj1.ShowCount();
    }
}
