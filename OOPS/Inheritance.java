package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
    }
}


//Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}


//Derived class / subclass

// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swim in water");
//     }
// }

// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal {
//     String breed;
// }


class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}