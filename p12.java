// 12. Create a class called Vehicle and a class called Car which extends Vehicle.
// Illustrate overloading and overriding using the relationship between the classes.
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    void speed(int maxSpeed) {
        System.out.println("Vehicle's max speed is " + maxSpeed);
    }
}

class Car extends Vehicle {
    // Overriding
    @Override
    void start() {
        System.out.println("Car is starting");
    }

    // Overloading
    void speed(int maxSpeed, int minSpeed) {
        System.out.println("Car's speed range is between " + minSpeed + " and " + maxSpeed);
    }
}

public class p12 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Calls overridden method
        myCar.speed(200); // Calls inherited method
        myCar.speed(200, 50); // Calls overloaded method
    }
}
/* 
Output:
Car is starting
Vehicle's max speed is 200
Car's speed range is between 50 and 200
*/
