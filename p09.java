// 9. Program to access superclass constructor and variable.
class SuperClass {
    int num;

    SuperClass(int num) {
        this.num = num;
    }

    void display() {
        System.out.println("Super class number: " + num);
    }
}

class SubClass extends SuperClass {
    SubClass(int num) {
        super(num);
    }

    void show() {
        System.out.println("Sub class number: " + num);
    }
}

public class p09 {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100);
        obj.display();
        obj.show();
    }
}
/* 
Output:
Super class number: 100
Sub class number: 100
*/
