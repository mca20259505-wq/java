class Q_3_2 {

    // 1. No parameter
    void test() {
        System.out.println("Hello, this method has no parameter");
    }

    // 2. One int parameter
    void test(int a) {
        System.out.println("This is method with one parameter: " + a);
    }

    // 3. Two int parameters
    void test(int a, int b) {
        System.out.println("Sum of two parameters: " + (a + b));
    }

    // 4. One double parameter
    void test(double b) {
        System.out.println("This is method with one double parameter: " + b);
    }

    public static void main(String[] args) {
        
        Q_3_2 obj = new Q_3_2();

        obj.test();        // No parameter
        obj.test(10);      // One int
        obj.test(2, 2);    // Two int
        obj.test(5.5);     // One double
    }
}
