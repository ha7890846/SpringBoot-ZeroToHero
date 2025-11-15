class Demo{
    public int x = 5;
    public void print(String objName){
        System.out.println(objName+" x value Print:"+x);
    }
}
public class ClassesExample {
    public static void main(String[] args){
        System.out.println("Hello Welcome");
        // creating obj for class Demo...
        Demo obj = new Demo();
        Demo obj2 = new Demo();
        // Accessig Attr of class..
        System.out.println("obj x:"+obj.x);
        System.out.println("obj2 x:"+obj2.x);
        // Accessing method of class ..
        obj.print("obj");
        obj2.print("obj2");
        // Modify Attr....
        obj.x = 10;
        obj2.x = 15;
        obj.print("obj");
        obj2.print("obj2");

        // Both obj contains their own separated copy of class.. 
    }
}