class Sample{
    static class Inner{
         void sayHello(){
            int x = 100;
            System.out.println("The value of x is: "+x);
        }
    }
}
class StaticInner {
    public static void main(String[] args) {
        System.out.println("welcome");
        // no need to create outer obj to access inner fields.

        //Sample obj = new Sample(); ❌

        // Instead of that create a direct obj of inneer class...
        Sample.Inner obj = new Sample.Inner();
        obj.sayHello();
    }
}
