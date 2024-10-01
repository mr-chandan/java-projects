// 17. Implementation of user-defined package.
package mypackage; // Define a package named mypackage

public class MyClass {
    public void display() {
        System.out.println("This is a method from a user-defined package.");
    }
}

// In another file or directory, you can import the package and use the class.
import mypackage.MyClass; // Import the user-defined package

public class TestPackage {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
/* 
Output:
This is a method from a user-defined package.
*/
