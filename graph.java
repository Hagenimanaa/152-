class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(10, 5);
        int result2 = calculator.subtract(10, 5);
        System.out.println("Addition result: " + result1);
        System.out.println("Subtraction result: " + result2);
    }
}