public class MethodOverloading {

    float area(int x, int y) {
        return x * y;
    }

    float area(float r) {
        return 3.14f * r * r;
    }

    double area(double l, double b) {
        return l * b;
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        System.out.println("Area of rectangle is " + obj.area(12, 15));

        System.out.println("Area of circle is " + obj.area(2.5f));

        System.out.println("Area of rectangle is " + obj.area(12.5, 10.0));
    }
}