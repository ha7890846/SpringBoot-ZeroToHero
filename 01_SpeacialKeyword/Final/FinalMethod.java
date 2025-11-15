class Vehicle{
    final void printInfo(){
        System.out.println("Your car is Ford Mustang");
    }
    void engineStart(){
        System.out.println("Engine Started...");
    }
}
class Car extends Vehicle{
    //❌ Not allowed to overriden final method..
    // void printInfo(){
    //     System.out.println("your car is Alto");
    // }

    // non final method allowed overriden
    void engineStart(){
        System.out.println("Ignition Power Up... Woooh");
    }
}
class FinalMethod {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.engineStart();
        obj.printInfo();
    }
}
