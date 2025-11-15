class Student{
    public String stuName;
    static String collegeName = "SRT college";
    Student(String name){
        stuName = name;
    }
    public void printInfo(){
        System.out.println("Student Name: "+stuName);    
        System.out.println("collegeName: "+collegeName);
    }
}
class Static_var {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println("The Value of X: "+x);
        Student student1 = new Student("Kabir");
        Student student2 = new Student("Rahul");
        student1.printInfo();
        student2.printInfo();
        // what if we change one student school name..
        student1.collegeName = "TMU college";
        student1.stuName = "Samir";
        student1.printInfo();
        student2.printInfo();
        // bcz the college name is static, it shared for whole class not only anyone obj...
    }   
}
