package calculator1;

public class Calculator {
    // four methods with manes "addition","subtraction","division" and "multiplication"
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition of" + a + "and" + b + "is:" + result);
    }

    public void sub(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of" + a + "and" + b + "is:" + result);
    }

    public void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multplication of " + a + " and " + b + " is: " + result);
    }

    public void div(int a, int b) {
        int result;
        if (b == 0) {
            result = 0;
        } else
            result = a / b;
        System.out.println("Division of" + a + " and " + b + " is: " + result);
    }

    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                add(a, b);
                break;
            case '-':
                sub(a, b);
                break;
            case '*':
                multiply(a, b);
                break;
            case '/':
                div(a, b);
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
    }
}