// 14. Write a Program to Display the Result of a Student Using Multi-Level Inheritance.
// Class One - To Receive Inputs, Class Two - To Process, Class Three - To Display the Output.
class InputClass {
    int marks1, marks2, marks3;

    void getMarks(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }
}

class ProcessClass extends InputClass {
    int total;
    float average;

    void calculate() {
        total = marks1 + marks2 + marks3;
        average = total / 3.0f;
    }
}

class OutputClass extends ProcessClass {
    void display() {
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class p14 {
    public static void main(String[] args) {
        OutputClass student = new OutputClass();
        student.getMarks(85, 90, 80);
        student.calculate();
        student.display();
    }
}
/* 
Output:
Total Marks: 255
Average Marks: 85.0
*/
