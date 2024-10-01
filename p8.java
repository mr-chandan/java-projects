// 8. Java Program to create an abstract class named Shape with subclasses Rectangle, Triangle, and Circle.
abstract class Shape {
    int dim1, dim2;

    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (dim1 * dim2));
    }
}

class Triangle extends Shape {
    public Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * dim1 * dim1));
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Triangle tri = new Triangle(10, 8);
        Circle circle = new Circle(7);

        rect.printArea();
        tri.printArea();
        circle.printArea();
    }
}
/* 
Output:
Area of Rectangle: 50
Area of Triangle: 40.0
Area of Circle: 153.93804002589985
*/
