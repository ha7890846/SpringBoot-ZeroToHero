class Demo {
    static{
        System.out.println("hey I am Static block....");
    }
    void print(){
        System.out.println("Hello, I am Demo class");
    }
    
}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("I am Program Main Method..");
        // static block will be execute once..
        // whenever the class will be execute.
        Demo obj = new Demo();
        obj.print();
    }
}
