package calculate;

public class Calculator {
    public void addition(int a, int b) {

        System.out.println("addition of " + a + " and " + b + " is: " + (a + b));
    }
    public void subtraction(int a, int b) {
        System.out.println("subtraction " + a + " and " + b + " is:" + (a - b));
    }
    public void division(int a, int b) {
        System.out.println("division " + a + " and " + b + " is: " + (a / b));
    }
    public void multiplication(int a, int b) {
        System.out.println("multiplication " + a + " and " + b + " is: " + (a * b));

    }public void calculatorResult(int a, int b,char c) {
            if (c == '+') {
                addition(a, b);
            } else if (c == '-') {
                subtraction(a, b);
            } else if (c == '*') {
                multiplication(a, b);
            } else if (c == '/') {
                division(a, b);
            } else {
            System.out.println("Invalid symbol ");
        }
    }
}