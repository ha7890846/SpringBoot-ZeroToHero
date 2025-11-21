class ProductCalculator {

    // Method with 2 integer parameters
    void Multiply(int a, int b)
    {
        System.out.println("The Product of int a,b is: "+a * b);
    }
    // With same name but with 2 double parameters
    void Multiply(double a, double b)
    {
        System.out.println("The Product of double a,b is: "+a * b);
    }
}
public class OverLoading
{
    public static void main(String[] args) {
        // creating Instance of Class...
        ProductCalculator obj = new ProductCalculator();
        // method work with int
        obj.Multiply(2, 4);
        // Same Method work with double also 
        obj.Multiply(5.5, 6.3);
    }
}