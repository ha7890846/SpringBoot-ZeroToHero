class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}   
public class Hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method from Animal
        dog.bark(); // Dog's own method

        Cat cat = new Cat();
        cat.eat();  // Inherited method from Animal
        cat.meow(); // Cat's own method
    }
}
