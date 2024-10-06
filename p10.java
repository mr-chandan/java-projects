// 10. Java program to use ‘this’ keyword in inheritance.
class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Parent name: " + this.name);
    }
}

class Child extends Parent {
    String name;

    Child(String name, String parentName) {
        super(parentName);
        this.name = name;
    }

    void display() {
        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + super.name);
    }
}

public class p10 {
    public static void main(String[] args) {
        Child child = new Child("Mike", "John");
        child.display();
    }
}
/* 
Output:
Child name: Mike
Parent name: John
*/
