class Car{
    int modelYear;
    String modelName;
    Car(int year,String name){
        modelYear = year;
        modelName= name;
    }
    void printDetails(){
        System.out.println(modelName+modelYear);
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        // Creating obj using default constructor...
        Car myCar = new Car(0, null);
        myCar.modelName = "Wrangler";
        myCar.modelYear = 2024;
        // Creating obj using parameterized constructor..
        Car myCar2 = new Car(1969,"Mustang");
        myCar.printDetails();
        myCar2.printDetails();
    }
}