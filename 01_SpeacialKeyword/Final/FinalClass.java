final class Tractor{
    String tractorName = "Swaraj 444";
    void printTractor(){
        System.out.println("My tractor is: "+tractorName);
    }
}
// ❌ final class not extendable...
//class MiniTractor extends Tractor{}           // ❌Not allowed


public class FinalClass {
    public static void main(String[] args) {
        System.out.println("Welcome to Final class Example.");
        Tractor obj = new Tractor();
        obj.printTractor();
    }
}
