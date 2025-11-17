class Employee {
    int baseSalary = 50000;
    void geetings() {
        System.out.println("Hello, Employee!");
    }
}
class Programmmer extends Employee {
    void work() {
        System.out.println("Coding in Java");
    }
}
public class SinglelevelInhertance {
    public static void main(String[] args) {
        Programmmer p = new Programmmer();
        
        // Inherited method from Employee class
        p.geetings();

        // Method from Programmmer class
        p.work();

        // Inherited variable from Employee class
        System.out.println("Base Salary: " + p.baseSalary); 
    }    
}
