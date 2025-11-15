class Shape{
    static void sayHello(){
        System.out.println("Hey! I am Here....");
    }
    void sayBye(){
        System.out.println("Good Bye!");
    }
}
class Static_method {
    public static void main(String[] args) {
        //we can use static method without creating obj...
        Shape.sayHello();

        
        // while other method..
        // Shape.sayBye();     ❌
        Shape obj = new Shape();
        obj.sayBye();
    }        
}
