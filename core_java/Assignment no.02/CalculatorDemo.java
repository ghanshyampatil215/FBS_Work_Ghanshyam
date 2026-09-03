class Calculator {

    // Addition
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }


    // Subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double subtract(int a, double b) {
        return a - b;
    }

    double subtract(double a, int b) {
        return a - b;
    }


    // Multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double multiply(int a, double b) {
        return a * b;
    }

    double multiply(double a, int b) {
        return a * b;
    }


    // Division
    int divide(int a, int b) {
        return a / b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double divide(int a, double b) {
        return a / b;
    }

    double divide(double a, int b) {
        return a / b;
    }
}


public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        // Addition
        System.out.println("Addition int-int: " + c.add(10, 20));
        System.out.println("Addition double-double: " + c.add(10.5, 20.5));
        System.out.println("Addition int-double: " + c.add(10, 20.5));
        System.out.println("Addition double-int: " + c.add(10.5, 20));

        // Subtraction
        System.out.println("Subtraction int-int: " + c.subtract(20, 10));
        System.out.println("Subtraction double-double: " + c.subtract(20.5, 10.5));
        System.out.println("Subtraction int-double: " + c.subtract(20, 10.5));
        System.out.println("Subtraction double-int: " + c.subtract(20.5, 10));

        // Multiplication
        System.out.println("Multiplication int-int: " + c.multiply(10, 20));
        System.out.println("Multiplication double-double: " + c.multiply(10.5, 2.0));
        System.out.println("Multiplication int-double: " + c.multiply(10, 2.5));
        System.out.println("Multiplication double-int: " + c.multiply(10.5, 2));

        // Division
        System.out.println("Division int-int: " + c.divide(20, 10));
        System.out.println("Division double-double: " + c.divide(20.0, 10.0));
        System.out.println("Division int-double: " + c.divide(20, 10.0));
        System.out.println("Division double-int: " + c.divide(20.0, 10));
    }
}