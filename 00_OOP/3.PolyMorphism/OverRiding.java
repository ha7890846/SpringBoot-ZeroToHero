class Animal{
    void makeSound(){
        System.out.println("Each Animals make Sound.");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dogs Barks.");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cats do : Meaow Meaow.");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        
    }
}