class FinalVar {
    public static void main(String[] args) {
        final float PI = 3.14f;
        // ❌ not allowed to change final var value...
        // PI = 4.145;
        System.out.println("The Value of PI:"+PI+" is constant.");
    }    
}
