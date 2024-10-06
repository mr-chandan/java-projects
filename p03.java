// 3. To check which one is executed first, static block or static method.
public class p03 {
    static {
        System.out.println("Static block is executed first.");
    }

    public static void staticMethod() {
        System.out.println("Static method is executed.");
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
/* 
Output:
Static block is executed first.
Static method is executed.
*/
