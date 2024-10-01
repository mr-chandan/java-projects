// 15. Program to show the implementation of an interface.
interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }

    public void eat() {
        System.out.println("Cat eats fish");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();
    }
}
/* 
Output:
Dog barks
Dog eats bones
Cat meows
Cat eats fish
*/
