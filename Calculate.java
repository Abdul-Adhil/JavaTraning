import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Circle
        System.out.println("Enter the radius of the circle:");
        int radius = scan.nextInt();

        Circle circle = new Circle(radius);
        System.out.println(circle.area());

        // Square
        System.out.println("Enter the area of square:");
        int area = scan.nextInt();

        Square square = new Square(area);
        System.out.println(square.area());

        // Triangle
        System.out.println("Enter the area of Triangle:");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();

        Triangle triangle = new Triangle(s1, s2, s3);
        System.out.println(triangle.area());

        // Sphere
        System.out.println("Enter the radius of the sphere:");
        int radi = scan.nextInt();
        Sphere sphere = new Sphere(radi);
        System.out.println(sphere.volume());

        // Cuboid
        System.out.println("Enter the radius of the cuboid:");
        int side = scan.nextInt();
        Cuboid cuboid = new Cuboid(side);
        System.out.println(cuboid.volume());

    }
}

interface CalcArea {
    double area();

}

interface CalcVol {

    double volume();
}

class Circle implements CalcArea {
    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    @Override
    public double area() {

        return 3.14 * this.radius * this.radius;
    }

}

class Square implements CalcArea {
    private int side;

    public Square(int a) {
        this.side = a;
    }

    @Override
    public double area() {
        return this.side * this.side;

    }

}

class Triangle implements CalcArea {

    private int side1;
    private int side2;
    private int side3;

    public Triangle(int s1, int s2, int s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    @Override
    public double area() {

        return (this.side1 + this.side2 + this.side3) / 2;

    }

}

class Sphere implements CalcVol {

    private int radi;

    public Sphere(int a) {
        this.radi = a;
    }

    @Override
    public double volume() {
        return (4 / 3) * 3.14 * this.radi * this.radi * this.radi;

    }
}

class Cuboid implements CalcVol {

    private int side;

    public Cuboid(int s) {
        this.side = s;
    }

    @Override
    public double volume() {

        return this.side * this.side * this.side;

    }
}
