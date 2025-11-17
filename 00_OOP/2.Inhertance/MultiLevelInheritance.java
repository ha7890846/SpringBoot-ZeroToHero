class Student{
    String colegeName = "ABC College";
    void attendClass() {
        System.out.println("Attending class...");
    }
}
class Engg extends Student {
    String department = "B.Tech";
    void studyEngineering() {
        System.out.println("Studying Engineering subjects...");
    }
}
class ComputerEngg extends Engg {
    String department = "Computer Engineering";
    void writeCode() {
        System.out.println("Writing code in Java");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        ComputerEngg engg1 = new ComputerEngg();
        // Inherited method from Student class
        engg1.attendClass();

        // Inherited method from Engg class
        engg1.studyEngineering();

        // Method from ComputerEngg class
        engg1.writeCode();

        // Inherited variable from Student class
        System.out.println("College Name: " + engg1.colegeName); 

        // Inherited variable from Engg class
        System.out.println("Department (Engg): " + engg1.department); 

        // Variable from ComputerEngg class
        System.out.println("Department (ComputerEngg): " + engg1.department);
    }
}
