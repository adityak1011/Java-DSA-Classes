package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        Mustange myHorse = new Mustange();
        //Animal -> Horse -> Mustange

        // Chicken c = new Chicken();
        // h.eat();
        // c.walk();

        // System.out.println(h.color);
    }
}


abstract class Animal {
    String color;

    Animal() {
        // color = "brown";
        System.out.println("animal constructor is called");
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}


class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}


class Mustange extends Horse {
    Mustange() {
        System.out.println("Mustage constructor is called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}