// 11. Explain the final keyword with inheritance.
class FinalClass {
    final void display() {
        System.out.println("This is a final method, it cannot be overridden.");
    }
}

class SubClassFinal extends FinalClass {
    // Attempting to override display() would result in a compile-time error.
    // void display() { } // This would cause an error.
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        SubClassFinal obj = new SubClassFinal();
        obj.display();
    }
}
/* 
Output:
This is a final method, it cannot be overridden.
*/
