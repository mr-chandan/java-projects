// 13. Create a Java class Student with attributes name, age, and rollNumber.
// Implement constructor overloading to initialize objects with different combinations of attributes.
class Student {
    String name;
    int age;
    int rollNumber;

    // Constructor with only name
    Student(String name) {
        this.name = name;
    }

    // Constructor with name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with all fields
    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Roll Number: " + rollNumber);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob", 20);
        Student student3 = new Student("Charlie", 22, 101);

        student1.display();
        student2.display();
        student3.display();
    }
}
/* 
Output:
Name: Alice, Age: 0, Roll Number: 0
Name: Bob, Age: 20, Roll Number: 0
Name: Charlie, Age: 22, Roll Number: 101
*/
